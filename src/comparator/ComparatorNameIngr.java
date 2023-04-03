package comparator;

import ingredient.Ingredient;

import java.util.Comparator;

public class ComparatorNameIngr implements Comparator<Ingredient> {
    public int compare(Ingredient a, Ingredient b){
        return a.getName().compareTo(b.getName());
    }
}
