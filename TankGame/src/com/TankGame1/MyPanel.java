package com.TankGame1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.JPanel;

//我的面板

public class MyPanel extends JPanel implements KeyListener{
	//定义一个我的坦克
		Hero hero=null;
		
		//定义敌人的坦克组
		Vector<EnemyTank> ets = new Vector<EnemyTank>();
		int ensize = 3;
		
		//定义子弹
		
		
		//构造函数
		public MyPanel(){
			//初始化
			//创建我的坦克
			hero = new Hero(100,100);
			for(int i=0;i<ensize;i++){
				//创建一辆敌人的坦克
				EnemyTank et=new EnemyTank((i+1)*50,0);
				et.setColor(0);
				//加入
				ets.add(et);
			}
		}
		
		//重写paint
		public void paint(Graphics g)
		{
			super.paint(g);
			g.fillRect(0, 0, 400, 300);
			
			//画出自己的坦克
			this.drawTank(hero.getX(),hero.getY(),g,this.hero.direct,1);
			//画出敌人的坦克组
			//添加颜色
			for(int i=0;i<ets.size();i++){
				this.drawTank(ets.get(i).getX(), ets.get(i).getY(), g, ets.get(i).getDirect(), 0);
			}
			
		}

	//画出坦克的函数
		public void drawTank(int x,int y,Graphics g ,int direct,int type){
			//判断坦克类型
			switch(type){
				case 0:
					g.setColor(Color.cyan);
					break;
				case 1:
					g.setColor(Color.yellow);
					break;
			}
		//判断坦克方向并画出
		//0--向上  1--右  2--下  3--左
			switch(direct)
			{
			case 0:
				//画出自己向上的坦克
				//1.画出左面的矩形
				g.fill3DRect(x, y, 5, 30,false);
				//2.画出右边的矩形
				g.fill3DRect(x+15, y, 5, 30,false);
				//3.画出中间的矩形
				g.fill3DRect(x+5, y+5, 10, 20,false);
				//4.画出中间的圆
				g.fillOval(x+5, y+10, 10, 10);
				//5.画出直线（炮筒）
				g.drawLine(x+10, y+15, x+10, y);
				break;
			case 1:
				g.fill3DRect(x, y, 30, 5,false);
				g.fill3DRect(x, y+15, 30, 5,false);
				g.fill3DRect(x+5, y+5, 20, 10,false);
				g.fillOval(x+10, y+5, 10, 10);
				g.drawLine(x+15, y+10, x+30, y+10);
				break;
			case 2:
				g.fill3DRect(x, y, 5, 30,false);
				g.fill3DRect(x+15, y, 5, 30,false);
				g.fill3DRect(x+5, y+5, 10, 20,false);
				g.fillOval(x+5, y+10, 10, 10);
				g.drawLine(x+10, y+15, x+10, y+30);
				break;
			case 3:
				g.fill3DRect(x, y, 30, 5,false);
				g.fill3DRect(x, y+15, 30, 5,false);
				g.fill3DRect(x+5, y+5, 20, 10,false);
				g.fillOval(x+10, y+5, 10, 10);
				g.drawLine(x+15, y+10, x, y+10);
				break;
			}
}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		//移动：w--向上  d--向右  s--向下  a--向左
		if(arg0.getKeyCode()==KeyEvent.VK_W){
			this.hero.setDirect(0);
			this.hero.MoveUp();
			
		}else if(arg0.getKeyCode()==KeyEvent.VK_D){
			this.hero.setDirect(1);
			this.hero.MoveRight();
			
		}else if(arg0.getKeyCode()==KeyEvent.VK_S){
			this.hero.setDirect(2);
			this.hero.MoveDown();
			
		}else if(arg0.getKeyCode()==KeyEvent.VK_A){
			this.hero.setDirect(3);
			this.hero.MoveLeft();
		}
		
		//发射子弹
		if(arg0.getKeyCode()==KeyEvent.VK_J){
			
		}
		
		//重绘
		this.repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
