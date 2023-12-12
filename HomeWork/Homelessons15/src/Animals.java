import java.util.ArrayList;

public class Animals {
    private String name;
    private ArrayList<String> list = new ArrayList<>();

    public void addAnimals(String name){
        list.add(name);
    }

    public void deleteAnimals(){
        list.remove(0);
    }

    public ArrayList<String> printAnimals(){
        return list;
    }
}
