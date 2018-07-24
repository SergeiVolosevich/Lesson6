package task2;


//Создать и реализовать интерфейсы, также использовать наследование и полиморфизм для
//        следующих предметных областей: interface Mobile <- abstract class Siemens Mobile <- class Model.


public class Main {
    public static void main(String[] args) {
//        Model md1 = new Model("Siemens A100", 111, 50, 12, 112.12, 213, "J510/N",
//                "Android", 512, 16, 128);
//        System.out.println(md1);
//        md1.callIn();
//        md1.callOut();
//        md1.ring();
//        md1.poweron();
//        md1.poweroff();
//
//        SiemensMobile sm = new Model("Siemens A100", 111, 50, 12, 112.12, 213);
//        System.out.println(sm);
//        sm.poweron();
        IMobile sm1 = new Model("Siemens A100", 111, 50, 12, 112.12, 213, "J510/N",
                "Android", 512, 16, 128);
        sm1.callIn();
        sm1.callOut();
        sm1.ring();

        SiemensMobile siemensMobile = new Model("Siemens A100", 111, 50, 12, 112.12, 213, "J510/N",
                "Android", 512, 16, 128);
        siemensMobile.poweroff();

        Model md1 = new Model("Siemens A100", 111, 50, 12, 112.12, 213, "J510/N",
                "Android", 512, 16, 128);

    }
}
