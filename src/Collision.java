public class Collision {
    Panel panel;
    Collision(Panel panel){
        this.panel = panel;
    }
    public boolean isCollision (HitBox a, HitBox b){
        if(b == null){
            return false;
        }
        return !((a.x + a.width) < b.x);
    }
}
