package love.you.lunaapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @GetMapping
    public String getTest(String name) {
        return "Hello " + name;
    }
}
