package write_read_print;

import ingredient.Ingredient;
import order.Order;
import order.OrderBase;
import recipe.Recipe;
import recipe.RecipeBase;
import uienum.UiMessage;

import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileRead {

    /*
     * Считывает из файла RecipeBase и возвращает объект Base (List<Recipe>) - список рецептов.
     */
    public static List<Recipe> readRecipeList() {
        RecipeBase rb = new RecipeBase();
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get(UiMessage.RECIPE_LIST.getMessage())))) {

            rb = (RecipeBase) ois.readObject();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rb.getList();
    }

    /*
     *Считывает из файла объект Recipe и возвращает содержащийся в нем List< Ingredient> - список ингридиентов
     */
    public static List<Ingredient> readIngredientList(String path) {
        Recipe rc = new Recipe();
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get(path)))) {
            rc = (Recipe) ois.readObject();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rc.getList();
    }

    //Считывет из файла OrderBase и возвращает список заказов (List<Order>).
    public static List<Order> readOrderList() {
        OrderBase ob = new OrderBase();
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("orderlist.bin")))) {
            ob = (OrderBase) ois.readObject();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ob.getOrderList();
    }
}
