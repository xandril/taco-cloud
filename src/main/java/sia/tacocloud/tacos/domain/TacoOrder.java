package sia.tacocloud.tacos.domain;

import lombok.Data;

import java.util.ArrayList;

@Data
public class TacoOrder {
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

    private ArrayList<Taco> tacos;

    public void addTaco(Taco taco) {
        tacos.add(taco);
    }
}
