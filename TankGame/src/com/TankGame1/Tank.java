/*
 * ̹����
 */
package com.TankGame1;

public class Tank {
	//��ʾ������
	   int x = 0;
	
	//��ʾ������
		int y = 0;
	
	//�ٶ�
		int speed =1;
		

	//���� 0��ʾ����    1--��  2--��  3--��
		int direct = 0;
		
	//��ɫ�����ͣ�
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
