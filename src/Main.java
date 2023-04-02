import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Sausage sausage= new Sausage(1,5.5,7.5, 50);
        Bun bun = new Bun(1, 2.2, 3.2, 50);
        List<Ingredient> newList = new ArrayList<>();
        newList.add(bun);
        newList.add(sausage);

        WriteFile.writeIngrListToFile(newList);

        List<Ingredient> rc=   ReadFile.readRecipeFromFile();

        System.out.println(rc);
        }
    }
