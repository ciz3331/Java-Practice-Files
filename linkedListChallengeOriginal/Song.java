//class song -> fields: Title and Duration
public class Song {
    private String title;
    private String duration;

    Song(String title, String duration){
        this.title = title;
        this.duration = duration;
        //System.out.println("Song " +title +" successfully added!");
    }
    public String getTitle(){
        return this.title;
    }
    public String getDuration(){
        return this.duration;
    }

}
