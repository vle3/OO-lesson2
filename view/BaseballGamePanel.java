package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BaseballGamePanel
{
    private JFrame window;
    private JTextField gameKeyField = new JTextField();
    private JTextField guessField = new JTextField();
    private JButton[] digitButtons;
    private JButton playButton = new JButton("Play Ball ~~");
    private JButton exitButton = new JButton("Exit");
    
    public BaseballGamePanel(JFrame window)
    {
        this.window = window;
    }

    public void init()
    {
        Container cp = window.getContentPane();

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2,2));
        northPanel.add(new JLabel("Secret Game Key: "));
        northPanel.add(gameKeyField);
        northPanel.add(new JLabel("Your Guess: "));
        northPanel.add(guessField);
        gameKeyField.setEditable(false);
        guessField.setEditable(false);

        cp.add(BorderLayout.NORTH, northPanel);
    }
}
