import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Playlist {
	
  public static void main(String[] args) {

	ArrayList<Song> songList = new ArrayList<Song>();
      
    songList.add(new Song("One More Time", "Alison Moyet", "The Turn", 2007));
    songList.add(new Song("Taurus II", "Mike Oldfield", "Five Miles Out", 2013));
    songList.add(new Song("F4", "Spooky Tooth", "The Island Years", 2015));
    songList.add(new Song("Love Dance", "The Cure", "Disintegration", 2010));
    songList.add(new Song("The Children of Rarn", "T-Rex", "T-Rex", 2014));
    songList.add(new Song("Another Day", "Alison Moyet", "The Turn", 2007));
    songList.add(new Song("Face-off", "Spooky Tooth", "The Island Years", 2015));
    
    getUserInput(songList);        
  }
  
  static void getUserInput(ArrayList<Song> songList) {
	Scanner in = new Scanner(System.in);  
	  System.out.println("Enter a year (YYYY)");
	  try {
	    int year = in.nextInt();
	    getSongsByYear(year, songList);
	   } catch (InputMismatchException e){
	      System.out.println(e + " Please run the program again and enter a year");
	   }
  }

  static ArrayList<Song> getSongsByYear(int year, ArrayList<Song> songList) {
    for (int index = 0; index < songList.size(); index++) { 	
  	if (year == songList.get(index).year) {
  	  String song = songList.get(index).title + ' ' 
  				+ songList.get(index).artist + ' '
  				+ songList.get(index).album + ' '
  				+ songList.get(index).year;
      System.out.println(song); 	    
      }
    } 
    return songList;
  }
}