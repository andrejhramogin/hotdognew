package write_read_print;

import ingredient.Ingredient;
import uienum.UiMessage;

import java.util.List;

public class PrintList {

    public static void printRecipeIngredient(Ingredient i){
        System.out.println(UiMessage.NAME + i.getName() +
                UiMessage.QUANTITY + i.getRecipeQuantity());
    }

    public static void printRecipe(List<Ingredient> list){
        if(list.isEmpty()){
            System.out.println(UiMessage.EMPTY_LIST);
        }else{
            list.forEach(PrintList::printRecipeIngredient);
        }
    }

    public static void printIngredient(Ingredient i){
        System.out.println(UiMessage.NAME + i.getName() +
                "\t" + UiMessage.COST_PRICE + i.getCostPrice() +
                "\t" + UiMessage.RETAIL_PRICE + i.getRetailPrice() +
                "\t" + UiMessage.RESERVE + i.getReserve());
    }

    public static void printIngredientList(List<Ingredient> list){
        if(list.isEmpty()){
            System.out.println(UiMessage.EMPTY_LIST);
        }else{
            list.forEach(PrintList::printIngredient);
        }
    }
}
