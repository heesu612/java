package player;

// ExtendedPlayer 인터페이스를 구현하는 DVDPlayer 클래스
public class DVDPlayer implements ExtendedPlayer{

	@Override
	public void play() {
		System.out.println("DVD 플레이어 재생");
	}
	
	@Override
	public void stop() {
		System.out.println("DVD 플레이어 중지");
	}
	
	@Override
	public void fast() {
		System.out.println("DVD 플레이어 2배속");
	}
	
	@Override
	public void slow() {
		System.out.println("DVD 플레이어 감속");
	}
	
}
