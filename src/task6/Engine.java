package task6;

import java.util.Objects;

public class Engine {
    private String name;
    private int power;
    private double v;

    public Engine() {
    }

    public Engine(String name, int power, double v) {
        this.name = name;
        this.power = power;
        this.v = v;
    }


    public void startEngine() {
        System.out.println("Двигатель запущен.");
    }

    public void acceleration() {
        for (int i = 0; i <= 150; i += 30) {
            System.out.println(i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;
        Engine engine = (Engine) o;
        return getPower() == engine.getPower() &&
                getV() == engine.getV() &&
                Objects.equals(getName(), engine.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getPower(), getV());
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", v=" + v +
                '}';
    }
}
