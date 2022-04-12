import javafx.scene.layout.Border;

import javax.annotation.Generated;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Model {
    void create() throws IOException {
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

        BufferedImage hidden1 = ImageIO.read(getClass().getResource("Q.png"));
        BufferedImage hidden2 = ImageIO.read(getClass().getResource("Q.png"));
        BufferedImage hidden3 = ImageIO.read(getClass().getResource("Q.png"));


        JLabel numOne = new JLabel(new ImageIcon(hidden1));
        JLabel numTwo = new JLabel(new ImageIcon(hidden2));
        JLabel numThree = new JLabel(new ImageIcon(hidden3));

        JTextField oneT = new JTextField();
        JTextField twoT = new JTextField();
        JTextField threeT = new JTextField();
        JButton button = new JButton("ENTER");

        oneT.setBounds(10,210,120,30);
        twoT.setBounds(140,210,120,30);
        threeT.setBounds(270,210,120,30);
        button.setBounds(140,420,120,60);
        numOne.setBounds(10,10,120,200);
        numTwo.setBounds(140,10,120,200);
        numThree.setBounds(270,10,120,200);

        numOne.setOpaque(true);
        numTwo.setOpaque(true);
        numThree.setOpaque(true);


        numOne.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0)));
        numTwo.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0)));
        numThree.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0)));






        panel.setBackground(Color.DARK_GRAY);

        frame.add(oneT);
        frame.add(twoT);
        frame.add(threeT);
        frame.add(button);
        frame.add(numOne);
        frame.add(numTwo);
        frame.add(numThree);
        frame.add(panel);

        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);





    }

}
