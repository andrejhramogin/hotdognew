package ingredient;

import recipe.Method;

public class Bun extends Ingredient  {

    private static final String BUN = "булочка";

    public Bun(int recipeQuantity, double costPrice, double retailPrice, int quantity) {
        super(BUN, recipeQuantity, costPrice, retailPrice, quantity);
    }

    public Bun() {
        super(BUN);
    }

    public static Bun createIngredient() {
        Bun bun = new Bun();
        System.out.println("Enter the cost price:");
        bun.setCostPrice(Method.getDouble());
        System.out.println("Enter the retail price:");
        bun.setRetailPrice(Method.getDouble());
        System.out.println("Enter the reserve:");
        bun.setReserve(Method.getInteger());
        return bun;
    }
}
