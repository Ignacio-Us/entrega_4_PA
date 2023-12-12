package steam.teamb.socialNetwork.lup.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = "/home")
    public String verHome(){
        return "home-social-network";
    }
}
