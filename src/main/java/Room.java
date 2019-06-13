public class Room {
    private int walls;
    private Furniture furniture;
    private Electronic electronic;
    private Paintings paintings;

    public Room(int walls, Furniture furniture, Electronic electronic, Paintings paintings) {
        this.walls = walls;
        this.furniture = furniture;
        this.electronic = electronic;
        this.paintings = paintings;
    }

    public void makeRoom() {
        System.out.println("Room will be :");
        furniture.makeFurniture();
        electronic.makeElectronic();
        paintings.makePaintings();
    }

    public int getWalls() {
        return walls;
    }

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public void setFurniture(Furniture furniture) {
        this.furniture = furniture;
    }

    public Electronic getElectronic() {
        return electronic;
    }

    public void setElectronic(Electronic electronic) {
        this.electronic = electronic;
    }

    public Paintings getPaintings() {
        return paintings;
    }

    public void setPaintings(Paintings paintings) {
        this.paintings = paintings;
    }
}
