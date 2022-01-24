package ecommerce.checkout.controller;

import ecommerce.checkout.domain.Purchase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checkout")
public class ControllerCheckout {

    @PostMapping
    public Purchase purchase(@RequestBody Purchase purchase){
        return purchase;
    }

    @GetMapping
    int asdasdasxxxxxx(int a){
        return a;
    }
}
