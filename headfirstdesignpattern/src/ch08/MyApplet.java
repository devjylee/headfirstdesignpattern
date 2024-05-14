package ch08;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
	String message;
	
	// init(): 애플릿을 처음 초기화하는 과정을 처리할 수 있게 해주는 후크 메소드.
	public void init() {
		message = "안녕하세요. 제가 왔어요...";
		// repaint(): Applet 클래스에 있는 구상 메소드, 애플릿을 새로 그려야 한다는 것을 고수준 구성요소로 알려주는 역할.
		repaint();
	}
	
	// start(): 애플릿이 웹 페이지에 막 표시되는 시점에서 필요한 일을 처리할 수 있게 해주는 후크 메소드
	public void start() {
		message = "시작중...";
		repaint();
	}
	
	// stop(): 사용자가 다른 페이지로 이동할 때 실행. 하던 일을 멈추거나 하는 용도로 쓸 수 있는 후크 메소드
	public void stop() {
		message = "저를 떠나려 하시는군요...";
		repaint();
	}
	
	// destroy(): 애플릿이 사라질 때, 즉 브라우저 틀이 닫혀질 때 실행되는 후크 메소드
	public void destroy() {
		// 애플릿이 제거됨...
	}
	
	public void paint(Graphics g) {
		g.drawString(message, 5, 15);
	}
	

}
