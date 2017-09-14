package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public Student greeting() {
        Student std = new Student();
        std.setName("manisss");
        std.setRoll(987);
        return std;
    }

    @RequestMapping("/greet")
    public String test()
    {
        return "Hello World";
    };
}