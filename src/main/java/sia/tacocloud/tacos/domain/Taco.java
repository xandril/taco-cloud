package sia.tacocloud.tacos.domain;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Taco {
    private String name;
    private ArrayList<Ingredient> ingredients;

}
