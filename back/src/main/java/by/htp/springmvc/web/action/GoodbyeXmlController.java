package by.htp.springmvc.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/goodbye")
public class GoodbyeXmlController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
    public String printGoodbye(ModelMap model) {

        model.addAttribute("message", "Goodbye, XML!");
        return "startpages";
    }
}
