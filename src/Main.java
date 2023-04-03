import recipe.Method;
import recipe.Recipe;
import uienum.UiMessage;
import write_read_print.FileRead;
import write_read_print.FileWrite;
import write_read_print.PrintList;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        PrintList.printFileIngredientlist();
//        Method.addIngrToIngredientlist();
//        Method.createRecipe(FileRead.readIngredientList(UiMessage.INGREDIENT_LIST.getMessage()));


//        List<Recipe>list = FileRead.readBase();
//        list.remove(2);
//        FileWrite.writeRecipeListToFile(list);
        PrintList.printRecipeList(FileRead.readBase());
    }
}
