import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> albums;

    public Album(String name) {
        this.name = name;
        this.albums = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getAlbums() {
        return albums;
    }

    public void addSongToAlbum(Song song) {
        if (!findSong(song)) {
            this.albums.add(song);
            System.out.println("Song " + song.getName().toUpperCase()+" added to album "+ this.name.toUpperCase());
        } else {
            System.out.println("Song is already in album");
        }
    }

    public boolean findSong(Song song) {
        return this.albums.contains(song);
    }
    public void printSongsInAlbum(){
        System.out.println("==============");
        System.out.println("Songs in album "+this.name.toUpperCase()+":");
        for (int i = 0; i < this.albums.size() ; i++) {
            System.out.println(this.albums.get(i).getName()+ " " + this.albums.get(i).getDuration());
        }
        System.out.println("==============");
    }
}
