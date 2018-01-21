import java.awt.*;
import javax.swing.*;

class Canvas extends JComponent{

    StringBuffer s;

    public void setString(StringBuffer s) {
        this.s = s;
    }

    public void paintComponent(Graphics g){
        super.paintComponents(g);
        Graphics2D g2d=(Graphics2D)g;

        int x = 0;
        int y = 0;

        g2d.setColor(Color.blue);

        for(int i = 17; i > 0; i--)
        {
            int j = 1802 - i;
            while(j >= 0)
            {
                char check;
                check = s.charAt(j);

                if(check ==  '1') g2d.setColor(Color.blue);
                else g2d.setColor(Color.LIGHT_GRAY );

                g2d.fillOval(x, y, 10, 10);
                j = j - 17;
                x = x + 10;
            }
            y = y + 10;
            x = 0;
        }
    }
}