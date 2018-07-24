package task6;

import java.util.Objects;

public class Wing {
    private String name;
    private int longiness;

    public int getLonginess() {
        return longiness;
    }

    public void setLonginess(int longiness) {
        this.longiness = longiness;
    }

    public Wing(String name, int longiness) {
        this.name = name;
        this.longiness = longiness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void flapsUp(){
        System.out.println(getName()+" закрылки подняты.");
    }

    @Override
    public String toString() {
        return "Wing{" +
                "name='" + name + '\'' +
                ", longiness=" + longiness +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wing)) return false;
        Wing wing = (Wing) o;
        return getLonginess() == wing.getLonginess() &&
                Objects.equals(getName(), wing.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLonginess());
    }
}
