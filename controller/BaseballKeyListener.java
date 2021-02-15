package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import view.BaseballGamePanel;

public class BaseballKeyListener implements ActionListener 
{
    private BaseballGamePanel panel;

    public BaseballKeyListener(BaseballGamePanel panel)
    {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        // TODO Auto-generated method stub
        JButton button = (JButton) e.getSource();
        System.out.println(button.getText());
    }
    
}
