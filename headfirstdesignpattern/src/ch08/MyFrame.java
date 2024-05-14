package ch08;

import java.awt.Graphics;
import javax.swing.JFrame;

// 화면을 갱신하기 위한 알고리즘을 제어하는 update() 메소드가 들어있는 JFrame을 확장.
// paint() 후크 메소드를 오버라이드 해서 알고리즘에 끼어들 수 있다.
public class MyFrame extends JFrame {
	
	public MyFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	// JFrame의 update() 알고리즘에서 paint()를 호출
	// paint() 후크 메소드를 오버라이드 해서 윈도우에 메시지를 그림
	public void paint(Graphics graphics) {
		super.paint(graphics);
		String msg = "내가 최고!!";
		graphics.drawString(msg, 100, 100);
	}
	
	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame("해드 퍼스트 디자인 패턴");
	}

}
