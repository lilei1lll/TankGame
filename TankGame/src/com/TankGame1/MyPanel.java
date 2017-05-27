package com.TankGame1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.JPanel;

//�ҵ����

public class MyPanel extends JPanel implements KeyListener{
	//����һ���ҵ�̹��
		Hero hero=null;
		
		//������˵�̹����
		Vector<EnemyTank> ets = new Vector<EnemyTank>();
		int ensize = 3;
		
		//�����ӵ�
		
		
		//���캯��
		public MyPanel(){
			//��ʼ��
			//�����ҵ�̹��
			hero = new Hero(100,100);
			for(int i=0;i<ensize;i++){
				//����һ�����˵�̹��
				EnemyTank et=new EnemyTank((i+1)*50,0);
				et.setColor(0);
				//����
				ets.add(et);
			}
		}
		
		//��дpaint
		public void paint(Graphics g)
		{
			super.paint(g);
			g.fillRect(0, 0, 400, 300);
			
			//�����Լ���̹��
			this.drawTank(hero.getX(),hero.getY(),g,this.hero.direct,1);
			//�������˵�̹����
			//�����ɫ
			for(int i=0;i<ets.size();i++){
				this.drawTank(ets.get(i).getX(), ets.get(i).getY(), g, ets.get(i).getDirect(), 0);
			}
			
		}

	//����̹�˵ĺ���
		public void drawTank(int x,int y,Graphics g ,int direct,int type){
			//�ж�̹������
			switch(type){
				case 0:
					g.setColor(Color.cyan);
					break;
				case 1:
					g.setColor(Color.yellow);
					break;
			}
		//�ж�̹�˷��򲢻���
		//0--����  1--��  2--��  3--��
			switch(direct)
			{
			case 0:
				//�����Լ����ϵ�̹��
				//1.��������ľ���
				g.fill3DRect(x, y, 5, 30,false);
				//2.�����ұߵľ���
				g.fill3DRect(x+15, y, 5, 30,false);
				//3.�����м�ľ���
				g.fill3DRect(x+5, y+5, 10, 20,false);
				//4.�����м��Բ
				g.fillOval(x+5, y+10, 10, 10);
				//5.����ֱ�ߣ���Ͳ��
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
		//�ƶ���w--����  d--����  s--����  a--����
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
		
		//�����ӵ�
		if(arg0.getKeyCode()==KeyEvent.VK_J){
			
		}
		
		//�ػ�
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
