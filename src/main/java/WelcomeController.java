import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WelcomeController {

    @RequestMapping ( "/w")
    public static String wel(){
        return "Wrelkome";
    }
}
