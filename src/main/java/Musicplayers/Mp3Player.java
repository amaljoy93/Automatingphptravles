package Musicplayers;

public class Mp3Player implements BasicFuctions {
	private String song1;
	private String song2;
	public Mp3Player(String song1,String song2)
	{
		this.song1=song1;
		this.song2=song2;
	}

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Start playing" +this.song1+ " MP3 songs");
	}

	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Pause"+this.song1+" MP3 songs");
		
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop playing"+this.song1 );
		
	}

}
