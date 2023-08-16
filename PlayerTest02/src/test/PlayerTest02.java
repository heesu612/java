package test;

import player.*;

public class PlayerTest02 {
	public static void main(String[] args) {
		PortablePlayer p = new PortablePlayer();
		
		p.play();
		p.stop();
		
		// 클래스 멤버의 사용법
		p.changeSkin(Skinnable.LEOPARD); 
	}
}
