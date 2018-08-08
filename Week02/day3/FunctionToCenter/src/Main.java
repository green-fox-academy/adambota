import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        for (int i = 0; i <= WIDTH; i += 20) {
            drawFromX(graphics, i, true);
            drawFromX(graphics, i, false);
            drawFromY(graphics, i, true);
            drawFromY(graphics, i, false);
        }
    }

    public static void drawToCenter(Graphics graphics, int x, int y) {
        graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
    }

    public static void drawFromX(Graphics graphics, int x, boolean top) {
        if (top) drawToCenter(graphics, x, 0);
        else drawToCenter(graphics, x, HEIGHT);
    }

    public static void drawFromY(Graphics graphics, int y, boolean left) {
        if (left) drawToCenter(graphics, 0, y);
        else drawToCenter(graphics, WIDTH, y);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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
        }
    }
}