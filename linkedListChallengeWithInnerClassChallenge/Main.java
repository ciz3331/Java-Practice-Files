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
        /* Inner Class Challenge*******************
        // Modify the playlist challenge so that the Album class uses an inner class.
        // Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
        // The inner SongList class will use an ArrayList and will provide a method to add a song.
        // It will also provide findSong() methods which will be used by the containing Album class
        // to add songs to the playlist.
        // Neither the Song class or the Main class should be changed.
        */



        LinkedList<Song> pogingAlbumSongList = test.getAlbumObject("Poging album ser").getSongsLinkedList();
        pogingAlbumSongList.add(new Song("2", "3:45 minutes"));
        pogingAlbumSongList.add(new Song("4", "4:39 minutes"));
        pogingAlbumSongList.add(new Song("Doble", "4:39 minutes"));
        pogingAlbumSongList.add(new Song("Lilac", "5:03 minutes"));
        pogingAlbumSongList.add(new Song("1", "4:01 minutes"));

        LinkedList<Song> pangetAlbumSongList = test.getAlbumObject("Panget album ser").getSongsLinkedList();
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
        System.out.println("Songs under playlist: ====>>>");
        test.printSongsUnderPlaylist();
        //test.actionOnInput();


        //testing adding a song to playlist using addSongToPlayList under class Album
        System.out.println();
        test.getAlbumObject("Poging album ser").addSongToPlayList(test, "Lilac");
        System.out.println("Songs under playlist: ====>>>");
        test.printSongsUnderPlaylist();

        //test add a song to album using addSongToAlbum under class Album
        test.getAlbumObject("Last element").addSongToAlbum("Rapsa", "69 Minutes");
        test.getAlbumObject("Last element").printSongs();
    }

}

