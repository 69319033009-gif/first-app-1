package th.ac.utc.first_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstAppcontroller {
    @GetMapping("/")
    public String home() {
        return "hello spring";
    }

    @GetMapping("*/about")
    public String about() {
        return "This is my FirstApp Version 0.1 ";
    }


}
