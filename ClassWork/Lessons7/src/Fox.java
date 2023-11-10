public class Fox {
    //public int age;     // везде
    //private int age;    // только в пределах класса
    //int age;              //default только внутри папки
    //

    private int age;

    // Геттеры - метод для просмотра закрытых полей
    // Геетер для age

    public int getAge(){
        return age;
    }

    // Сеттеры - метод для изменения закрытых полей
    // Сеттер для age

    public void setAge(int newValue){
        this.age = newValue;
    }

}
