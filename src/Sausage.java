import java.io.Serializable;

public class Sausage extends Ingredient implements Serializable {

    private static final String SAUSAGE = "сосиска";

    public Sausage (int recipeQuantity, double costPrice, double retailPrice, int quantity) {
        super(SAUSAGE, recipeQuantity, costPrice, retailPrice, quantity);
    }
}

