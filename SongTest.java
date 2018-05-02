import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SongTest {
  @Test
  public void testDefaultConstructor(){
	Song song = new Song("One More Time", "Alison Moyet", "The Turn", 2007 );
    assertEquals(song.getTitle(),"One More Time");
    assertEquals(song.getArtist(),"Alison Moyet");
    assertEquals(song.getAlbum(),"The Turn");
    assertEquals(song.getYear(),2007);
  }
  
}
	
	
	

 