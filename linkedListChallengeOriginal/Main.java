import java.util.*;
// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()
public class Main {
    public static void main(String[] args) {
        playListTest();
    }

    //playList test
    public static void playListTest(){
        Playlist test = new Playlist("Cj playlist");

        test.getAlbumLinkedList().add(new Album("Poging album ser"));
        test.getAlbumLinkedList().add(new Album("Panget album ser"));
        test.getAlbumLinkedList().add(new Album("PowPow! album ser"));
        test.getAlbumLinkedList().add(new Album("Last element"));

        //print album names
        /*
        ListIterator<Album> albumListIterator = test.getAlbumLinkedList().listIterator();
        while(albumListIterator.hasNext()){
            System.out.println(albumListIterator.next().getName());
        }
        System.out.println(test.getAlbumLinkedList());
        System.out.println();

         */


        LinkedList<Song> pogingAlbumSongList = test.getAlbumObject("Poging album ser").getSongsList();
        pogingAlbumSongList.add(new Song("2", "3:45 minutes"));
        pogingAlbumSongList.add(new Song("4", "4:39 minutes"));
        pogingAlbumSongList.add(new Song("Doble", "4:39 minutes"));
        pogingAlbumSongList.add(new Song("Lilac", "5:03 minutes"));
        pogingAlbumSongList.add(new Song("1", "4:01 minutes"));

        LinkedList<Song> pangetAlbumSongList = test.getAlbumObject("Panget album ser").getSongsList();
        pangetAlbumSongList.add((new Song("3", "69:45 minutes")));
        pangetAlbumSongList.add((new Song("5", "69:96 minutes")));
        pangetAlbumSongList.add((new Song("Pusong Bato", "2:69 minutes")));
        pangetAlbumSongList.add((new Song("Awan Load kon", "3:69 minutes")));
        pangetAlbumSongList.add((new Song("Abalayan-Abalayan!", "10:69 minutes")));


        test.addSongToPlayList("1");      //1. Unravel
        test.addSongToPlayList("2"); //2. Eternal Blue
        test.addSongToPlayList("3");    //3. Otso-Otso
        test.addSongToPlayList("4");    //4. Katharsis
        test.addSongToPlayList("5");    //5. Pito-pito
        System.out.println();


        test.getAlbumObject("Poging album ser").printSongs();
        test.getAlbumObject("Panget album ser").printSongs();
        test.getAlbumObject("Last element").printSongs();
        test.printSongsUnderPlaylist();
        //test.actionOnInput();

    }

}

