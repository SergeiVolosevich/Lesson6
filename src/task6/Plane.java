package task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Plane {
    private String name;
    private Wing wingleft;
    private Wing wingright;
    private Engine engine;
    private Chassis chassis;

    public Plane(String name, Wing wingleft, Wing wingright, Engine engine, Chassis chassis) {
        this.name = name;
        this.wingleft = wingleft;
        this.wingright = wingright;
        this.engine = engine;
        this.chassis = chassis;
    }

    public void takeoff() {
        System.out.println("Предстартоая проверка.");

        System.out.println("Запуск двигателя.");
        getEngine().startEngine();

        System.out.println("Поднять закрылки.");
        getWingleft().flapsUp();
        getWingright().flapsUp();

        System.out.println("Разгон.");
        getEngine().acceleration();

        System.out.println("Набрана нужная скорость. Отрыв.");

        System.out.println("Убрать шасси");
        getChassis().chassisUp();
    }

    public void up(int a) {
        int i = 0;
        int b = a;

        System.out.println("Подъем на заданную высоту:" + a);
        while ((a = a / 10) != 0) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
        System.out.println("Подъем занял " + i);

        System.out.println("Полет происходит на высоте - " + b);
    }

    public String[] route() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ведите маршрут через запятую:");

        String str = reader.readLine();

        String[] string = null;
        string = str.split("\\W\\s");
        return string;
    }

    public void printRoute(String[] strings) {
        String str = "";
        for (int i = 0; i < strings.length; i++) {
            str = str + strings[i] + " - ";
            if (i == strings.length - 1) {
                str = str + strings[strings.length - 1];
            }
        }
        System.out.println("Проложен следующий маршрут:");
        System.out.println(str.trim());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wing getWingleft() {
        return wingleft;
    }

    public void setWingleft(Wing wingleft) {
        this.wingleft = wingleft;
    }

    public Wing getWingright() {
        return wingright;
    }

    public void setWingright(Wing wingright) {
        this.wingright = wingright;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        Plane plane = (Plane) o;
        return Objects.equals(getName(), plane.getName()) &&
                Objects.equals(getWingleft(), plane.getWingleft()) &&
                Objects.equals(getWingright(), plane.getWingright()) &&
                Objects.equals(getEngine(), plane.getEngine()) &&
                Objects.equals(getChassis(), plane.getChassis());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getWingleft(), getWingright(), getEngine(), getChassis());
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", wingleft=" + wingleft +
                ", wingright=" + wingright +
                ", engine=" + engine +
                ", chassis=" + chassis +
                '}';
    }
}
