package de.edward.textures;

import java.awt.*;


public class bricktest {
    int PosX = 100;
    int PosY = 100;
    int wi = 40;
    int he = wi / 2;
    int wd = wi / 4;
    int hd = he / 4;

    public void drawOld(Graphics g){
        System.out.println("Brick");
        g.setColor(Color.red);
        g.fillRect(PosX, PosY, wi + 1, he);

        g.setColor(Color.black);
        // offset row of bricks
        for (int i = 4; i > 0; i--) {
            g.drawLine(PosX + (wd * i) - wd / 2, PosY + hd, PosX + (wd * i) - wd / 2, PosY + (hd * 2)); //vertical
            g.drawLine(PosX + (wd * i) - wd / 2, PosY + (hd * 3), PosX + (wd * i) - wd / 2, PosY + (hd * 4)); //vertical
        }

        // This is a mess

        for (int i = 5; i > 0; i--) {
            g.drawLine(PosX + (wd * (i - 1)), PosY + (hd * 2), PosX + (wd * (i - 1)), PosY + (hd * 3)); //vertical
            g.drawLine(PosX + (wd * (i - 1)), PosY, PosX + (wd * (i - 1)), PosY + (hd)); //vertical
            g.drawLine(PosX, PosY + (hd * (i - 1)), PosX + wi, PosY + (hd * (i - 1))); //horizontal
        }
    }

}
