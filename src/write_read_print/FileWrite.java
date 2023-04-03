package write_read_print;

import ingredient.Ingredient;
import recipe.Recipe;
import recipe.RecipeBase;

import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileWrite {

    //записывает List <recipe.Recipe> в файл recipe.bin

    public static void writeRecipeListToFile(List<Recipe> lrc) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get( "recipelist.bin")))) {
            oos.writeObject(new RecipeBase(lrc));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    /*
     * Получает в качестве  параметра List< Ingredient> и записывает в файл в обертке  Recipe.
     */
    public static void writeIngrListToFile(List<Ingredient> ingredient, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get(path)))) {
            oos.writeObject(new Recipe(0, ingredient));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}