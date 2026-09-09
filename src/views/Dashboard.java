package views;

import javax.swing.*;
import java.awt.*;
import components.Button;

public class Dashboard extends JFrame{
    public Dashboard(){
        //hier irgendwann noch ein layout manager 

        JPanel panel = new JPanel();
        setSize(1000, 700);
        setTitle("SecurityDashboard");

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);


        Button button_portscan = new Button("text", "Assets/Icons/blueDoor.png");
        Button buttonzwei = new Button("hello", "Assets/Icons/blueDoor.png");

        panel.setLayout(new FlowLayout()); 
        panel.add(button_portscan);
        panel.add(buttonzwei);
        panel.setBackground(new java.awt.Color(24, 26, 27));
        add(panel);

        setVisible(true);

    }


}
