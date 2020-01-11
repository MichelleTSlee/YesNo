package slee.michelle.YesNoGame;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class YesNo extends JFrame {

    private static final long serialVersionUID = 1L;
    private static final String[] ANSWER = {"Go for it", "Almost certainly", "Of course", "Definitely not", "Please don't!", "Not at all"};

    public YesNo()  {

        Random rand = new Random();
        int numberOfAnswers = ANSWER.length;
        int pick = rand.nextInt(numberOfAnswers - 1);
        String answer = ANSWER[pick];


        JLabel label = new JLabel();
        label.setText(answer);
        Font font = new Font(Font.SERIF, Font.BOLD + Font.ITALIC, 22);
        label.setFont(font);
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);

        setTitle("Yes Or No Game");
        setPreferredSize(new Dimension(500, 250));
        pack(); //Sizes window to fit contents
        setLocationRelativeTo(null);//This puts the panel in the centre of screen
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        System.out.println("What's your question?");
        Scanner in = new Scanner(System.in);
        String question = in.next();
        try{
            String className = UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(className);
        } catch(Exception e) {};
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new YesNo();
            }
        });
    }
}
