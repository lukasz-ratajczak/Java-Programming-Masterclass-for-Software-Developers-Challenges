import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Song song1 = new Song("Alaa", "2:21");
        Song song2 = new Song("Upppa", "5:42");
        Song song3 = new Song("Luppa", "3:21");
        Song song4 = new Song("Geawea", "1:21");
        Song song5 = new Song("Toraraaa", "6:21");
        Song song6 = new Song("Headaaa", "5:21");
        Song song7 = new Song("Trarwaaa", "4:21");


        Album album1 = new Album("Super albumik");
        album1.addSongToAlbum(song1);
        album1.addSongToAlbum(song2);
        album1.addSongToAlbum(song3);
        album1.addSongToAlbum(song4);
        album1.addSongToAlbum(song5);

        Album album2 = new Album("Lepszy albumik");
        album2.addSongToAlbum(song6);
        album2.addSongToAlbum(song7);

        album1.printSongsInAlbum();
        album2.printSongsInAlbum();

        Playlist playlist = new Playlist("Playlist'a marzen");
        playlist.addSongToPlayList(album1, song1);
        playlist.addSongToPlayList(album1, song4);
        playlist.addSongToPlayList(album1, song2);
        playlist.addSongToPlayList(album2, song6);
        playlist.addSongToPlayList(album2, song7);

        playlist.addSongToPlayList(album1, song7);

        playlist.printSongsInPlaylist();

        Player player = new Player(playlist);
        player.playerForPlaylist();
    }
}





