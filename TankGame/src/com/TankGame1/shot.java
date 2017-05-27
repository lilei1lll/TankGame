package com.TankGame1;


//子弹类
public class shot implements Runnable{
	int x;
	int y;
	int direct;
	int speed;
	
	//构造函数
	public shot(int x,int y,int direct){
		this.x = x;
		this.y =y;
		this.direct = direct;
	}
	
	//重写run方法
	public void run() {
		while(true){
			//方向 : 0--上    1--右  2--下  3--左
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
