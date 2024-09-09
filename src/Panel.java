import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel implements Runnable {
    public int screenWidth = 1600;
    public int screenHeight = 1200;
    int FPS = 120;
    Thread thread;
    KeyHandler keyHandler = new KeyHandler(this);
    Player player = new Player(this, keyHandler);
    Deutsch deutsch = new Deutsch(this);
    Collision collision = new Collision(this);

    public Panel (){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.lightGray);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyHandler);
        this.setFocusable(true);
    }

    public void startThread(){
        thread = new Thread(this);
        thread.start();
    }

    public void update() {
        player.move();
        player.wining();
        deutsch.checkBuchstabe();
    }

    @Override
    public void run() {
        double timePerFrame = (double) 1000000000 /FPS;
        long lastFrame = System.nanoTime();
        long now;

        int frames = 0;
        long lastCheck = System.currentTimeMillis();

        while(player.speed != 0){
            now = System.nanoTime();
            if (now - lastFrame >= timePerFrame){
                repaint();
                update();
                lastFrame = now;
                frames++;
            }

            if(System.currentTimeMillis() - lastCheck >= 1000){
                lastCheck = System.currentTimeMillis();
                System.out.println("FPS: " + frames);
                System.out.println(deutsch.countOfLettersArray);
                frames = 0;
            }
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.gray);
        g2d.fillRect(0,650,screenWidth,50);

        player.draw(g2d);
        deutsch.draw(g2d);

        g2d.dispose();
    }
}
