
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jackinthebox implements ActionListener {
	int counter = 0;

	public static void main(String[] args) {
		Jackinthebox Jack;
		Jack = new Jackinthebox();
		Jack.JackintheBoxisout();

	}

	void JackintheBoxisout() {
		JFrame frame = new JFrame();
		JButton button = new JButton();
		button.setText("Surprise");
		frame.setVisible(true);
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
	}

	private void showPicture(String fileName) {
		try {
			JLabel imageLabel = createLabelImage(fileName);
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel createLabelImage(String fileName) {
		try {
			URL imageURL = getClass().getResource(fileName);
			if (imageURL == null) {
				System.err.println("Could not find image " + fileName);
				return new JLabel();
			} else {
				Icon icon = new ImageIcon(imageURL);
				JLabel imageLabel = new JLabel(icon);
				return imageLabel;
			}
		} catch (Exception e) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
	}

	private void playSound(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		counter++;
		if (counter == 5) {
			showPicture("jackinTheBox.png");
			playSound("homer-woohoo.wav");
		}
	}

}
