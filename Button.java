import javax.swing.*;
import java.awt.*;

public class Button extends JButton{
    public Button(){}
    public Button(String text, String iconpath){
        setPreferredSize(new Dimension(100, 100));
       //   setBounds(x_pos, y_pos, 30, 25);
       //   setBorder(new RoundedBorder(10));
        setText(text);


        ImageIcon image = new ImageIcon(iconpath);
        Image scaleImage = image.getImage().getScaledInstance(28, 28,Image.SCALE_DEFAULT);
        setIcon(new ImageIcon(scaleImage));

    }
}
