package backingBeans;

import entidades.OpcResp;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;

@Named(value = "opcRespController")
@ViewScoped
public class OpcRespController extends AbstractController<OpcResp> {

    public OpcRespController() {
        // Inform the Abstract parent controller of the concrete OpcResp?cap_first Entity
        super(OpcResp.class);
    }

}
