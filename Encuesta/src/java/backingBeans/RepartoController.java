package backingBeans;

import entidades.Reparto;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;

@Named(value = "repartoController")
@ViewScoped
public class RepartoController extends AbstractController<Reparto> {

    public RepartoController() {
        // Inform the Abstract parent controller of the concrete Reparto?cap_first Entity
        super(Reparto.class);
    }

}
