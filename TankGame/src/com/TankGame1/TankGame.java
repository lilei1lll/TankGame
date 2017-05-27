/*
 * 创建时间：2017年5月28日01:37:09
 * 坦克游戏1.0
 */

package com.TankGame1;

import javax.swing.JFrame;

public class TankGame extends JFrame{
	
	
	MyPanel mp = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TankGame tGame = new TankGame();
	}
	
	//构造函数
		public TankGame(){
			mp = new MyPanel();
			
			//注册监听
			this.addKeyListener(mp);
			
			this.add(mp);
			this.setSize(400, 300);
			this.setTitle("坦克大战");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocation(200, 200);
			this.setVisible(true);
			
		}

}
