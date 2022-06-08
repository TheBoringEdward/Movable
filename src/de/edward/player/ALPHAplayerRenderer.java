package de.edward.player;

import de.edward.maps.mapFiles.mapLoader;
import de.edward.objects.textureLoader;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Scanner;

public class ALPHAplayerRenderer {

    BufferedImage img;
    Scanner scn2 = new Scanner(System.in);

    int y;
    int x;

    public void drawPlayer(Graphics g, int t, int t2, BufferedImage map){

        mapLoader mL = new mapLoader(40);

        x = 40 + (30 * t);
        y = 40 + (30 * t2);

        img = textureLoader.player;
        g.drawImage(img, x, y, null); // Draws player at starting position

        System.out.println("Choose an amount:");
        int dir = scn2.nextInt();
        System.out.println(x);
        g.drawImage(map, 0, 0, null); // Redraws map
        g.drawImage(img, x + (30 * dir), y, null); // Draws the player on new position
        System.out.println("Chosen amount: " + (t + (30 * dir)));
        // TODO: This has to be improved.
    }
}
