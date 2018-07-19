package by.htp.springmvc.web.action;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/second")
public class SecondController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	   public ModelAndView helloPage(@RequestParam(required = false) String user, ModelMap model) 
	{
		  System.out.println("user sec");
	      model.addAttribute("message", "Hello!");
	      return new ModelAndView ("jqueryPage", "command", new User());
	 }
	@RequestMapping(value = "/helloAction", method = RequestMethod.GET)
	   public String helloaction(@RequestParam(required = false) String user, ModelMap model) 
	{
		  System.out.println("user sec");
	      model.addAttribute("message", user);
	      return "hello";
	 }
	
	@RequestMapping(value = "/seconduser", method = RequestMethod.GET)
	   public String printHello(@RequestParam(required = false) String user, ModelMap model) 
	{
		  System.out.println("user sec");
	      model.addAttribute("message", "user");
	      return "hello";
	 }
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	   public String printAdmin(@RequestParam(required = false) String user, ModelMap model) 
	{
		  System.out.println("admin sec ");
	      model.addAttribute("message", "adminsec");
	      return "hello";
	 }
	
	@RequestMapping(value = "/newUser", method = RequestMethod.GET)
	   public ModelAndView newUser() 
	{
		System.out.println("sdf");
	      return new ModelAndView("jqueryPage", "command", new User());
	 }
	
	
	@RequestMapping(value = "/checkPass", method = RequestMethod.GET)
	public @ResponseBody 
	String checkPassword(@RequestParam String pass) {
//		System.out.println(pass);
		return pass;
	}
	      
	
	@RequestMapping(value = "/def", method = RequestMethod.GET)
	   public String printSl(@RequestParam(required = false) String user, ModelMap model) 
	{
		  System.out.println("/ sec");
	      model.addAttribute("message", "sec//");
	      return "hello";
	 }
}
