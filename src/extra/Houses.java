package extra;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob = new Robot();

	public static void main(String[] args) {
		rob.moveTo(70, 550);
		rob.penDown();
		String size= "small";
		Random rand = new Random();
		for (int i = 0; i < 4; i++) {
			int r=rand.nextInt(3);
			if(r==0) {
				size="small";
			}
			else if(r==1) {
				size="medium";
			}else {
				size="large";
			}
			
			flathouse("large", Color.blue);
			drawPointyroof(size, Color.BLUE);
		}
	}

	static void flathouse(String str_height, Color my_col) {
		int height = 10;
		if (str_height.equals("small")) {
			height = 60;
		} else if (str_height.equals("medium")) {
			height = 120;
		} else if (str_height.equals("large")) {
			height = 250;
		}
       
		rob.setSpeed(5);

		rob.setRandomPenColor();
		rob.setPenWidth(7);

		rob.miniaturize();
		rob.move(height);
		rob.turn(90);
		rob.move(30);
		rob.turn(90);
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(Color.GREEN);
		rob.move(20);
		rob.turn(-90);
	}
	static void drawPointyroof(String str_height, Color my_col) {
		int height= 10;
		if (str_height.equals("small")) {
			height = 60;
		} else if (str_height.equals("medium")) {
			height = 120;
		} else if (str_height.equals("large")) {
			height = 250;
		}
		
		rob.setSpeed(5);
		rob.setRandomPenColor();
		rob.setPenWidth(7);
		rob.miniaturize();
		rob.move(height);
		rob.turn(45);
		rob.move(30);
		rob.turn(90);
		rob.move(30);
		rob.turn(45);
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(Color.GREEN);
		rob.move(20);
		rob.turn(-90);
		
		
		
	}
}
