package budgetWise.com.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userCOntroller {

    @GetMapping("/msg")
    public String getmsg(){
        return "Welcome to New SpringBoot project powered by Ibad Bargir";
    }
}
