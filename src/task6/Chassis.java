package task6;

import java.util.Objects;

public class Chassis {
    private int number;

    public Chassis(int number) {
        this.number = number;
    }

    public Chassis() {
    }

    public void chassisUp() {
        System.out.println("Шасси убраны.");
    }

    public void chassisDown() {
        System.out.println("Шасси выпущенны.");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chassis)) return false;
        Chassis chassis = (Chassis) o;
        return getNumber() == chassis.getNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber());
    }

    @Override
    public String toString() {
        return "Chassis{" +
                "number=" + number +
                '}';
    }
}
