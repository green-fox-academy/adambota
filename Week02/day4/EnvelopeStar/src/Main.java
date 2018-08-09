import javax.swing.*;

import java.awt.*;

import java.util.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {

    static Random rnd = new Random();

    public static void mainDraw(Graphics graphics) {
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke((float) 1.5));

        Color randomColor;
        for (int i = 0; i < 12; i++) {
            randomColor = randomColor();
            graphics.setColor(randomColor);
            graphics.drawLine(WIDTH / 2, (20 * i) + 5, WIDTH / 2 + i * 20, HEIGHT / 2);
            randomColor = randomColor();
            graphics.setColor(randomColor);
            graphics.drawLine(WIDTH / 2, (20 * i) + 5, WIDTH / 2 - i * 20, HEIGHT / 2);
            randomColor = randomColor();
            graphics.setColor(randomColor);
            graphics.drawLine(WIDTH / 2, HEIGHT - 5 - (20 * i), WIDTH / 2 + i * 20, HEIGHT / 2);
            randomColor = randomColor();
            graphics.setColor(randomColor);
            graphics.drawLine(WIDTH / 2, HEIGHT - 5 - (20 * i), WIDTH / 2 - i * 20, HEIGHT / 2);
        }
    }

    public static Color randomColor() {
        return new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.getContentPane().setBackground(Color.white);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
            setBackground(Color.white);
        }
    }
}