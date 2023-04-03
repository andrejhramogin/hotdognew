package write_read_print;

import ingredient.Ingredient;
import recipe.Recipe;
import recipe.RecipeBase;
import uienum.UiMessage;

import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileRead {

    /*
     * Считывает из файла и возвращает объект Base (List<Recipe>)
     */
    public static List<Recipe> readBase(){
        RecipeBase rb = new RecipeBase();
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get(UiMessage.RECIPE_LIST.getMessage())))){

            rb = (RecipeBase) ois.readObject();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return rb.getList();
    }

    /*
     *Считывает из файла объект  Recipe и возвращает содержащийся в нем List< Ingredient>
     */
    public static List<Ingredient> readIngredientList(String path){
        Recipe rc = new Recipe();
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get(path)))){

            rc = (Recipe) ois.readObject();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return rc.getList();
    }
}
