

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Player {
    private Playlist playlist;

    public Player(Playlist playlist) {
        this.playlist = playlist;
    }

    public void playerForPlaylist() {
        int condition = 0;
        ListIterator<Song> listIterator = this.playlist.getPlaylist().listIterator();


        while (condition != 9) {
            if (condition == 0) {
                condition = showMenu();
            } else if (condition == 1) {
                if(listIterator.hasNext()){
                    System.out.println("Now playing -> " +listIterator.next().getNameWithDuration());
                    condition = 0;
                } else {
                    System.out.println("You've reach end of playlist");
                    condition = 0;
                }
            } else if (condition == 2) {
                if(listIterator.hasPrevious()){
                    System.out.println("Now playing -> " +listIterator.previous().getNameWithDuration());
                    condition = 0;
                } else {
                    System.out.println("You've reach start of playlist");
                    condition = 0;
                }
            } else if (condition == 3) {
                if(listIterator.hasPrevious()){
                    listIterator.previous();
                }if (listIterator.hasNext()) {
                    System.out.println("Now playing -> " + listIterator.next().getNameWithDuration());
                    condition = 0;
                } else {
                    condition = 0;
                }
            } else if (condition == 4) {
                this.playlist.printSongsInPlaylist();
                condition = 0;
            } else {
                condition = 0;
            }
        }
    }

    public static int showMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================");
        System.out.println("Choose option:");
        System.out.println("1) Next song");
        System.out.println("2) Previous song");
        System.out.println("3) Replay current song");
        System.out.println("4) Show songs in the playlist");
        System.out.println("9) Exit");
        System.out.println("==================");

        boolean checker = scanner.hasNextInt();
        if (checker) {
            int condition = scanner.nextInt();
            if (condition >= 1 && condition <= 4) {
                return condition;
            } else if (condition == 9) {
                System.out.println("Goodbay :)");
                return condition;
            }
        }
        System.out.println("Please choose valid option :/");
        return 0;
    }
}
