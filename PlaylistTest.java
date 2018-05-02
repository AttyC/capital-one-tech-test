import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class PlaylistTest {
  
  @Test
  	public void testGetSongsByYear() {
	  Playlist playlist = new Playlist();
	  ArrayList<Song> songList = new ArrayList<Song>();
	  int year = 2001;
	  assertEquals(playlist.getSongsByYear(year, songList), songList); 
  }
}
