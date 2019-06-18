public class Song {
    private String name;
    private String duration;

    public Song(String name, String duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public String getNameWithDuration(){
        return name + " "+duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
}
