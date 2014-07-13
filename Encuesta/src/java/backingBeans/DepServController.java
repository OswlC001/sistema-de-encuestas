package backingBeans;

import entidades.DepServ;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;

@Named(value = "depServController")
@ViewScoped
public class DepServController extends AbstractController<DepServ> {

    public DepServController() {
        // Inform the Abstract parent controller of the concrete DepServ?cap_first Entity
        super(DepServ.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setDepServPK(new entidades.DepServPK());
    }

}
