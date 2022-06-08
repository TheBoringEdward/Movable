package de.edward.player;

import de.edward.objects.textureLoader;

import java.awt.*;
import java.awt.image.BufferedImage;

public class playerRenderer {

    private int PosX;
    private int PosY;
    BufferedImage img;
    BufferedImage map;

    public playerRenderer(int PosX, int PosY, BufferedImage map){
        this.PosX = 40 + (30 * PosX);
        this.PosY = 40 + (30 * PosY);
        this.map = map;
    }

    public void draw(Graphics2D g){
        img = textureLoader.player;
        g.drawImage(img, PosX, PosY, null);
    }

    public void hide(Graphics2D g){
        g.drawImage(map, 0, 0, null);
    }

    public void move(Graphics2D g, int moveX, int moveY){
        hide(g);
        PosX = PosX + (30 * moveX);
        PosY = PosY + (30 * moveY);
        draw(g);
    }

}
