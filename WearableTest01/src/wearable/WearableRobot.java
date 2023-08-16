package wearable;

//Wearable, Color 인터페이스를 구현한 클래스
public class WearableRobot implements Wearable, Color {
	private int color;
	
	public WearableRobot(int color) {
		this.color = color;
	}
	@Override
	public void putOn() {
		System.out.println(toString() + "장착");
	}
	@Override
	public void putOff() {
		System.out.println();
	}
	
	@Override
	public void changeColor(int color) {
		
	}
	
	public String toString() {
		
		switch(color) {
		case Color.RED : return "빨강 로봇";
		case Color.BLUE : return "파란 로봇";
		case Color.GREEN : return "초록 로봇";
		default : return "블랙 로봇";
		}
		
		/*
		String c;
		switch(color) {
		case RED : c = "빨강 로봇"; break;
		case BLUE : c = "파랑 로봇"; break;
		case GREEN : c = "초록 로봇"; break;
		default : c = "블랙 로봇"; break;
		}
		return c;
		*/
	}
}
