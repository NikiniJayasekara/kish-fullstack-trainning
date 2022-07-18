package lk.codelab.rentcloud.rentui.Controller;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableOAuth2Sso
public class UIController {


    @RequestMapping(value="/")
    public String loadUi(){

        return "home";
    }

    @RequestMapping(value="/secure")
    public String loadSecureUi(){

        return "secure";
    }
}
