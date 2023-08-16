package player;

// PortablePlayer는 Player, Skinnable 인터페이스 모두를 구현한다.
// 다중 구현

public class PortablePlayer implements Player, Skinnable {

	
	@Override
	public void play() {
		System.out.println("포터블 플레이어 재생");
	}
	
	@Override
	public void stop() {
		System.out.println("포터블 플레이어 정지");
	}
	// Skinnable.LEOPARD에서 Skinnable을 생략할 수 있다.
	// PortablePlayer 클래스가 Skinnable 인터페이스를 구현하고 있기 때문에
	
	
	@Override
	public void changeSkin(int skin) {
		System.out.print("스킨물");
		switch(skin) {
		case RED : System.out.print("빨강"); break;
		case BLUE : System.out.print("파랑"); break;
		case GREEN : System.out.print("초록"); break;
		case BLACK : System.out.print("검정"); break;
		case lEOPARD : System.out.print("표범무늬"); break;
		default : System.out.print("흰색"); break;
		}
		System.out.println("으로 변경하였습니다.");

	}
}
