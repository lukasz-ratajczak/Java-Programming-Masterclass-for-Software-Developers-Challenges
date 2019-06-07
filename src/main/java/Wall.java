public class Wall {

    private double height, width;

    public Wall() {
        this(0,0);
    }

    public Wall(double heigth, double width) {
        if (heigth < 0){
            this.height = 0;
        }else{
            this.height = heigth;
        }
        if (width < 0){
            this.width = 0;
        } else{
            this.width = width;
        }
    }

    public double getArea(){
        return this.height * this.width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0){
            this.height = 0;
        }else{
            this.height = height;
        };
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0){
            this.width = 0;
        } else{
            this.width = width;
        }
    }
}
