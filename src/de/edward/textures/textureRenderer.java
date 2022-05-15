package de.edward.textures;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class textureRenderer {

    int PosX;
    int PosY;
    BufferedImage img;

    public textureRenderer(int PosX, int PosY){
        this.PosX = PosX;
        this.PosY = PosY;
    }

    textureDir tM = new textureDir();

    public void drawTexture(Graphics g, char t){
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++) {
                switch (tM.fetchTexture(t, j).charAt(i)) {
                    default -> g.setColor(Color.decode("#ba55d3")); // purple
                    case 'b' -> g.setColor(Color.black);
                    case 'r' -> g.setColor(Color.red);
                    case 'w' -> g.setColor(Color.white);
                    case 'p' -> g.setColor(Color.decode("#ba55d3")); // purple
                    case '2' -> g.setColor(Color.decode("#a52a2a")); // dark brown
                    case '3' -> g.setColor(Color.decode("#d2691e")); // brown
                    case '4' -> g.setColor(Color.decode("#808080")); // grey
                    case '5' -> g.setColor(Color.decode("#676767")); // dark grey
                    case '6' -> g.setColor(Color.decode("#353535")); // darker grey
                }
                g.fillRect(PosX + (5 * i), PosY + (5 * j), 5, 5);
            }
        }
        try {
            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/small-bookshelf.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        g.drawImage(img, 100 + (30 * 4), 100, null);
        g.drawImage(img, 100 + (30 * 5), 100, null);

        /*
        g.setColor(Color.blue);
        g.drawRect(125,125,50,50);
         */
    }

}
