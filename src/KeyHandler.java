import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    Panel panel;
    char letter = ' ';
    public KeyHandler(Panel panel){
        this.panel = panel;
    }

    //    boolean a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, ae, oe, ue, ss;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if(keyCode == KeyEvent.VK_A){
            letter = 'a';
            System.out.println("last letter was - a");
        }
        if(keyCode == KeyEvent.VK_B){
            letter = 'b';
            System.out.println("last letter was - b");
        }
        if(keyCode == KeyEvent.VK_C) {
            letter = 'c';
            System.out.println("last letter was - c");
        }
        if(keyCode == KeyEvent.VK_D) {
            letter = 'd';
            System.out.println("last letter was - d");
        }
        if(keyCode == KeyEvent.VK_E) {
            letter = 'e';
            System.out.println("last letter was - e");
        }
        if(keyCode == KeyEvent.VK_F) {
            letter = 'f';
            System.out.println("last letter was - f");
        }
        if(keyCode == KeyEvent.VK_G) {
            letter = 'g';
            System.out.println("last letter was - g");
        }
        if(keyCode == KeyEvent.VK_H) {
            letter = 'h';
            System.out.println("last letter was - h");
        }
        if(keyCode == KeyEvent.VK_I) {
            letter = 'i';
            System.out.println("last letter was - i");
        }
        if(keyCode == KeyEvent.VK_J) {
            letter = 'j';
            System.out.println("last letter was - j");
        }
        if(keyCode == KeyEvent.VK_K) {
            letter = 'k';
            System.out.println("last letter was - k");
        }
        if(keyCode == KeyEvent.VK_L) {
            letter = 'l';
            System.out.println("last letter was - l");
        }
        if(keyCode == KeyEvent.VK_M) {
            letter = 'm';
            System.out.println("last letter was - m");
        }
        if(keyCode == KeyEvent.VK_N) {
            letter = 'n';
            System.out.println("last letter was - n");
        }
        if(keyCode == KeyEvent.VK_O) {
            letter = 'o';
            System.out.println("last letter was - o");
        }
        if(keyCode == KeyEvent.VK_P) {
            letter = 'p';
            System.out.println("last letter was - p");
        }
        if(keyCode == KeyEvent.VK_Q) {
            letter = 'q';
            System.out.println("last letter was - q");
        }
        if(keyCode == KeyEvent.VK_R) {
            letter = 'r';
            System.out.println("last letter was - r");
        }
        if(keyCode == KeyEvent.VK_S) {
            letter = 's';
            System.out.println("last letter was - s");
        }
        if(keyCode == KeyEvent.VK_T) {
            letter = 't';
            System.out.println("last letter was - t");
        }
        if(keyCode == KeyEvent.VK_U) {
            letter = 'u';
            System.out.println("last letter was - u");
        }
        if(keyCode == KeyEvent.VK_V) {
            letter = 'v';
            System.out.println("last letter was - v");
        }
        if(keyCode == KeyEvent.VK_W) {
            letter = 'w';
            System.out.println("last letter was - w");
        }
        if(keyCode == KeyEvent.VK_X) {
            letter = 'x';
            System.out.println("last letter was - x");
        }
        if(keyCode == KeyEvent.VK_Y) {
            letter = 'z';
            System.out.println("last letter was - z");
        }
        if(keyCode == KeyEvent.VK_Z) {
            letter = 'y';
            System.out.println("last letter was - y");
        }
        if(keyCode == KeyEvent.VK_QUOTE) {
            letter = 'ä';
            System.out.println("last letter was - ä");
        }
        if(keyCode == KeyEvent.VK_SEMICOLON) {
            letter = 'ö';
            System.out.println("last letter was - ö");
        }
        if(keyCode == KeyEvent.VK_OPEN_BRACKET) {
            letter = 'ü';
            System.out.println("last letter was - ü");
        }
        if(keyCode == KeyEvent.VK_MINUS) {
            letter = 'ß';
            System.out.println("last letter was - ß");
        }
        if(keyCode == KeyEvent.VK_SPACE){
            letter = '_';
            System.out.println("last letter was - _");
        }

//        if(keyCode == KeyEvent.VK_A)
//            a = true;
//        if(keyCode == KeyEvent.VK_B)
//            b = true;
//        if(keyCode == KeyEvent.VK_C)
//            c = true;
//        if(keyCode == KeyEvent.VK_D)
//            d = true;
//        if(keyCode == KeyEvent.VK_E)
//            this.e = true;
//        if(keyCode == KeyEvent.VK_F)
//            f = true;
//        if(keyCode == KeyEvent.VK_G)
//            g = true;
//        if(keyCode == KeyEvent.VK_H)
//            h = true;
//        if(keyCode == KeyEvent.VK_I)
//            i = true;
//        if(keyCode == KeyEvent.VK_J)
//            j = true;
//        if(keyCode == KeyEvent.VK_K)
//            k = true;
//        if(keyCode == KeyEvent.VK_L)
//            l = true;
//        if(keyCode == KeyEvent.VK_M)
//            m = true;
//        if(keyCode == KeyEvent.VK_N)
//            n = true;
//        if(keyCode == KeyEvent.VK_O)
//            o = true;
//        if(keyCode == KeyEvent.VK_P)
//            p = true;
//        if(keyCode == KeyEvent.VK_Q)
//            q = true;
//        if(keyCode == KeyEvent.VK_R)
//            r = true;
//        if(keyCode == KeyEvent.VK_S)
//            s = true;
//        if(keyCode == KeyEvent.VK_T)
//            t = true;
//        if(keyCode == KeyEvent.VK_U)
//            u = true;
//        if(keyCode == KeyEvent.VK_V)
//            v = true;
//        if(keyCode == KeyEvent.VK_W)
//            w = true;
//        if(keyCode == KeyEvent.VK_X)
//            x = true;
//        if(keyCode == KeyEvent.VK_Y)
//            z = true;
//        if(keyCode == KeyEvent.VK_Z)
//            y = true;
//        if(keyCode == KeyEvent.VK_QUOTE)
//            ae = true;
//        if(keyCode == KeyEvent.VK_SEMICOLON)
//            oe = true;
//        if(keyCode == KeyEvent.VK_OPEN_BRACKET)
//            ue = true;
//        if(keyCode == KeyEvent.VK_MINUS)
//            ss = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        int keyCode = e.getKeyCode();

//        if(keyCode == KeyEvent.VK_A){
//            a = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "a"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_B){
//            b = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "b"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_C){
//            c = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "c"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_D){
//            d = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "d"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_E){
//            this.e = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "e"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_F){
//            f = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "f"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_G){
//            g = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "g"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_H){
//            h = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "h"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_I){
//            i = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "i"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_J){
//            j = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "j"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_K){
//            k = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "k"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_L){
//            l = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "l"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_M){
//            m = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "m"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_N){
//            n = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "n"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_O){
//            o = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "o"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_P){
//            p = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "p"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_Q){
//            q = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "q"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_R){
//            r = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "r"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_S){
//            s = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "s"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_T){
//            t = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "t"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_U){
//            u = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "u"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_V){
//            v = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "v"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_W){
//            w = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "w"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_X){
//            x = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "x"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_Y){
//            y = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "y"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_Z){
//            z = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "z"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_QUOTE){
//            ae = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "ä"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_SEMICOLON){
//            oe = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "ö"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_OPEN_BRACKET){
//            ue = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "ü"){
//                panel.deutsch.i++;
//            }
//        }
//        if(keyCode == KeyEvent.VK_MINUS){
//            ss = false;
//            if(panel.deutsch.buchstabes[panel.deutsch.i].charackter == "ß"){
//                panel.deutsch.i++;
//            }
//        }
    }
}
