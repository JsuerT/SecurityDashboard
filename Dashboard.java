import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame{
    public Dashboard(){
        JPanel panel = new JPanel();
        setSize(1000, 700);
        setTitle("SecurityDashboard");

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);


        //buttons
        /*JButton button_portscan = new JButton("hello");
          button_portscan.setPreferredSize(new Dimension (100, 100));
          button_portscan.setIcon(new ImageIcon("Assets/Icons/blueDoor.png"));
          */


        Button button_portscan = new Button("text", "Assets/Icons/blueDoor.png");


        //panel config
        panel.add(button_portscan);
        panel.setBackground(new java.awt.Color(28, 28, 70));
        add(panel);

        setVisible(true);

    }


}
