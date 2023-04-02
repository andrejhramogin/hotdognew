
public class PrintList {
    public static void printIngredient(Ingredient i){
        System.out.println("Name: " + i.getName() +
                " Cost price: " + i.getCostPrice() +
                " retail price: " + i.getRetailPrice() +
                " quantity: " + i.getReserve());
    }
}
