import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Playlist {
    String name;
    ArrayList<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    public Boolean isEmpty(){
        return this.songs.isEmpty();
    }

    public void addSong(Song song){
        this.songs.add(song);
    }

    public void removeSong(Song song){
        this.songs.remove(song);
    }

    public String[] songNames(){
        String[] songNameArray = new String[this.songs.size()];
        for (int i = 0; i < this.songs.size(); i ++) {
            songNameArray[i] = this.songs.get(i).title;
        }
        return songNameArray;
    }

    public int totalDuration(){
        int result = 0;
        for (int i = 0; i < this.songs.size(); i ++) {
            result += this.songs.get(i).durationInSeconds;
        }
        return result;
    }

    public void swap(Song song1, Song song2){
        Collections.swap(this.songs, this.songs.indexOf(song1), this.songs.indexOf(song2));
    }
}
