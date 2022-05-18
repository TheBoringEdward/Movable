package de.edward.player;

import de.edward.maps.mapDir;
import de.edward.textures.textureRenderer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class playerRenderer {

    BufferedImage img;
    boolean cancel = false;
    Scanner scn2 = new Scanner(System.in);
    textureRenderer tR = new textureRenderer(40, 40);
    mapDir mD = new mapDir();

    public void drawPlayer(Graphics g, int t, int t2){

        try {
            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/player.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        g.drawImage(img, t, t2, null);

        System.out.println("Amount:");
        int dir = scn2.nextInt();
        g.drawImage(img, t + (30 * dir), t2, null);
        System.out.println("Amount: " + (t + (30 * dir)));
        tR = new textureRenderer(40 + (30 * 6), 40 + (30 * 11));
        tR.drawTexture(g, mD.fetchMap("EmptyDungeon", 11).charAt(6), mD.fetchMap("EmptyDungeon", 1).charAt(6 + 1), 1);
    }
}
