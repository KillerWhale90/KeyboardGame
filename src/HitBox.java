import java.awt.*;

public class HitBox {
    double x, y;
    int width, height;
    public HitBox (double x, double y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void drawHitBox (Graphics2D g){
        g.setColor(Color.BLACK);
        g.drawRect( (int) x, (int) y, width, height);
    }
}
