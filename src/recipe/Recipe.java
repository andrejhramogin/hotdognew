package recipe;

import ingredient.Ingredient;

import java.io.Serializable;
import java.util.List;


public class Recipe implements Serializable  {

    private static final long serialVersionUID = 1L;

    private List<Ingredient> list;

    private int sequenceNumber;

    private int quantityHotDog;

    public Recipe(int sequenceNumber, List<Ingredient> list, int quantityHotDog){
        this.sequenceNumber = sequenceNumber;
        this.list = list;
        this.quantityHotDog = quantityHotDog;
    }

    public Recipe(){}

    public List<Ingredient> getList() {
        return list;
    }

    public void setList(List<Ingredient> list) {
        this.list = list;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public int getQuantityHotDog() {
        return quantityHotDog;
    }

    public void setQuantityHotDog(int quantityHotDog) {
        this.quantityHotDog = quantityHotDog;
    }
}
