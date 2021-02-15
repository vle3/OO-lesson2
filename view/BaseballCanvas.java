package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class BaseballCanvas extends JPanel
{
    public static int WIDTH = 500 ; 
    public static int HEIGHT = 500;

    private BaseballGamePanel panel;

    public BaseballCanvas(BaseballGamePanel panel)
    {
        this.panel = panel;
        setPreferredSize(new Dimension(WIDTH , HEIGHT));
        setBackground(Color.BLACK);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        // custom drawing

        Graphics2D g2 = (Graphics2D) g;

        // ready to play
        BaseballGamePanel.GameState state = panel.getGameState();
        if(state == BaseballGamePanel.GameState.READY)
        {
            g2.setColor(Color.YELLOW);
            g2.setFont(new Font("New Courier", Font.BOLD, 30));
            g2.drawString("Click <Play> to Start", 100 , 150);
        }
    }
}
