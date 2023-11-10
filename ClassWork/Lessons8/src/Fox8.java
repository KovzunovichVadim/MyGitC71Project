public class Fox8 extends Animals8 {

    /* Перегрузка
    void run (){
        System.out.println("Я бегу");
    }

    void run(int speed){    // разное кол-во, тип последовательность пармаметров
        System.out.println("Я бегу со скоростью " + speed);
    }

    void run(String where) {
        System.out.println("Я бегу "+ where);
    } */

    // Переопределение

    void makeVoice(){
        System.out.println("Fir, fir, fir ... ");
    }
}
