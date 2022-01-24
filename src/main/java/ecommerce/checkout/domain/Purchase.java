package ecommerce.checkout.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Purchase {
@JsonProperty("productList")
    private List<Product> productList;
    @JsonProperty("paymentMethod")
    private PaymentMethod paymentMethod;
}
