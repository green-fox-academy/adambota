import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        int[] topPoint = new int[2];
        int[] leftPoint = new int[2];
        int[] rightPoint = new int[2];
        int side = 20;
        int height = (int) (Math.sqrt(3) / 2 * side);
        int lines = 21;
        int currentLine = 0;

        for (int i = 0; i < lines; i++) {
            currentLine++;
            int firstX = WIDTH / 2 - i * (side / 2);
            for (int j = 0; j < currentLine; j++) {
                topPoint[0] = firstX + j * side;
                topPoint[1] = height * i;
                leftPoint[0] = topPoint[0] - side / 2;
                leftPoint[1] = topPoint[1] + height;
                rightPoint[0] = leftPoint[0] + side;
                rightPoint[1] = topPoint[1] + height;
                drawTriangle(graphics, topPoint, leftPoint, rightPoint);
            }
        }
    }

    public static void drawTriangle(Graphics graphics, int[] topPoint, int[] leftPoint, int[] rightPoint) {
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke((float) 1.5));
        g2.drawLine(topPoint[0], topPoint[1], leftPoint[0], leftPoint[1]);
        g2.drawLine(leftPoint[0], leftPoint[1], rightPoint[0], rightPoint[1]);
        g2.drawLine(rightPoint[0], rightPoint[1], topPoint[0], topPoint[1]);
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
        }
    }
}