package de.thb.pizzaPronto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {
    @GetMapping("/string")
    String all() {
        return "Hallo";
    }
}
