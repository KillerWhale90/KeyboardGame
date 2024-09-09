import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Player {
    public double x, y, speed;
    public int width, height;
    Panel panel;
    KeyHandler keyHandler;
    HitBox hitBox;
    boolean isWining = false;
    BufferedImage[] emojis = new BufferedImage[3];

    public Player (Panel panel, KeyHandler keyHandler){
        this.panel = panel;
        this.keyHandler = keyHandler;
        x = 50;
        y = 600;
        width = 50;
        height = 50;
        speed = 0.5;
        hitBox = new HitBox(x, y, width, height);
        setEmojis();
    }

    public void setEmojis(){
        try {
            emojis[0] = ImageIO.read(new File("resources/emoji/happy.png"));
            emojis[1] = ImageIO.read(new File("resources/emoji/sad.png"));
            emojis[2] = ImageIO.read(new File("resources/emoji/neutral.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void wining(){
        if(panel.deutsch.letters[panel.deutsch.letters.length - 1].image == null){
            isWining = true;
        }
    }

    public void move(){
        for(int i = 0; i < panel.deutsch.letters.length; i++){
            if(panel.collision.isCollision(hitBox, panel.deutsch.letters[i].hitBox) || isWining){
                speed = 0;
            }

        }

        hitBox.x = x;
        hitBox.y = y;
        x += speed;
    }

    public void draw(Graphics2D g){
        g.setColor(Color.white);
//        g.fillRect( (int) x, (int) y, width, height);
        g.drawImage(emojis[2], (int) x, (int) y, 50, 50, null);
//        hitBox.drawHitBox(g);
        if(speed == 0 && !isWining){
            g.drawImage(emojis[1], (int) x, (int) y, 50, 50, null);
            g.drawString("GAME OVER", panel.screenWidth/2 - 50,200);
        } else if (speed == 0 && isWining) {
            g.drawImage(emojis[0], (int) x, (int) y, 50, 50, null);
            g.drawString("YOU ARE WINING!!!", panel.screenWidth/2 - 50,200);
        }
    }
}
