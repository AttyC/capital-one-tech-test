import java.util.Scanner;

public class Song {
	
	String title;
	String artist;
	String album;
	int year;
	
   public Song(String title, String artist, String album, int year) {
      this.title = title;
      this.artist = artist;
      this.album = album;
      this.year = year;
   }
   public static void main(String args[]) {} 
	
	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public int getYear() {
		return year;
	}

}