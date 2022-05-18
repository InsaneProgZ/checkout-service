package ecommerce.checkout.client;

import ecommerce.checkout.domain.PaymentMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class SaleClient {

    @Autowired
    private RestTemplate restTemplate;

    public String createNotification() {
        restTemplate.postForEntity(URI.create("http://127.0.0.1:8081/sale/valid"), new PaymentMethod(), PaymentMethod.class);
    }
}
