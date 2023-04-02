package ingredient;

import recipe.Method;

public class Sausage extends Ingredient {

    private static final String SAUSAGE = "сосиска";

    public Sausage (int recipeQuantity, double costPrice, double retailPrice, int quantity) {
        super(SAUSAGE, recipeQuantity, costPrice, retailPrice, quantity);
    }

    public Sausage() {
        super(SAUSAGE);
    }

    public static Sausage createIngredient() {
        Sausage sos = new Sausage();
        System.out.println("Enter the cost price:");
        sos.setCostPrice(Method.getDouble());
        System.out.println("Enter the retail price:");
        sos.setRetailPrice(Method.getDouble());
        System.out.println("Enter the reserve:");
        sos.setReserve(Method.getInteger());
        return sos;
    }
}