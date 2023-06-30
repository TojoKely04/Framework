package modele;

import etu2043.framework.ModelView;
import etu2043.framework.annotation.Scope;
import etu2043.framework.annotation.Url;

/**
 *
 * @author hp
 */
@Scope(value="Singleton")
public class Login {
    String userName;
    String password;
    
    @Url(lien="sign_up")
    public ModelView seConnecter(){
        ModelView mv = new ModelView();
        mv.addAuth("is_connected", true);
        mv.addAuth("profil", this.getUserName());
        mv.setView("index.jsp");
        return mv;
    }
    @Url(lien="log_out")
    public ModelView seDeconnecter(){
        ModelView mv = new ModelView();
        mv.setInvalidateSession(true);
        mv.setView("index.jsp");
        return mv;
    }
    @Url(lien="delete_profil")
    public ModelView deleteProfil(String profil){
        ModelView mv = new ModelView();
        mv.addRemoveSession("profil");
        mv.setView("index.jsp");
        return mv;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
