import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        int lines = 30;
        for (int i = 0; i < 17; i++) {
            graphics.setColor(Color.cyan);
            graphics.drawLine(i * lines, 1, WIDTH, 10 + i * lines);
        }
        for (int i = 0; i < 17; i++) {
            graphics.setColor(Color.green);
            graphics.drawLine(1, i * lines, 10 + i * lines, HEIGHT);
        }
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
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
            setBackground(Color.gray);
        }
    }
}