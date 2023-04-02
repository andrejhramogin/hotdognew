import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WriteFile {

    //записывает List <Recipe> в файл recipe.bin

//    public static void writeToFile(List<ComicBook> lcb, String path) {
//        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get(path)))) {
//            Base baseList = new Base(lcb);
//            oos.writeObject(baseList);
//            oos.flush();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }

    public static void writeRecipeListToFile(List<Recipe> lrc) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get( "recipe.bin")))) {
            oos.writeObject(new RecipeBase(lrc));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeIngrListToFile(List<Ingredient> ingredient) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get( "recipe.bin")))) {
            oos.writeObject(new Recipe(ingredient));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}