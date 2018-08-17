import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main extends JComponent {

    private static int MAX_DEPTH = 3;

    private static Random rnd = new Random();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x0 = 500;
        int y0 = 500;
        int width = 400;
        Graphics2D graphics = (Graphics2D) g;
        int strokeWidth = 30;
        drawSquare(graphics, x0, y0, width, 0, strokeWidth);
    }

    private void drawSquare(Graphics2D g, int x0, int y0, int width, int depth, float strokeWidth) {
        if (depth > MAX_DEPTH) {
            return;
        }
        Color color = new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        g.setColor(color);
        g.setStroke(new BasicStroke(strokeWidth));
        g.fillRect(x0 - width / 2, y0 - width / 2, width, width);
        drawSquare(g, x0 - width / 2, y0 - width / 2, width / 2, depth + 1, strokeWidth / 2);
        drawSquare(g, x0 + width / 2, y0 - width / 2, width / 2, depth + 1, strokeWidth / 2);
        drawSquare(g, x0 - width / 2, y0 + width / 2, width / 2, depth + 1, strokeWidth / 2);
        drawSquare(g, x0 + width / 2, y0 + width / 2, width / 2, depth + 1, strokeWidth / 2);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("fractal");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Main main = new Main();
        main.setPreferredSize(new Dimension(1000, 1000));
        frame.getContentPane().add(main);
        frame.pack();
        frame.setVisible(true);
    }
}