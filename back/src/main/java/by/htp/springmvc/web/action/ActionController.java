package by.htp.springmvc.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

class User {
	private String name;
	private String pass;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public User() {
		super();
	}

	public User(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}

}

@Controller
@RequestMapping(value = "/login")
public class ActionController {

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView common() {
		return new ModelAndView("loginPage", "user", new User());
	}

	@RequestMapping(value = "/checkUser", method = RequestMethod.POST)
	public ModelAndView printAdmin(@ModelAttribute("user") User user) {
		System.out.println(user.getName());
		return new ModelAndView("userinfo", "user", user);

		// ModelAndView modelAndView = new ModelAndView();
		// modelAndView.setViewName("userinfo");
		// modelAndView.addObject("user", user);
		// return modelAndView;
	}

	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public String printSl(@RequestParam(required = false) String user, ModelMap model) {
		System.out.println("/");
		model.addAttribute("message", "//");
		return "hello";
	}
}
