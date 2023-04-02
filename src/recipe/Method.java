package recipe;

import ingredient.Bun;
import ingredient.Ingredient;
import ingredient.Ketchup;
import ingredient.Sausage;
import write_read_print.FileRead;
import write_read_print.FileWrite;
import write_read_print.PrintList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Method {

    public static Scanner scanner = new Scanner(System.in);

    public static String getString() {
        return scanner.nextLine();
    }

    public static int getInteger() {
        int i;
        try {
            i = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You`d entered not an integer. Try agan.");
            while (true) {
                scanner.next();
                if (scanner.hasNextInt()) {
                    i = scanner.nextInt();
                    break;
                }
                System.out.println("You`d entered not an integer. Try agan.");
            }
        }
        return i;
    }

    public static double getDouble() {
        double d;
        try {
            d = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("You`d entered not an integer. Try agan.");
            while (true) {
                scanner.next();
                if (scanner.hasNextDouble()) {
                    d = scanner.nextDouble();
                    break;
                }
                System.out.println("You`d entered not an integer. Try agan.");
            }
        }
        return d;
    }

    public static void createRecipe() {
        List<Ingredient> list = new ArrayList<>();
        System.out.println("To add bun - enter b\n" +
                "To add sausage - enter s");
        String choice = Method.getString();

        switch (choice) {
            case ("b"):
                list.add(Bun.createIngredient());
                break;
            case ("s"):
                list.add(Sausage.createIngredient());
                break;
            case ("n"):
          createRecipe();

        }
    }

    public static void createIngrList(){
        List<Ingredient> list = new ArrayList<>();
        System.out.println("Bun:");
        list.add(Bun.createIngredient());
        System.out.println("Sausage:");
        list.add(Sausage.createIngredient());
        System.out.println("Ketchup");
        list.add(Ketchup.createIngredient());
        FileWrite.writeIngrListToFile(list, "ingredientlist.bin");
    }

    public static void addIngrToIngrList (){
        List<Ingredient> list = FileRead.readIngredientList("ingredientlist.bin");
        System.out.println("Add new ingredient to list.");
        list.add(Ingredient.createIngredient());
        PrintList.printIngredientList(list);
        FileWrite.writeIngrListToFile(list, "ingredientlist.bin");
    }
}
