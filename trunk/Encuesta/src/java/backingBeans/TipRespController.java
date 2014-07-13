package backingBeans;

import entidades.TipResp;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;

@Named(value = "tipRespController")
@ViewScoped
public class TipRespController extends AbstractController<TipResp> {

    public TipRespController() {
        // Inform the Abstract parent controller of the concrete TipResp?cap_first Entity
        super(TipResp.class);
    }

}
