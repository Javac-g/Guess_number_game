import javafx.scene.layout.Border;

import javax.annotation.Generated;
import javax.swing.*;
import java.awt.*;

public class Model {
    void create(){
        JFrame frame = new JFrame("GUESS NUMBER GAME");
        JPanel panel = new JPanel();
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Max.000\\IdeaProjects\\Guess_Number_Game\\Q.png");
        JLabel numOne = new JLabel("ONE"); //JLabel Creation
        JLabel numTwo = new JLabel("TWO");
        JLabel numThree = new JLabel("THREE");

        numOne.setBounds(10,10,50,100);
        numTwo.setBounds(70,10,50,100);
        numThree.setBounds(130,10,50,100);

        numOne.setOpaque(true);
        numTwo.setOpaque(true);
        numThree.setOpaque(true);

        numOne.setIcon(imageIcon);

        numOne.setBackground(Color.green);
        numOne.setForeground(Color.green);
        numTwo.setBackground(Color.YELLOW);
        numThree.setBackground(Color.BLUE);

        panel.add(numOne);
        panel.add(numTwo);
        panel.add(numThree);

        panel.setBounds(40,80,300,300);
        panel.setBackground(Color.gray);

        frame.setLayout(null);
        frame.add(panel);
        frame.setVisible(true);





    }

}
