public class House {
    private String outterWall, innerWall;
    private Room room;

    public House(String outterWall, String innerWall, Room room) {
        this.outterWall = outterWall;
        this.innerWall = innerWall;
        this.room = room;
    }

    public void makeRoom() {
        room.makeRoom();
    }

    public String getOutterWall() {
        return outterWall;
    }

    public void setOutterWall(String outterWall) {
        this.outterWall = outterWall;
    }

    public String getInnerWall() {
        return innerWall;
    }

    public void setInnerWall(String innerWall) {
        this.innerWall = innerWall;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
