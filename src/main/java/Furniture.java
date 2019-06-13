public class Furniture {
    private double value;
    private String material;

    public Furniture(double value, String material) {
        this.value = value;
        this.material = material;
    }
    public void makeFurniture(){
        System.out.println(getMaterial());
        System.out.println(getValue());
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
