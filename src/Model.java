import javafx.scene.layout.Border;

import javax.annotation.Generated;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Model implements ActionListener {

    Random r = new Random();
    Integer firstSecret,SecondSecret,ThirdSecret;
    Integer GuessOne ;
    Integer GuessTwo ;
    Integer GuessThree ;
    BufferedImage hidden1,hidden2,hidden3;
    BufferedImage ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,ZERO;

    static JFrame frame;
    static JPanel panel;

    JLabel numOne,numTwo,numThree,x,y,z;
    JTextField oneT, twoT, threeT;
    JButton button;

    Dimension dim;


    void create() throws IOException {
        dim = Toolkit.getDefaultToolkit().getScreenSize();

        frame = new JFrame("GUESS NUMBER GAME");
        frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel() {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(400, 500);
            }
        };


        hidden1 = ImageIO.read(getClass().getResource("Q.png"));
        hidden2 = ImageIO.read(getClass().getResource("Q.png"));
        hidden3 = ImageIO.read(getClass().getResource("Q.png"));
        ONE = ImageIO.read(getClass().getResource("1.png"));
        TWO = ImageIO.read(getClass().getResource("2.png"));
        THREE = ImageIO.read(getClass().getResource("3.png"));
        FOUR = ImageIO.read(getClass().getResource("4.png"));
        FIVE = ImageIO.read(getClass().getResource("5.png"));
        SIX = ImageIO.read(getClass().getResource("6.png"));
        SEVEN = ImageIO.read(getClass().getResource("7.png"));
        EIGHT = ImageIO.read(getClass().getResource("8.png"));
        NINE = ImageIO.read(getClass().getResource("9.png"));
        ZERO = ImageIO.read(getClass().getResource("0.png"));


        numOne = new JLabel();
        numTwo = new JLabel();
        numThree = new JLabel();

        x = new JLabel("XXXX");
        y = new JLabel("YYYY");
        z = new JLabel("ZZZZ");


        numOne.setIcon(new ImageIcon(hidden1));
        numTwo.setIcon(new ImageIcon(hidden2));
        numThree.setIcon(new ImageIcon(hidden3));


        oneT = new JTextField();
        twoT = new JTextField();
        threeT = new JTextField();
        button = new JButton("ENTER");

        oneT.setBounds(10, 210, 120, 30);
        x.setBounds(50, 160, 120, 200);
        x.setForeground(Color.RED);
        y.setBounds(180, 160, 120, 200);
        y.setForeground(Color.RED);
        z.setBounds(310, 160, 120, 200);
        z.setForeground(Color.RED);
        twoT.setBounds(140, 210, 120, 30);
        threeT.setBounds(270, 210, 120, 30);
        button.setBounds(140, 420, 120, 60);
        numOne.setBounds(10, 10, 120, 200);
        numTwo.setBounds(140, 10, 120, 200);
        numThree.setBounds(270, 10, 120, 200);

        numOne.setOpaque(true);
        numTwo.setOpaque(true);
        numThree.setOpaque(true);


        numOne.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0)));
        numTwo.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0)));
        numThree.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0)));

        panel.setBackground(Color.DARK_GRAY);
        frame.add(x);
        frame.add(y);
        frame.add(z);
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


        firstSecret = r.nextInt(9);
        SecondSecret = r.nextInt(9);
        ThirdSecret = r.nextInt(9);

        x.setText(firstSecret + " :Val");
        y.setText(SecondSecret + " :Val");
        z.setText(ThirdSecret + " :Val");
        button.addActionListener(this);
    }





    @Override
    public void actionPerformed(ActionEvent e) {
        GuessOne = Integer.parseInt(oneT.getText());
        GuessTwo = Integer.parseInt(twoT.getText());
        GuessThree = Integer.parseInt(threeT.getText());
            x.setText(GuessOne + " :Guess");


            if(GuessOne == firstSecret){
                if(firstSecret == 1){
                    numOne.setIcon(new ImageIcon(ONE));
                }
                if(firstSecret == 2){
                    numOne.setIcon(new ImageIcon(TWO));
                }
                if(firstSecret == 3){
                    numOne.setIcon(new ImageIcon(THREE));
                }
                if(firstSecret == 4){
                    numOne.setIcon(new ImageIcon(FOUR));
                }
                if(firstSecret == 5){
                    numOne.setIcon(new ImageIcon(FIVE));
                }
                if(firstSecret == 6){
                    numOne.setIcon(new ImageIcon(SIX));
                }
                if(firstSecret == 7){
                    numOne.setIcon(new ImageIcon(SEVEN));
                }
                if(firstSecret == 8){
                    numOne.setIcon(new ImageIcon(EIGHT));
                }
                if(firstSecret == 9){
                    numOne.setIcon(new ImageIcon(EIGHT));
                }
                if(firstSecret == 0){
                    numOne.setIcon(new ImageIcon(ZERO));
                }

            }
        else if(GuessOne==firstSecret &  GuessTwo == SecondSecret){
            if(firstSecret == 1 & SecondSecret == 2){
                numOne.setIcon(new ImageIcon(ONE));
                numTwo.setIcon( new ImageIcon(ONE));
            }
            if(firstSecret == 2 & SecondSecret == 2){
                numOne.setIcon(new ImageIcon(TWO));
                numTwo.setIcon( new ImageIcon(TWO));
            }
            if(firstSecret ==3 & SecondSecret == 3){
                numOne.setIcon(new ImageIcon(THREE));
                numTwo.setIcon( new ImageIcon(THREE));

            }
            if(firstSecret == 4 & SecondSecret == 4){
                numOne.setIcon(new ImageIcon(FOUR));
                numTwo.setIcon( new ImageIcon(FOUR));
            }
            if(firstSecret == 5 & SecondSecret == 5){
                numOne.setIcon(new ImageIcon(FIVE));
                numTwo.setIcon( new ImageIcon(FIVE));
            }
            if(firstSecret == 6 & SecondSecret == 6){
                numOne.setIcon(new ImageIcon(SIX));
                numTwo.setIcon( new ImageIcon(SIX));
            }
            if(firstSecret == 7 & SecondSecret == 7){
                numOne.setIcon(new ImageIcon(SEVEN));
                numTwo.setIcon( new ImageIcon(SEVEN));
            }
            if(firstSecret == 8 & SecondSecret ==  8){
                numOne.setIcon(new ImageIcon(EIGHT));
                numTwo.setIcon( new ImageIcon(EIGHT));
            }
            if(firstSecret == 9 & SecondSecret == 9){
                numOne.setIcon(new ImageIcon(NINE));
                numTwo.setIcon( new ImageIcon(NINE));

            }
            if(firstSecret == 0 & SecondSecret == 0){
                numOne.setIcon(new ImageIcon(ZERO));
                numTwo.setIcon( new ImageIcon(ZERO));
            }

        }


        }

    }

