import java.util.*;

//Class Playlist -> have Albums stored in a linkedList
//Songs from different albums can be added to the playlist and will appear in the list in the order
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
public class Playlist {
    private String name;
    private Scanner sc = new Scanner(System.in);
    private LinkedList<Album> albumLinkedList;
    private LinkedList<Song> playlistLinkedList;

    Playlist(String name){
        this.name = name;
        albumLinkedList = new LinkedList<Album>();
        playlistLinkedList = new LinkedList<Song>();
    }
    public LinkedList<Album> getAlbumLinkedList(){
        return this.albumLinkedList;
    }
    public LinkedList<Song> getPlaylistLinkedList(){
        return this.playlistLinkedList;
    }
    public String getPlaylistName(){
        return this.name;
    }
    public void setPlaylistName(String name){
        this.name = name;
    }
    // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
    // List the songs in the playlist

    /*
    1. Quit
    2. Skip forward to next song
    3. Skip backwards to previous song
    4. Replay Current Song
    5. Add a Song
    6. Remove current Song
     */
    public int getUserInput(){

        System.out.println("Enter your choice: ");
        if(!sc.hasNextInt()){
            System.out.println("Invalid Input, try again");
            sc.nextLine();
            return -1;
        }
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
    public void printMenu(){
        System.out.println("1. Quit\n" +
                "2. Skip forward to next song\n" +
                "3. Skip backwards to previous song\n" +
                "4. Replay current song\n" +
                "5. Add a Song\n" +
                "6. Remove current Song\n" +
                "7. Print Menu\n" +
                "8. print Songs Under Current Playlist");
    }
    public void actionOnInput(){ //the player
        printMenu();
        boolean quit = true;
        boolean kakaNextLang = false;
        boolean kakaPreviousLang = false;
        boolean kakaDeleteMoLangMagSelectKaNaman = false;
        ListIterator<Song> playListSongs = getPlaylistLinkedList().listIterator();
        while(quit)

        switch(getUserInput()){
            case -1:
                break;
            case 1: //Quit
                quit = false;
                break;

            case 2: // 2. Skip forward to next song
                // 2 times of .next() is needed if kakaPreviousLang is true
                if(kakaPreviousLang){
                    if(playListSongs.hasNext()){
                        playListSongs.next();
                    }
                    else{
                        System.out.println("->->->->->Reached the end of the playList");
                    }
                }

                if(playListSongs.hasNext()){
                    System.out.println("->->->->->Now playing -> " +playListSongs.next().getTitle());
                    kakaNextLang = true;
                    kakaPreviousLang = false;
                }
                else{
                    System.out.println("->->->->->Reached the end of the playList");
                }
                kakaDeleteMoLangMagSelectKaNaman = false;
                break;

            case 3: //3. Skip backwards to previous song
                // 2 times of .previous() is needed if kakaPreviousLang is true
                if(kakaNextLang){
                    if(playListSongs.hasPrevious()){
                        playListSongs.previous();
                    }
                    else{
                        System.out.println("->->->->->Reached the start of the playList");
                    }
                }

                if(playListSongs.hasPrevious()){
                    System.out.println("->->->->->Now playing -> " +playListSongs.previous().getTitle());
                    kakaPreviousLang = true;
                    kakaNextLang = false;
                }
                else{
                    System.out.println("->->->->->Reached the start of the playList");
                }
                kakaDeleteMoLangMagSelectKaNaman = false;
                break;

            case 4:// 4.Replay Current Song
                Song song = null;

                if(kakaDeleteMoLangMagSelectKaNaman){
                    System.out.println("Song is deleted! Cannot replay the song");
                    break;
                }
                else if(kakaNextLang){
                    song = playListSongs.previous();
                    kakaPreviousLang = true;
                    kakaNextLang = false;
                }
                else if(kakaPreviousLang){
                    song = playListSongs.next();
                    kakaNextLang = true;
                    kakaPreviousLang = false;
                }
                else if(Objects.isNull(song)){
                    System.out.println("You have not played a song yet");
                }

                System.out.println("Replaying current song " +song.getTitle());
                kakaDeleteMoLangMagSelectKaNaman = false;
                break;

            case 5: //Add a Song
                System.out.println("Enter the name of the song you want to add: ");
                //sc.nextLine();
                String songName = sc.nextLine();
                addSongToPlayListWithConfirmation(songName);
                kakaDeleteMoLangMagSelectKaNaman = false;
                break;

            case 6: //6. Remove current Song
                Song songDel = null;

                if(kakaDeleteMoLangMagSelectKaNaman){
                    System.out.println("No song currently playing, please play a song first!");
                }


                while(!kakaDeleteMoLangMagSelectKaNaman) {
                    if (kakaNextLang) {
                        songDel = playListSongs.previous();
                        kakaPreviousLang = true;
                        kakaNextLang = false;
                        playListSongs.remove();
                    } else if (kakaPreviousLang) {
                        songDel = playListSongs.next();
                        kakaNextLang = true;
                        kakaPreviousLang = false;
                        playListSongs.remove();
                    } else if (Objects.isNull(songDel)) {
                        System.out.println("You have not played a song yet");
                    }

                    System.out.println("Deleted the current song: " + songDel.getTitle());
                    kakaDeleteMoLangMagSelectKaNaman = true;
                }

                break;

            case 7:
                printMenu();
                break;
            case 8:
                printSongsUnderPlaylist();
                break;

        }
   }
   //add a song
    public boolean addSongToPlayList(String songName){
        Song songObj = getSongObject(songName);
        //if(songObj.equals(null)){
        if(Objects.isNull(songObj)){
            //System.out.println("Song does not belong to an album. Cannot add the song to playlist.");
            return false;
        }

        getPlaylistLinkedList().add(songObj);
            //System.out.println("Successfully added the song " +songName +"to the playlist!");
        return true;

    }
    public boolean addSongToPlayListWithConfirmation(String songName){
        Song songObj = getSongObject(songName);
        //if(songObj.equals(null)){
        if(Objects.isNull(songObj)){
            System.out.println("Song does not belong to an album. Cannot add the song to playlist.");
            return false;
        }

        getPlaylistLinkedList().add(songObj);
        System.out.println("Successfully added the song " +songName +" to the playlist!");
        return true;

    }


   //validation that a song can be added to playlist(since it belongs to an album)
   public boolean songHasAlbum(String songInQuestion){
        if(getSongObject(songInQuestion).equals(null)){
            //System.out.println("The song does not belong to an Album");
            return false;
        }
        return true;
   }

   public Album getAlbumObject(String albumName){
        ListIterator<Album> albumListIterator = getAlbumLinkedList().listIterator();
            //able to check the very last element now since we only used .hasNext() and .next() once.
           while(albumListIterator.hasNext()) {  //searches for album
            Album objAlbum = albumListIterator.next();
            int compare = objAlbum.getName().compareTo(albumName) ;
            //System.out.println("Checking: " +objAlbum.getName());

            if(compare == 0) {
                return objAlbum;
            }
        }
        return null;
        /* //This gives error since we used hasNext() only once but used .next() twice! ->we are not able to check the very last element
        while(albumListIterator.hasNext()) {  //searches for album
            String albumNameIterator = albumListIterator.next().getName();  //first use of .next()
            int compare = albumNameIterator.compareTo(albumName) ;
            System.out.println("Checking: " +albumNameIterator);

            if(compare == 0) {
                return albumListIterator.next();        //second use of .next()
            }
        }
        return null;

         */
    }
   public Song getSongObject(String songToGet){
       ListIterator<Album> albumListIterator = getAlbumLinkedList().listIterator();

       while(albumListIterator.hasNext()){  //searches in album

           //gets songsList for the current Album -> linkedList
           LinkedList<Song> currentSongList = albumListIterator.next().getSongsList();

           //defines a listIterator for songlist in the current Album ->listIterator
           ListIterator<Song> songListIterator = currentSongList.listIterator();

           //checks all names of songs
           while(songListIterator.hasNext()){
               Song song = songListIterator.next();
               if(song.getTitle().equals(songToGet)){
                   return song;
               }
           }
       }
        return null;
       }
   public void printSongsUnderPlaylist(){
       ListIterator<Song> playlistIterator = getPlaylistLinkedList().listIterator();
       while(playlistIterator.hasNext()){
           Song song = playlistIterator.next();
           System.out.println("Tile: " +song.getTitle() +" -> Duration: " +song.getDuration());
       }
   }


   }


