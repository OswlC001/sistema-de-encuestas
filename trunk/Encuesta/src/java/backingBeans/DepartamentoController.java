package backingBeans;

import entidades.Departamento;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;

@Named(value = "departamentoController")
@ViewScoped
public class DepartamentoController extends AbstractController<Departamento> {

    public DepartamentoController() {
        // Inform the Abstract parent controller of the concrete Departamento?cap_first Entity
        super(Departamento.class);
    }

}
