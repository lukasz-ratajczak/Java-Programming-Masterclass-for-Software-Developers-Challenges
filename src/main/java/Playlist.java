import java.util.LinkedList;

public class Playlist {
    private String name;
    private LinkedList<Song> playlist;

    public LinkedList<Song> getPlaylist() {
        return playlist;
    }

    public Playlist(String name) {
        this.name = name;
        this.playlist = new LinkedList<>();
    }

    public void addSongToPlayList(Album album, Song song){
        if(album.findSong(song)){
        this.playlist.add(song);
            System.out.println("Song "+song.getName().toUpperCase()+" from album "+album.getName().toUpperCase()+" added to playlist "+ this.name.toUpperCase());
    }else{
            System.out.println("Song " + song.getName().toUpperCase() +" isn't in album "+ album.getName().toUpperCase());
        }

    }
    public void printSongsInPlaylist(){
        System.out.println("==============");
        System.out.println("Songs in playlist "+this.name.toUpperCase()+":");
        for (int i = 0; i < this.playlist.size() ; i++) {
            System.out.println(this.playlist.get(i).getName()+ " " + this.playlist.get(i).getDuration());
        }
        System.out.println("==============");
    }

    }
