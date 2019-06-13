public class Electronic {
    private double value;
    private String type;

    public Electronic(double value, String type) {
        this.value = value;
        this.type = type;
    }
    public void makeElectronic(){
        System.out.println(getType());
        System.out.println(getValue());
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
