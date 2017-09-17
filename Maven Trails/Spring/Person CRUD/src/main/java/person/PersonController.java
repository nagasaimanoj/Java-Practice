package person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PersonController {

	@Autowired
	private CustomerRepository repo;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Hello(Model model) {
		model.addAttribute("list", repo.findAll());
		return "personX.jsp";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String additem(@ModelAttribute("person") Person p) {
		if (p.getName() != null && p.getAge() != 0)
			repo.save(p);
		return "redirect:/";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable("id") Integer id) {
		repo.delete(id);
		return "redirect:/";
	}
}