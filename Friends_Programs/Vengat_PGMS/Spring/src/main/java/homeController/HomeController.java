package homeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import model.Data;
import service.DataService;

//controller class
@Controller
public class HomeController {

	private DataService service1;

	@Autowired
	@Qualifier(value = "servicebean")
	public void setService1(DataService service1) {
		this.service1 = service1;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String reg() {
		return "register";
	}

	//display of user data
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String user(@Validated Data data, Model model) {
		System.out.println("User Page Requested");
		model.addAttribute("name", data.getName());
		model.addAttribute("phone", data.getPhno());
		return "user";
	}

	// register the user data
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registration(@Validated Data data, Model model) {
		System.out.println("register page");
		this.service1.add(data);
		model.addAttribute("name", data.getName());
		model.addAttribute("phone", data.getPhno());
		return "user";
	}

	//Show the data from the database
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public String show(Data d, Model model) {
		System.out.println("show process working");
		model.addAttribute("show_data", this.service1.show(d));
		return "register";
	}

	// Delete the data from database

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(Data d, Model model) {
		System.out.println("Delete process working");
		this.service1.delete(d);
		return "register";
	}
}