package day1.robot;

import java.awt.Color;
import java.awt.Graphics2D;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot rick=new Robot(400,400);
rick.penDown();
rick.setSpeed(5);
rick.setPenColor(Color.RED);
int sides=0;
while(sides<10){
rick.move(400);
rick.turn(200);
sides=sides+1;
}

Robot carl=new Robot();
carl.penDown();
sides=0;
while(sides<4){
carl.move(100);
carl.turn(90);
sides=sides+1;

}



		
	}
}
