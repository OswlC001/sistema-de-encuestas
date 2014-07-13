package backingBeans;

import entidades.Encuesta;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;

@Named(value = "encuestaController")
@ViewScoped
public class EncuestaController extends AbstractController<Encuesta> {

    public EncuestaController() {
        // Inform the Abstract parent controller of the concrete Encuesta?cap_first Entity
        super(Encuesta.class);
    }

}
