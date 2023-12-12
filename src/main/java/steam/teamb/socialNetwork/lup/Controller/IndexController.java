package steam.teamb.socialNetwork.lup.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
    @GetMapping(value = "/posteo")
    public String index(){
        return "user-publicacion";
    }

    @GetMapping(value = "/home")
    public String home(){
        return "home-social-network";
    }
}
