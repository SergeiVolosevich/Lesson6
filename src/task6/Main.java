package task6;

//Создать приложение, удовлетворяющее требованиям, приведенным в задании. Наследование применять только
//в тех заданиях, в которых это логически обосновано. Аргументировать принадлежность классу
// каждого создаваемого метода и корректно переопределить для каждого класса методы equals(), hashCode(), toString().
//Задание: Создать объект класса Самолет, используя классы Крыло,  Шасси,  Двигатель.
//Методы: летать, задавать маршрут, вывести на консоль маршрут.


import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane("Concord", new Wing("left", 13), new Wing("right", 13),
                new Engine("W8", 2000, 10.5), new Chassis(6));

        plane.takeoff();

        plane.up(20000);

        System.out.println(plane);

        try {
            plane.printRoute(plane.route());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
