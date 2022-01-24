package ecommerce.checkout.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class ControllerCheckout {

    @GetMapping
    String test(){
        return "GetMapping";
    }
}
