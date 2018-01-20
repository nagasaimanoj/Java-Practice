package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class GreetingController {
    public static void main(String[] args) {
        SpringApplication.run(GreetingController.class, args);
    }

    @RequestMapping("/greeting")
    public Student greeting() {
        Student std = new Student();
        std.setName("manisss");
        std.setRoll(987);
        return std;
    }

    @RequestMapping("/greet")
    public String test() {
        return "Hello World";
    };
}