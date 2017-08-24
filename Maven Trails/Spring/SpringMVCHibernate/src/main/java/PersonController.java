@org.springframework.stereotype.Controller
public class PersonController {
	private PersonService personService;
	@org.springframework.beans.factory.annotation.Autowired(required = true)
	@org.springframework.beans.factory.annotation.Qualifier(value = "personService")
	public void setPersonService(PersonService ps) {
		this.personService = ps;
	}

	@org.springframework.web.bind.annotation.RequestMapping(value = "/persons", method = org.springframework.web.bind.annotation.RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("person", new Person());
		model.addAttribute("listPersons", this.personService.listPersons());
		return "person";
	}

	@org.springframework.web.bind.annotation.RequestMapping(value = "/person/add", method = org.springframework.web.bind.annotation.RequestMethod.POST)
	public String addPerson(@org.springframework.web.bind.annotation.ModelAttribute("person") Person p) {
		if (p.getId() == 0) {
			this.personService.addPerson(p);
		} else {
			this.personService.updatePerson(p);
		}
		return "redirect:/persons";
	}

	@org.springframework.web.bind.annotation.RequestMapping("/remove/{id}")
	public String removePerson(@org.springframework.web.bind.annotation.PathVariable("id") int id) {
		this.personService.removePerson(id);
		return "redirect:/persons";
	}
	
	@org.springframework.web.bind.annotation.RequestMapping("/edit/{id}")
	public String editPerson(@org.springframework.web.bind.annotation.PathVariable("id") int id, Model model) {
		model.addAttribute("person", this.personService.getPersonById(id));
		model.addAttribute("listPersons", this.personService.listPersons());
		return "person";
	}
}