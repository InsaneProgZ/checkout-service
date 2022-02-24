package ecommerce.checkout.controller;

import ecommerce.checkout.domain.Purchase;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checkout")
public class ControllerCheckout {

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void purchase(@RequestBody Purchase purchase){

    }

}
