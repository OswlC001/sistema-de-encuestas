package converter;

import entidades.DepServ;
import sessionBeans.DepServFacade;
import backingBeans.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "depServConverter")
public class DepServConverter implements Converter {

    @Inject
    private DepServFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    entidades.DepServPK getKey(String value) {
        entidades.DepServPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new entidades.DepServPK();
        key.setServId(Long.parseLong(values[0]));
        key.setDepId(Long.parseLong(values[1]));
        return key;
    }

    String getStringKey(entidades.DepServPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getServId());
        sb.append(SEPARATOR);
        sb.append(value.getDepId());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof DepServ) {
            DepServ o = (DepServ) object;
            return getStringKey(o.getDepServPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), DepServ.class.getName()});
            return null;
        }
    }

}
