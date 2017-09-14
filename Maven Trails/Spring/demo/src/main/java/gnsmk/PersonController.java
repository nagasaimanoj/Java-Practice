package gnsmk;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Controller
@SpringBootApplication

public class PersonController {
	public static void main(String[] args) {
		SpringApplication.run(PersonController.class, args);
	}

	@RequestMapping("/")
	public String Hello(Model model) {
		List<Person> li = new ArrayList<Person>();
		li.add(new Person("manoj", 99));
		li.add(new Person("kosu", 199));
		li.add(new Person("kausi", 299));
		model.addAttribute("list", li);
		model.addAttribute("list2", li);
		return "personX.jsp";
	}
}