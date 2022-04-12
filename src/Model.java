import javafx.scene.layout.Border;

import javax.annotation.Generated;
import javax.swing.*;
import java.awt.*;

public class Model {
    void create(){
        JFrame frame = new JFrame("GUESS NUMBER GAME");
        JPanel panel = new JPanel(){
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(400, 500);
            }
        };

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setSize(400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Max.000\\IdeaProjects\\Guess_Number_Game\\Q.png");
        JLabel numOne = new JLabel("ONE"); //JLabel Creation
        JLabel numTwo = new JLabel("TWO");
        JLabel numThree = new JLabel("THREE");

        numOne.setBounds(10,10,120,200);
        numTwo.setBounds(140,10,120,200);
        numThree.setBounds(270,10,120,200);

        numOne.setOpaque(true);
        numTwo.setOpaque(true);
        numThree.setOpaque(true);

        numOne.setIcon(imageIcon);

        numOne.setBackground(Color.green);
        numTwo.setBackground(Color.YELLOW);
        numThree.setBackground(Color.BLUE);



        frame.add(numOne);
        frame.add(numTwo);
        frame.add(numThree);




        panel.setBackground(Color.DARK_GRAY);

        frame.setLocationRelativeTo(null);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);





    }

}
