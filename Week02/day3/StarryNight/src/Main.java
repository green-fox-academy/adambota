import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        Color[] colors = {new Color(105, 105, 105), new Color(58, 58, 58), new Color(148, 148, 148)};
        for (int i = 0; i < 30; i++) {
            int randX = (int) (Math.random() * (WIDTH - 10));
            int randY = (int) (Math.random() * (HEIGHT - 10));
            Color randomColor = colors[(int) (Math.random() * 3)];
            graphics.setColor(randomColor);
            graphics.fillRect(randX, randY, 10, 10);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.getContentPane().setBackground(Color.black);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}