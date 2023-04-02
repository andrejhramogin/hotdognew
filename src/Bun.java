import java.io.Serializable;

public class Bun extends Ingredient implements Serializable {

    private static final String BUN = "булочка";

    public Bun(int recipeQuantity, double costPrice, double retailPrice, int quantity) {
        super(BUN, recipeQuantity, costPrice, retailPrice, quantity);
    }
}
