package de.edward.player;

import de.edward.maps.mapReader;
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

    int y;
    int x;

    mapReader mRT;
    mapReader mRE;

    {
        try {
            mRT = new mapReader("");
            mRE = new mapReader("");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void drawPlayer(Graphics g, int t, int t2, String map, String ent, int q){

        try {
            mRT = new mapReader(map);
            mRE = new mapReader(ent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

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
        tR.drawTexture(g, mRT.greenAmount(t, t2), mRT.redAmount(t, t2), q); // Redraws map texture
        tR.drawEntity(g, mRE.greenAmount(t, t2), mRE.redAmount(t, t2), q); // Redraws possible entity
        // TODO: This has to be improved.
    }
}
