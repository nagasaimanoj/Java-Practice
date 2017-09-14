package gnsmk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
import java.util.ArrayList;

@Controller
@SpringBootApplication

public class PersonController {
	private static List<Person> personList = new ArrayList<Person>();

	public static void main(String[] args) {
		SpringApplication.run(PersonController.class, args);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Hello(Model model) {
		model.addAttribute("list", personList);
		return "personX.jsp";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String additem(@ModelAttribute("person") Person p) {
		personList.add(p);
		return "redirect:/";
	}
}