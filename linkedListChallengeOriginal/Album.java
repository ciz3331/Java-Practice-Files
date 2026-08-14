//Album Class -> lists of songs(stored in linkedList)
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private LinkedList<Song> songsLinkedList;

    Album(String name){
        this.name = name;
        this.songsLinkedList = new LinkedList<Song>();
        //System.out.println("Album " +name +" successfully created");
    }

    public LinkedList<Song> getSongsList() {
        return songsLinkedList;
    }
    public String getName(){
        return this.name;
    }

    public void printSongs(){
        System.out.println("Songs under album " +getName() +" are:");
        ListIterator<Song> printSongs = this.songsLinkedList.listIterator();
        while(printSongs.hasNext()){
            System.out.println(printSongs.next().getTitle());
        }
        System.out.println("////////////////////////////////////////////////");
    }
    public ListIterator<Song> songListIterator(){
        ListIterator<Song> songListIterator = this.songsLinkedList.listIterator();
        return songListIterator;
    }

}
