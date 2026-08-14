//Album Class -> lists of songs(stored in linkedList)
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Objects;

public class Album {
    private String name;
    SongList songList;

    Album(String name){
        this.name = name;
         this.songList = new SongList();
        //System.out.println("Album " +name +" successfully created");
    }

    public SongList getSongsList() {
        return songList;
    }
    public LinkedList<Song> getSongsLinkedList(){
        return songList.getSongsLinkedList();
    }
    public String getName(){
        return this.name;
    }
    public void addSongToAlbum(String title, String duration){
        songList.addSong(title, duration);
    }
    public boolean addSongToPlayList(Playlist playListObject, String title){
        Song song = songList.findSong(title);

        if(Objects.isNull(song)){
            System.out.println("Song is not in this album. Thus, adding song to playlist is now cancelled. ");
            return false;
        }

        System.out.println("Adding song to playList successful!");
        playListObject.getPlaylistLinkedList().add(song);
        return true;
    }

    public void printSongs(){
        System.out.println("Songs under album " +getName() +" are:");
        ListIterator<Song> printSongs = getSongsList().getSongsLinkedList().listIterator();
        while(printSongs.hasNext()){
            System.out.println(printSongs.next().getTitle());
        }
        System.out.println("////////////////////////////////////////////////");
    }
    public ListIterator<Song> songListIterator(){
        ListIterator<Song> songListIterator = getSongsList().getSongsLinkedList().listIterator();
        return songListIterator;
    }
    /////////////////////////////////////////////////////////////////////////////////////
    private class SongList {
        private LinkedList<Song> songsLinkedList;

        SongList(){
            this.songsLinkedList = new LinkedList<>();
        }
        public LinkedList<Song> getSongsLinkedList(){
            return this.songsLinkedList;
        }
        public boolean addSong(String title, String duration){
            Song song = findSong(title);
            if(Objects.isNull(song)){
                getSongsLinkedList().add(new Song(title, duration));
                return true;
            }
            else if((song) != null){
                System.out.println("Song already exists in this album" );
            }
            return false;
        }
        public Song findSong(String songName){
            ListIterator<Song> tempArray = this.getSongsLinkedList().listIterator();
            while(tempArray.hasNext()){
                Song song = tempArray.next();
                if(song.getTitle().equals(songName)){
                    return song;
                }
            }
            return null;
        }
    }

}
