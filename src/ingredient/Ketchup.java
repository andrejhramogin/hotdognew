package ingredient;

import recipe.Method;

public class Ketchup extends Ingredient {

    private static final String KETCHUP = "кетчуп";
    public Ketchup (int recipeQuantity, double costPrice, double retailPrice, int quantity){
        super (KETCHUP, recipeQuantity, costPrice, retailPrice, quantity);
    }

    public Ketchup(){
        super(KETCHUP);
    }

    public static Ketchup createIngredient() {
        Ketchup ketchup = new Ketchup();
        System.out.println("Enter the cost price:");
        ketchup.setCostPrice(Method.getDouble());
        System.out.println("Enter the retail price:");
        ketchup.setRetailPrice(Method.getDouble());
        System.out.println("Enter the reserve:");
        ketchup.setReserve(Method.getInteger());
        return ketchup;
    }

}
