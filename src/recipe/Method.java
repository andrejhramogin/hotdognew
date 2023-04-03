package recipe;

import comparator.ComparatorNameIngr;
import ingredient.Bun;
import ingredient.Ingredient;
import ingredient.Ketchup;
import ingredient.Sausage;
import uienum.UiMessage;
import write_read_print.*;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
            System.out.println(UiMessage.NOT_INTEGER);
            while (true) {
                scanner.next();
                if (scanner.hasNextInt()) {
                    i = scanner.nextInt();
                    break;
                }
                System.out.println(UiMessage.NOT_INTEGER);
            }
        }
        return i;
    }

    public static double getDouble() {
        double d;
        try {
            d = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println(UiMessage.NOT_DOUBLE);
            while (true) {
                scanner.next();
                if (scanner.hasNextDouble()) {
                    d = scanner.nextDouble();
                    break;
                }
                System.out.println(UiMessage.NOT_DOUBLE);
            }
        }
        return d;
    }

    public static void createRecipe(List<Ingredient> ingrList) {
        PrintList.printIngredientList(ingrList);
        List<Ingredient> recipe = new ArrayList<>();
        List<Recipe> recipeBase = FileRead.readRecipeList();
        int ingrChoice;
        System.out.println(UiMessage.INGREDIENT_CHOICE.getMessage());

        while (Method.scanner.hasNextInt()) {
            ingrChoice = Method.getInteger();

            System.out.println(UiMessage.QUANTITY.getMessage());
            int quantity = Method.getInteger();

            ingrList.get(ingrChoice - 1).setRecipeQuantity(quantity);
            ingrList.get(ingrChoice - 1).setReserve(ingrList.get(ingrChoice - 1).getReserve() - quantity);
            PrintList.printRecipeIngredient(ingrList.get(ingrChoice - 1));
            recipe.add(ingrList.get(ingrChoice - 1));
        }
        PrintList.printRecipeIngrList(recipe);
        int number = recipeBase.get(recipeBase.size()-1).getSequenceNumber() + 1;
        recipeBase.add(new Recipe(number, recipe, 0));
        FileWrite.writeRecipeListToFile(recipeBase);
    }

    public static void createIngrList() {
        List<Ingredient> list = new ArrayList<>();
        System.out.println("Bun:");
        list.add(Bun.createIngredient());
        System.out.println("Sausage:");
        list.add(Sausage.createIngredient());
        System.out.println("Ketchup");
        list.add(Ketchup.createIngredient());
        FileWrite.writeIngrListToFile(list, UiMessage.INGREDIENT_LIST.getMessage());
    }

    public static void addIngrToIngredientlist() {
        List<Ingredient> list = FileRead.readIngredientList(UiMessage.INGREDIENT_LIST.getMessage());
        System.out.println(UiMessage.ADD_NEW_INGREDIENT);
        list.add(Ingredient.createIngredient());
        list = list.stream()
                .sorted(new ComparatorNameIngr())
                .collect(Collectors.toList());
        PrintList.printIngredientList(list);
        FileWrite.writeIngrListToFile(list, UiMessage.INGREDIENT_LIST.getMessage());
    }

    public void deleteIngrFromIngredientlist(List<Ingredient> list, int i) {
        list.remove(i);
        FileWrite.writeIngrListToFile(list, UiMessage.INGREDIENT_LIST.getMessage());
    }
}
