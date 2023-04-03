package recipe;

import ingredient.Ingredient;

import java.io.Serializable;
import java.util.List;


public class Recipe implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Ingredient> list;
    private int number;

    public Recipe(int number, List<Ingredient> list){
        this.number = number;
        this.list = list;
    }

    public Recipe(){}

    public static void createRecipe(){
        System.out.println("");
    }

    public List<Ingredient> getList() {
        return list;
    }

    public void setList(List<Ingredient> list) {
        this.list = list;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
