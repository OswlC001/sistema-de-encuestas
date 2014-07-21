package backingBeans;

import entidades.Pregunta;
import entidades.Respuestas;
import entidades.Servicio;
import java.util.Iterator;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.component.UIInput;
import javax.faces.event.ValueChangeEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import sessionBeans.PreguntaFacade;
import sessionBeans.RespuestasFacade;

@Named(value = "respuestasController")
@ViewScoped
public class RespuestasController extends AbstractController<Respuestas> {

    @EJB
    private RespuestasFacade respuestasFacade;
    @EJB
    private PreguntaFacade preguntaFacade;

    List selectedServ;

    public RespuestasController() {
        // Inform the Abstract parent controller of the concrete Respuestas?cap_first Entity
        super(Respuestas.class);
    }

    public String pregunta(Long codigo) {
        Pregunta pregObj = preguntaFacade.find(codigo);
        if (pregObj != null) {
            return pregObj.getPrePregunta();
        } else {
            return "";
        }
    }
    
    public Long tipResp(Long codigo) {
        Pregunta pregObj = preguntaFacade.find(codigo);
        if (pregObj != null) {
            return pregObj.getTreCodigo();
        } else {
            return null;
        }
    }

    public List getSelectedServ() {
        return selectedServ;
    }

    public void setSelectedServ(List selectedServ) {
        this.selectedServ = selectedServ;
    }

    public String continuarEncuesta() {
        System.out.println(selectedServ.get(1).toString());
        return "/respuestas/Encuesta";
    }

    public String finalizarEncuesta() {
        return "/respuestas/FinalizarEncuesta";
    }

    public void cambioRespuesta(ValueChangeEvent event) {
        if (event != null) {
            Long value = (Long) event.getNewValue();
            Respuestas resp = (Respuestas) ((UIInput) event.getSource()).getAttributes().get("respuesta");
            resp.setOreCodigo(value);
            respuestasFacade.edit(resp);
        }
    }
}
