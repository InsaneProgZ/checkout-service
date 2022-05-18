package ecommerce.checkout.service;

import ecommerce.checkout.client.SaleClient;
import ecommerce.checkout.domain.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckoutService {

    @Autowired
    private SaleClient saleClient;

    public String processPurchase (Purchase purchase) {
        saleClient
        return "";
    }
}
