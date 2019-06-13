public class Paintings {
    private double area;
    private double value;

    public Paintings(double area, double value) {
        this.area = area;
        this.value = value;
    }
    public void makePaintings(){
        System.out.println(getArea());
        System.out.println(getValue());
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
