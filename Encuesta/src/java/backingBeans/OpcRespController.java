package backingBeans;

import entidades.OpcResp;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import sessionBeans.OpcRespFacade;

@Named(value = "opcRespController")
@ViewScoped
public class OpcRespController extends AbstractController<OpcResp> {

    @EJB
    private OpcRespFacade opcRespFacade;

    List<OpcResp> itemsXPreg;

    public OpcRespController() {
        // Inform the Abstract parent controller of the concrete OpcResp?cap_first Entity
        super(OpcResp.class);
    }

    public List<OpcResp> getItemsXPreg(Long treCodigo) {
        itemsXPreg = opcRespFacade.findOpXPreg(treCodigo);
        return itemsXPreg;
    }

}
