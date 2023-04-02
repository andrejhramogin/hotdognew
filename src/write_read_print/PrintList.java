package write_read_print;

import ingredient.Ingredient;

import java.util.List;

public class PrintList {

    public static void printRecipeIngredient(Ingredient i){
        System.out.println("Name: " + i.getName() +
                " Quantity: " + i.getRecipeQuantity());
    }

    public static void printRecipe(List<Ingredient> list){
        if(list.isEmpty()){
            System.out.println("List is empty.");
        }else{
            list.forEach(PrintList::printRecipeIngredient);
        }
    }

    public static void printIngredient(Ingredient i){
        System.out.println("Name: " + i.getName() +
                "\tCost price: " + i.getCostPrice() +
                "\tRetail price: " + i.getRetailPrice() +
                "\tReserve: " + i.getReserve());
    }

    public static void printIngredientList(List<Ingredient> list){
        if(list.isEmpty()){
            System.out.println("List is empty.");
        }else{
            list.forEach(PrintList::printIngredient);
        }
    }
}
