package extra;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob = new Robot();

	public static void main(String[] args) {
		rob.moveTo(70, 550);
		rob.penDown();
		Random rand = new Random();
		for (int i = 0; i < 9; i++) {
			flathouse("small", Color.blue);
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

		rob.setPenColor(my_col);
		rob.setPenWidth(7);

		rob.miniaturize();
		rob.move(height);
		rob.turn(90);
		rob.move(30);
		rob.turn(90);
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(0, 51, 0);
		rob.move(20);
		rob.turn(-90);

	}
}
