package de.edward.player;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class playerRenderer {

    BufferedImage img;

    public void drawPlayer(Graphics g, int t, int t2){

        try {
            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/player.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        g.drawImage(img, t, t2, null);
    }
}
