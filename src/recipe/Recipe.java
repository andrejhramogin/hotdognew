package recipe;

import ingredient.Ingredient;

import java.io.Serializable;
import java.util.List;


public class Recipe implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Ingredient> list;

    public Recipe(List<Ingredient> list){
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

}
