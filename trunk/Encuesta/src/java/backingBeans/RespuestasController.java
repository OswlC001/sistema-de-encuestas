package backingBeans;

import entidades.EncUsuario;
import entidades.Pregunta;
import entidades.Respuestas;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import sessionBeans.EncUsuarioFacade;
import sessionBeans.PreguntaFacade;
import sessionBeans.RespuestasFacade;

@Named(value = "respuestasController")
@ViewScoped
public class RespuestasController extends AbstractController<Respuestas> {
    
    @EJB
    private EncUsuarioFacade encUsuarioFacade;

    @EJB
    private RespuestasFacade respuestasFacade;

    @EJB
    private PreguntaFacade preguntaFacade;     
    
    List<String> selectedServ;
    List<Respuestas> itemsRespuesta;
    Date fecha = new Date();
    Long encUsu;
    HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);

    public RespuestasController() {
        // Inform the Abstract parent controller of the concrete Respuestas?cap_first Entity
        super(Respuestas.class);        
    }

    public List<Respuestas> getItemsRespuesta() {
        encUsu = (Long) session.getAttribute("encUsu");
        itemsRespuesta = respuestasFacade.getItemsRespuestas(encUsu);
        return itemsRespuesta;
    }

    public void setItemsRespuesta(List<Respuestas> itemsRespuesta) {
        this.itemsRespuesta = itemsRespuesta;
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

    public List<String> getSelectedServ() {
        return selectedServ;
    }

    public void setSelectedServ(List<String> selectedServ) {
        this.selectedServ = selectedServ;
    }

    public String continuarEncuesta() {
        Long servId;
        Long usuario;  
        Long encuesta;
        usuario = (Long) session.getAttribute("usIdE");
        //Esto debe cambiar cuando haya un tipo diferente de encuesta
        //Faltante
        encuesta = (long) 1;
        EncUsuario encUsuario = new EncUsuario();
        encUsuario.setEncCodigo(encuesta);
        encUsuario.setUsrId(usuario);
        encUsuario.setEusFecha(fecha);
        encUsuarioFacade.create(encUsuario);
        for (String serv : selectedServ) {
            servId = Long.parseLong(serv);
            List<Pregunta> preguntas = preguntaFacade.getPreguntas(servId);
            for (Pregunta pregunta : preguntas) { 
                Respuestas resuesta = new Respuestas();
                resuesta.setPreCodigo(pregunta.getPreCodigo());
                resuesta.setEusCodigo(encUsuario.getEusCodigo());                
                respuestasFacade.create(resuesta);
            }
        }
        encUsu = encUsuario.getEusCodigo();
        session.setAttribute("encUsu", encUsu);
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
