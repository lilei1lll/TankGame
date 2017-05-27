/*
 * 坦克类
 */
package com.TankGame1;

public class Tank {
	//表示横坐标
	   int x = 0;
	
	//表示纵坐标
		int y = 0;
	
	//速度
		int speed =1;
		

	//方向 0表示向上    1--右  2--下  3--左
		int direct = 0;
		
	//颜色（类型）
		int color;
	
	public int getColor() {
			return color;
		}

		public void setColor(int color) {
			this.color = color;
		}

	public Tank(int x,int y){
			this.x = x;
			this.y = y;
		}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDirect() {
		return direct;
	}

	public void setDirect(int direct) {
		this.direct = direct;
	}

	public void MoveUp(){
		y -= speed;
	}
	public void MoveRight(){
		x += speed;
	}
	public void MoveDown(){
		y += speed;
	}
	public void MoveLeft(){
		x -=speed;
	}
}
