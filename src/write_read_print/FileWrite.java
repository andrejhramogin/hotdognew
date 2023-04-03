package write_read_print;

import ingredient.Ingredient;
import order.Order;
import order.OrderBase;
import recipe.Recipe;
import recipe.RecipeBase;

import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileWrite {

    //записывает List<Recipe> в файл recipelist.bin

    public static void writeRecipeListToFile(List<Recipe> recipeList) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get( "recipelist.bin")))) {
            oos.writeObject(new RecipeBase(recipeList));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Получает параметр List<Ingredient> и записывает в файл "ingredientlist.bin".
     */
    public static void writeIngrListToFile(List<Ingredient> ingredientList, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get(path)))) {
            oos.writeObject(new Recipe(0, ingredientList,0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


//    Получает параметр List<Order> (список заказов) и запмсывает в файл "orderlist.bin".
    public static void writeOrderList (List<Order>orderList){
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("orderlist.bin")))){
            oos.writeObject(new OrderBase(orderList));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
