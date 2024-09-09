import java.awt.*;
import java.awt.image.BufferedImage;

public class Letter {
    public double x, y;
    public int width, height, nummer;
    char charackter;
    HitBox hitBox;
    BufferedImage image;

    public Letter(BufferedImage image, char charackter, int nummer, double x, double y, int width, int height){
        this.image = image;
        this.charackter = charackter;
        this.nummer = nummer;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        hitBox = new HitBox(x, y, width, height);
    }

    public Color randomColor(){
        Color[] color = new Color[9];

        color[0] = Color.blue;
        color[1] = Color.cyan;
        color[2] = Color.green;
        color[3] = Color.magenta;
        color[4] = Color.orange;
        color[5] = Color.pink;
        color[6] = Color.red;
        color[7] = Color.white;
        color[8] = Color.yellow;

        int i = (int) (Math.random() * 9);

        return color[i];
    }

    public void draw (Graphics2D g){
        g.drawImage(image, (int) x, (int) y, width, height, randomColor(),null);

        if(hitBox != null)
            hitBox.drawHitBox(g);
    }
}
