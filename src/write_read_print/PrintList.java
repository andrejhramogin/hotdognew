package write_read_print;

import ingredient.Ingredient;
import order.Order;
import recipe.Recipe;
import uienum.UiMessage;

import java.util.List;

public class PrintList {

//Выводит лист заказов (List<Order>)
    public static void printOrderList(List<Order>list){
        if (list.isEmpty()) {
            System.out.println(UiMessage.EMPTY_LIST.getMessage());
        } else {
            list.forEach(PrintList::printOrder);
        }
    }

    //Выводит заказ (order)
    public static void printOrder(Order order){
        System.out.println("Order #"+ order.getSequenceNumber() + " : ");
        printRecipeList(order.getRecipeList());
    }

    //Выводит лист рецептов List<Recipe>
    public static void printRecipeList(List<Recipe> list) {
        if (list.isEmpty()) {
            System.out.println(UiMessage.EMPTY_LIST.getMessage());
        } else {
            list.forEach(PrintList::printRecipeIngrList);
            System.out.println();
        }
    }

    //Выводит порядковый номер рецепта в листе, весь текущий рецепт, количество хотдогов по данному рецепту.
    public static void printRecipeIngrList(Recipe recipe) {
        System.out.print(recipe.getSequenceNumber() + " : ");
        printIngredientList(recipe.getList());
        System.out.println("Hot dog quantity: " + recipe.getQuantityHotDog());
    }

//Выводит поля Name, RecipeQuantity для ингридиента
    public static void printRecipeIngredient(Ingredient i) {
        System.out.println(UiMessage.NAME.getMessage() + " " + i.getName() +
                "\t" + UiMessage.QUANTITY.getMessage() + " " + i.getRecipeQuantity());
    }

    //Выводит рецепт (List<Ingredient>) с полями Name,  RecipeQuantity.
    public static void printRecipeIngrList(List<Ingredient> list) {
        if (list.isEmpty()) {
            System.out.println(UiMessage.EMPTY_LIST.getMessage());
        } else {
            list.forEach(PrintList::printRecipeIngredient);
        }
    }

    //Выводит поля ингридиента (кроме количества в хотдоге).
    public static void printIngredient(Ingredient i) {
        System.out.println( UiMessage.NAME.getMessage() + " " + i.getName() +
                "\t " + UiMessage.QUANTITY.getMessage() + " " + i.getRecipeQuantity() +
                "\t " + UiMessage.COST_PRICE.getMessage() + " " + i.getCostPrice() +
                "\t " + UiMessage.RETAIL_PRICE.getMessage() + " " + i.getRetailPrice() +
                "\t " + UiMessage.RESERVE.getMessage() + " " + i.getReserve());
    }


    //Выводит List<Ingredient> с полями ингридиента (кроме количества в хотдоге).
    public static void printIngredientList(List<Ingredient> list) {
        if (list.isEmpty()) {
            System.out.println(UiMessage.EMPTY_LIST.getMessage());
        } else {
            list.forEach(PrintList::printIngredient);
        }
    }

    //выводит список всех ингридиентов из файла ingredientlist.bin (все доступные ингридиенты)
    public static void printFileIngredientlist() {
        PrintList.printIngredientList(FileRead.readIngredientList(UiMessage.INGREDIENT_LIST.getMessage()));
    }
}
