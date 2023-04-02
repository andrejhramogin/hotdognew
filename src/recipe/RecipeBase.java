package recipe;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RecipeBase implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Recipe> list = new ArrayList<>();

    public RecipeBase(List<Recipe> list){
        this.list = list;
    }

    public RecipeBase(){}

    public List<Recipe> getList() {
        return list;
    }
}
