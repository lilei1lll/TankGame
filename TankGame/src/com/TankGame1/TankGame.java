/*
 * ����ʱ�䣺2017��5��28��01:37:09
 * ̹����Ϸ1.0
 */

package com.TankGame1;

import javax.swing.JFrame;

public class TankGame extends JFrame{
	
	
	MyPanel mp = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TankGame tGame = new TankGame();
	}
	
	//���캯��
		public TankGame(){
			mp = new MyPanel();
			
			//ע�����
			this.addKeyListener(mp);
			
			this.add(mp);
			this.setSize(400, 300);
			this.setTitle("̹�˴�ս");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocation(200, 200);
			this.setVisible(true);
			
		}

}
