package backingBeans;

import entidades.Pregunta;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;

@Named(value = "preguntaController")
@ViewScoped
public class PreguntaController extends AbstractController<Pregunta> {

    public PreguntaController() {
        // Inform the Abstract parent controller of the concrete Pregunta?cap_first Entity
        super(Pregunta.class);
    }

}
