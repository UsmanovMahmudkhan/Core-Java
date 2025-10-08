package production_example;

import javax.sound.sampled.*;
import java.io.File;

public class Playmusic {
    public static void main(String[] args) {
        try {
            File file = new File("src/production_example/179.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            System.out.println("Playing music while showing help section...");
            Thread.sleep(5000);
            clip.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}