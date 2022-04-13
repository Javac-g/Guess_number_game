import javafx.scene.layout.Border;

import javax.annotation.Generated;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class Model {

    Random r;
    Integer firstSecret,SecondSecret,ThirdSecret,GuessOne,GuessTwo,GuessThree;
    BufferedImage hidden1,hidden2,hidden3;
    BufferedImage ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE;

    static JFrame frame;
    static JPanel panel;

    JLabel numOne,numTwo,numThree;
    JTextField oneT, twoT, threeT;
    JButton button;

    Dimension dim;



    void create() throws IOException {
        dim = Toolkit.getDefaultToolkit().getScreenSize();

        frame = new JFrame("GUESS NUMBER GAME");
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setSize(400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel(){
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(400, 500);
            }
        };


        hidden1 = ImageIO.read(getClass().getResource("Q.png"));
        hidden2 = ImageIO.read(getClass().getResource("Q.png"));
        hidden3 = ImageIO.read(getClass().getResource("Q.png"));
        ONE =  ImageIO.read(getClass().getResource("1.png"));
        TWO = ImageIO.read(getClass().getResource("2.png"));
        THREE = ImageIO.read(getClass().getResource("3.png"));





        numOne = new JLabel(new ImageIcon(hidden1));
        numTwo = new JLabel(new ImageIcon(hidden2));
        numThree = new JLabel(new ImageIcon(hidden3));

        oneT = new JTextField();
        twoT = new JTextField();
        threeT = new JTextField();
        button = new JButton("ENTER");

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
    void game(){

        firstSecret = r.nextInt(9);
        SecondSecret = r.nextInt(9);
        ThirdSecret = r.nextInt(9);

        button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                //Add a 1 to the last selected text field
                GuessOne = Integer.valueOf(oneT.getText());
                GuessTwo = Integer.valueOf(twoT.getText());
                GuessThree = Integer.valueOf(threeT.getText());


            }
        });

        if(GuessOne.equals(firstSecret)){

        }


    }


}
