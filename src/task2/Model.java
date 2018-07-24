package task2;

public class Model extends SiemensMobile {
    private String subname;
    private String os;
    private int ram;
    private int hdd;
    private int video;

    public Model() {
    }

    public Model(String name, int length, int width, int thickness, double weight, int cost) {
        super(name, length, width, thickness, weight, cost);
    }

    public Model(String name, int length, int width, int thickness, double weight, int cost,
                 String subname, String os, int ram, int hdd, int video) {
        super(name, length, width, thickness, weight, cost);
        this.subname = subname;
        this.os = os;
        this.ram = ram;
        this.hdd = hdd;
        this.video = video;
    }

    @Override
    public void poweron() {
        System.out.println("Включен телефон модели - " + getName());
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getVideo() {
        return video;
    }

    public void setVideo(int video) {
        this.video = video;
    }

    @Override
    public void callIn() {
        System.out.println("Входящий вызов принят.");
    }

    @Override
    public void callOut() {
        System.out.println("Набирает телефон.");
    }

    @Override
    public void ring() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Динь Динь");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Звонок завершен.");
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + getName() + '\'' +
                ", length=" + getLength() +
                ", width=" + getWidth() +
                ", thickness=" + getThickness() +
                ", weight=" + getWeight() +
                ", cost=" + getCost() +
                ", subname='" + subname + '\'' +
                ", os='" + os + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", video=" + video +
                '}';
    }
}
