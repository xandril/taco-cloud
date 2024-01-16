package sia.tacocloud.tacos.domain.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import sia.tacocloud.tacos.domain.Ingredient;
import sia.tacocloud.tacos.domain.IngredientType;

import java.util.HashMap;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {
    private final HashMap<String, Ingredient> ingredientMap = new HashMap<>();

    public IngredientByIdConverter() {
        ingredientMap.put("FLTO",
                new Ingredient("FLTO", "Flour Tortilla", IngredientType.WRAP));
        ingredientMap.put("COTO",
                new Ingredient("COTO", "Corn Tortilla", IngredientType.WRAP));
        ingredientMap.put("GRBF",
                new Ingredient("GRBF", "Ground Beef", IngredientType.PROTEIN));
        ingredientMap.put("CARN",
                new Ingredient("CARN", "Carnitas", IngredientType.PROTEIN));
        ingredientMap.put("TMTO",
                new Ingredient("TMTO", "Diced Tomatoes", IngredientType.VEGGIES));
        ingredientMap.put("LETC",
                new Ingredient("LETC", "Lettuce", IngredientType.VEGGIES));
        ingredientMap.put("CHED",
                new Ingredient("CHED", "Cheddar", IngredientType.CHEESE));
        ingredientMap.put("JACK",
                new Ingredient("JACK", "Monterrey Jack", IngredientType.CHEESE));
        ingredientMap.put("SLSA",
                new Ingredient("SLSA", "Salsa", IngredientType.SAUCE));
        ingredientMap.put("SRCR",
                new Ingredient("SRCR", "Sour Cream", IngredientType.SAUCE));
    }


    @Override
    public Ingredient convert(String id) {
        return ingredientMap.get(id);
    }

}
