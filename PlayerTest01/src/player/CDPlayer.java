package player;

// 클래스 CDPlayer는 인터페이스 Player를 구현한다.
public class CDPlayer implements Player {
	
	@Override
	public void play() {
		System.out.println(" CD 플레이어 재생 ");
	}
	
	@Override
	public void stop() {
		System.out.println(" CD 플레이어 정지");
	}
	
	// 청소 메소드 - 추가 메소드
	public void clean() {
		System.out.println("CD 플레이어 헤드 청소");
	}
}
