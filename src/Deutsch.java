import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Deutsch extends Alfabet {
    Panel panel;
    int x = 300;
    int countOfLettersArray =  0;
    String sentence = "nikolas";
    Deutsch (Panel panel) {
        this.panel = panel;
        try {
            initAlfabeth();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        initLvlSentece();
//        initLvlLetters();
    }
    char[] deutschLetters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z', 'ä', 'ö', 'ü', 'ß', '_'};
    BufferedImage[] bufferedImages = new BufferedImage[31];


    public void initAlfabeth() throws IOException {
        for(int i = 0; i < bufferedImages.length; i++){
            String path = "resources/alfabeth/" + i + ".jpg";
            bufferedImages[i] = ImageIO.read(new File(path));
        }
    }
    public static int randomLetters() {
        return (int) (Math.random() * 30);
    }

    Letter[] letters = new Letter[sentence.length()];

//    Letter[] letters = new Letter[15];

    public void initLvlSentece(){
        char[] temporaryArrayForSentence = sentence.toCharArray();

        for (int i = 0; i < letters.length; i++) {

            x += 50;

            for (int j = 0; j < deutschLetters.length; j++) {
                if(temporaryArrayForSentence[i] == deutschLetters[j]){
                    letters[i] = new Letter(bufferedImages[j], deutschLetters[j], i, x, 600, 50, 50);
                }
            }

            if(i == letters.length - 1){
                System.out.print(letters[i].charackter + "\n");
            }
            else {
                System.out.print(letters[i].charackter + ", ");
            }
        }
    }

    public void initLvlLetters(){
        for(int i = 0; i < letters.length; i++){
            x += 50;
            int randomChoice = randomLetters();
            letters[i] = new Letter(bufferedImages[randomChoice], deutschLetters[randomChoice], i, x, 500, 50, 50);

            if(i == letters.length - 1){
                System.out.print(letters[i].charackter + "\n");
            }
            else {
                System.out.print(letters[i].charackter + ", ");
            }
        }
    }

    public void checkBuchstabe() {
        if (panel.keyHandler.letter == 'a' && letters[countOfLettersArray].charackter == 'a') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'b' && letters[countOfLettersArray].charackter == 'b') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'c' && letters[countOfLettersArray].charackter == 'c') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'd' && letters[countOfLettersArray].charackter == 'd') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'e' && letters[countOfLettersArray].charackter == 'e') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'f' && letters[countOfLettersArray].charackter == 'f') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'g' && letters[countOfLettersArray].charackter == 'g') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'h' && letters[countOfLettersArray].charackter == 'h') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'i' && letters[countOfLettersArray].charackter == 'i') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'j' && letters[countOfLettersArray].charackter == 'j') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'k' && letters[countOfLettersArray].charackter == 'k') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'l' && letters[countOfLettersArray].charackter == 'l') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'm' && letters[countOfLettersArray].charackter == 'm') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'n' && letters[countOfLettersArray].charackter == 'n') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'o' && letters[countOfLettersArray].charackter == 'o') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'p' && letters[countOfLettersArray].charackter == 'p') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'q' && letters[countOfLettersArray].charackter == 'q') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'r' && letters[countOfLettersArray].charackter == 'r') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 's' && letters[countOfLettersArray].charackter == 's') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 't' && letters[countOfLettersArray].charackter == 't') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'u' && letters[countOfLettersArray].charackter == 'u') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'v' && letters[countOfLettersArray].charackter == 'v') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'w' && letters[countOfLettersArray].charackter == 'w') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'x' && letters[countOfLettersArray].charackter == 'x') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'y' && letters[countOfLettersArray].charackter == 'y') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'z' && letters[countOfLettersArray].charackter == 'z') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'ä' && letters[countOfLettersArray].charackter == 'ä') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'ö' && letters[countOfLettersArray].charackter == 'ö') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'ü' && letters[countOfLettersArray].charackter == 'ü') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == 'ß' && letters[countOfLettersArray].charackter == 'ß') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }
        if (panel.keyHandler.letter == '_' && letters[countOfLettersArray].charackter == '_') {
            letters[countOfLettersArray].image = null;
            letters[countOfLettersArray].hitBox = null;
            panel.keyHandler.letter = ' ';
            countOfLettersArray++;
        }

//            if (panel.keyHandler.a && buchstabes[i].charackter == "a") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.b && buchstabes[i].charackter == "b") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.c && buchstabes[i].charackter == "c") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.d && buchstabes[i].charackter == "d") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.e && buchstabes[i].charackter == "e") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.f && buchstabes[i].charackter == "f") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.g && buchstabes[i].charackter == "g") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.h && buchstabes[i].charackter == "h") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.i && buchstabes[i].charackter == "i") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.j && buchstabes[i].charackter == "j") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.k && buchstabes[i].charackter == "k") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.l && buchstabes[i].charackter == "l") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.m && buchstabes[i].charackter == "m") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.n && buchstabes[i].charackter == "n") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.o && buchstabes[i].charackter == "o") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.p && buchstabes[i].charackter == "p") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.q && buchstabes[i].charackter == "q") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.r && buchstabes[i].charackter == "r") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.s && buchstabes[i].charackter == "s") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.t && buchstabes[i].charackter == "t") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.u && buchstabes[i].charackter == "u") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.v && buchstabes[i].charackter == "v") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.w && buchstabes[i].charackter == "w") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.x && buchstabes[i].charackter == "x") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.y && buchstabes[i].charackter == "y") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.z && buchstabes[i].charackter == "z") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.ae && buchstabes[i].charackter == "ä") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.oe && buchstabes[i].charackter == "ö") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.ue && buchstabes[i].charackter == "ü") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
//            if (panel.keyHandler.ss && buchstabes[i].charackter == "ß") {
//                buchstabes[i].image = null;
//                buchstabes[i].hitBox = null;
//            }
    }

    public void draw (Graphics2D g){
        for (Letter letter : letters) {
            letter.draw(g);
        }
    }
}
