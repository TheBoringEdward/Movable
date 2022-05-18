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
    Scanner scn2 = new Scanner(System.in);
    textureRenderer tR = new textureRenderer(40, 40);
    mapDir mD = new mapDir();

    int y;
    int x;

    public void drawPlayer(Graphics g, int t, int t2, String map, String ent){

        x = 40 + (30 * t); // x
        y = 40 + (30 * t2); // y

        try {
            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/player.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        g.drawImage(img, x, y, null);

        System.out.println("Amount:");
        int dir = scn2.nextInt();
        System.out.println(x);
        g.drawImage(img, x + (30 * dir), y, null); // Draws the player on new position
        System.out.println("Amount: " + (t + (30 * dir)));

        tR = new textureRenderer(x, y);
        tR.drawTexture(g, mD.fetchMap(map, t2).charAt(t * 2), mD.fetchMap(map, t2).charAt((t * 2) + 1), 1); // Redraws map texture
        tR.drawEntity(g, mD.fetchMap(ent, t2).charAt(t * 2), mD.fetchMap(ent, t2).charAt((t * 2) + 1), 1); // Redraws possible entity
        // TODO: This has to be improved.
    }
}
