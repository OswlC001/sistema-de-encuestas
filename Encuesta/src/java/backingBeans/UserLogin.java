package backingBeans;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import sessionBeans.UsuarioFacade;

@ManagedBean
public class UserLogin {

    @EJB
    private UsuarioFacade usuarioFacade;
    FacesContext context = javax.faces.context.FacesContext.getCurrentInstance();
    HttpSession session = (HttpSession) context.getExternalContext().getSession(false);

    private String username;
    private String password;
    private boolean loggedInSession = false;

   
    public boolean isLoggedInSession() {
        if (session.getAttribute("loggedIn") == null) {
            loggedInSession = false;
        } else {
            loggedInSession = (Boolean) session.getAttribute("loggedIn");
        }
        return loggedInSession;
    }

    public void setLoggedInSession(boolean loggedIn) {
        this.loggedInSession = loggedIn;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login() {
        FacesMessage message;
        Boolean loggedIn = false;
        String dir="";

        if (username != null && password != null && usuarioFacade.isLoginValido(username, password)) {
            loggedIn = true;            
            //dir="/index";
            dir="/servicio/selectServ";
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenido", username);
        } else {
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Usuario/Password Incorrecto");
        }

        FacesContext.getCurrentInstance().addMessage(null, message);
        session.setAttribute("loggedIn", loggedIn);
        return dir;
    }
}
