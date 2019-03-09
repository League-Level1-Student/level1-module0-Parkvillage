/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
                String url="https://www.gannett-cdn.com/presto/2019/02/25/USAT/f671122d-833f-49ee-a96a-14d06784b591-EPA_USA_TRUMP_GOVERNORS.JPG?crop=4183,2343,x0,y166&width=3200&height=1680&fit=bounds";
		// 2. create a variable of type "Component" that will hold your image
        Component url2;
		// 3. use the "createImage()" method below to initialize your Component
          url2= createImage(url);
		// 4. add the image to the quiz window
     quizWindow.add(url2);
		// 5. call the pack() method on the quiz window
     quizWindow.pack();
		// 6. ask a question that relates to the image
     String question=JOptionPane.showInputDialog(null, " Fake news" );
		// 7. print "CORRECT" if the user gave the right answer
     if(question.equals("Donald Trump")) {
    	       JOptionPane.showMessageDialog(null, "CoRrEcT");
     }
		// 8. print "INCORRECT" if the answer is wrong
     else{
    	  JOptionPane.showMessageDialog(null, "InCoRrEcT");
     }
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
             quizWindow.remove(url2);
		// 10. find another image and create it (might take more than one line of code)
         String img="http://ppcorn.com/us/wp-content/uploads/sites/14/2016/01/Mark-Zuckerberg-pop-art-ppcorn.jpg";
         Component img2;
         img2= createImage(img);
		// 11. add the second image to the quiz window
                      quizWindow.add(img2);
		// 12. pack the quiz window
        quizWindow.pack();
		// 13. ask another question
     String answer=JOptionPane.showInputDialog(null, "Facebook??");
		// 14+ check answer, say if correct or incorrect, etc.
            if(answer.equalsIgnoreCase("Mark Zucerberg")){
            	JOptionPane.showMessageDialog(null, "CORRECT!");
            }
            else {
             	JOptionPane.showMessageDialog(null, "INCORRECT!");
            }
            }
	

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





