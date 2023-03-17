
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Song_playList 
{
	public static void main(String[] args)
	{
		Deque<String> song = new ArrayDeque<>();  

		song.add("S1");
		song.add("S2");
		song.add("S3");

		// It will display N Songs with Fixed initial Capacity.
		System.out.println("List of Songs => "+ song);

		Scanner sc=new Scanner(System.in);
		System.out.println("Please play the Song from above PlayList");
		String songName=null;
		
		while(true)
		{
			songName=sc.next();
			
			// This will exit from program (It will close the player).
			if(songName.equalsIgnoreCase("Exit"))
			{
				System.out.println("\nThanks for Listening...We are closing the Music Player...!");
				sc.close();
				System.exit(0); 
			}
			
			// This will avoid duplication for last played song and current song in recent playList.
			else if(song.getLast().equalsIgnoreCase(songName)) 
			{
				System.out.println("\nWhen "+songName+" song is played the recent PlayList is => "+song);
				System.out.println("Play any song or press Close to Exit.");
			}
			else
			{
				song.add(songName);
				song.remove();
				System.out.println("\nWhen "+songName+" song is played the recent PlayList is => "+song);
				System.out.println("Play any song or press Close to Exit.");
			}
		}
		
	}
}
