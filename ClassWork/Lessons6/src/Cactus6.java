public class Cactus6 {// -> Объекты
    //состояние(характеристики - > поля, переменные
    String color;
    double weight = 10.2;
    double height = 1.5;
    String name = "Gowa";

    public Cactus6(String c, double w, double h){
        this.color = c;     // this ссылка на самого себя
        this.weight = w;
        this.height = h;
    }

    // поведение -> функции, методы
    // тип_возвращаемого_объекта Название(параметры)

    String giveWaterToDrink(double count){
        if(count>1){
            return  "Yeees, so cool!";
        }
        return "I need more ...";
    }

    void giveWaterToDrinkIWillPrintResult(double count){
        if (count>1){
            System.out.println("Yeees, so cool!");
        } else {
            System.out.println("I need more ...");
        }
    }
}
