import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {

    /** Считывает из файла и возвращает объект Base (List<Recipe>)
     */
    public static RecipeBase readBaseFromFile(){
        RecipeBase rb = new RecipeBase();
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("recipe.bin")))){

            rb = (RecipeBase) ois.readObject();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return rb;
    }

    /**
     *Считывает из файла объект Recipe и возвращает содержащийся в нем List<Ingredient>
     */
    public static List<Ingredient> readRecipeFromFile(){
        Recipe rc = new Recipe();
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("recipe.bin")))){

            rc = (Recipe) ois.readObject();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return rc.getList();
    }
}
