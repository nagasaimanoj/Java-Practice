package gnsmk;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.List;

@Controller
@SpringBootApplication
public class PersonController {
	List<Person> allPersons = new ArrayList<Person>();

	public static void main(String[] args) {
		SpringApplication.run(PersonController.class, args);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Hello(Model model) {
		model.addAttribute("list", allPersons);
		return "personX.jsp";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String additem(@ModelAttribute("person") Person p) {
		allPersons.add(p);
		return "redirect:/";
	}
}