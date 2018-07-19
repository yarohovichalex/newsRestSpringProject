package by.htp.springmvc.web.action;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/aa")
public class DefaultActionController {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	   public String printHello(@RequestParam(required = false) String user, ModelMap model) 
	{
		System.out.println("hibernate");
//		  ModelDaoHibernateImpl cd= new ModelDaoHibernateImpl();
//		  cd.search(1);
	      model.addAttribute("message", user);
	      System.out.println(user);
	      return "hello";
	 }
}
