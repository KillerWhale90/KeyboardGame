import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame mainWindow = new JFrame();
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setResizable(false);
        mainWindow.setTitle("KeyboardGame");

        Panel panel = new Panel();
        mainWindow.add(panel);
        mainWindow.pack();

        mainWindow.setLocationRelativeTo(null);
        mainWindow.setVisible(true);

        panel.startThread();
    }
}