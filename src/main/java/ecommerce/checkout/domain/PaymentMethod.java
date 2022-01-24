package ecommerce.checkout.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PaymentMethod {
    @JsonProperty("value")
    private Long value;
    @JsonProperty("type")
    private String type;
}
