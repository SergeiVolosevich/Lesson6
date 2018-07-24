package task2;

public abstract class SiemensMobile implements IMobile {
    private String name;
    private int length;
    private int width;
    private int thickness;
    private double weight;
    private int cost;

    public SiemensMobile() {
    }

    public abstract void poweron();

    public void poweroff() {
        System.out.println("Выключение телнфона.");
    }

    public SiemensMobile(String name, int length, int width, int thickness, double weight, int cost) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.weight = weight;
        this.cost = cost;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
