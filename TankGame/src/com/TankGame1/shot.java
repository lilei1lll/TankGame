package com.TankGame1;


//�ӵ���
public class shot implements Runnable{
	int x;
	int y;
	int direct;
	int speed;
	
	//���캯��
	public shot(int x,int y,int direct){
		this.x = x;
		this.y =y;
		this.direct = direct;
	}
	
	//��дrun����
	public void run() {
		while(true){
			//���� : 0--��    1--��  2--��  3--��
			switch(direct)
			{
			 case 0:
				 y-=speed;
				 break;
			 case 1:
				 x+=speed;
				 break;
			 case 2:
				 y+=speed;
				 break;
			 case 3:
				 x-=speed;
				 break;
			}
			if(x<0||x>200||y<0||y>300){
				break;
			}
		}
	}
}
