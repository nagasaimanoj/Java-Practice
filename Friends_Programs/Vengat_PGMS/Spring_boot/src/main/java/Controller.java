import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@RestController
public class Controller {

  @Autowired
  private StudentRepository srt;

  // Show the data from the database (MYSQL)
  @RequestMapping(value = "/show", method = RequestMethod.GET)
  public List<Student> show_data() {
    return srt.findAll();
  }

  //Add the data into the database (MYSQL)
  @RequestMapping(value = "/register", method = RequestMethod.GET)
  public Student register(Student std) {
    return srt.saveAndFlush(std);
  }

  //Filter the data
  @RequestMapping(value = "filter", method = RequestMethod.GET)
  public List<Student> getdata(@RequestParam("department") String dept, @RequestParam("rollno") String id) {
    return srt.getbydept(dept, id);
  }
}