import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        graphics.setColor(Color.green);
        int[][] arr1 = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
        connectDots(graphics, arr1);
        int[][] arr2 = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}};
        connectDots(graphics, arr2);
        int[][] arr3 = {{120, 100}, {85, 130}, {50, 100}};
        connectDots(graphics, arr3);
    }

    public static void connectDots(Graphics graphics, int[][] dots) {
        for (int i = 0; i < dots.length - 1; i++) {
            int x = dots[i][0];
            int y = dots[i][1];
            int x2 = dots[i + 1][0];
            int y2 = dots[i + 1][1];
            graphics.drawLine(x, y, x2, y2);
        }
        graphics.drawLine(dots[0][0], dots[0][1], dots[dots.length - 1][0], dots[dots.length - 1][1]);
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
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}