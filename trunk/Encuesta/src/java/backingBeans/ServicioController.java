package backingBeans;

import entidades.Servicio;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;

@Named(value = "servicioController")
@ViewScoped
public class ServicioController extends AbstractController<Servicio> {

    public ServicioController() {
        // Inform the Abstract parent controller of the concrete Servicio?cap_first Entity
        super(Servicio.class);
    }

}
