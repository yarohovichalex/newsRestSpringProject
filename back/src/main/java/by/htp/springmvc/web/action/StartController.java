package by.htp.springmvc.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StartController {

	// private NewsDao newsDao;
	// NewsDao newsDao = null;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) throws Exception {
		// System.out.println("contr");
		// newsDao.addNews(new News(4, 5, "aaa", "aaa", "aaaa", "aaaa"));
		return "index";
	}
}
