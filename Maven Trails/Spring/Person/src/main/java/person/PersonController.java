package person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PersonController {

	@Autowired
	private CustomerRepository cr;

	public void setCr(CustomerRepository cr) {
		this.cr = cr;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Hello(Model model) {
		model.addAttribute("list", cr.findAll());
		return "personX.jsp";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String additem(@ModelAttribute("person") Person p) {
		cr.save(p);
		return "redirect:/";
	}
}