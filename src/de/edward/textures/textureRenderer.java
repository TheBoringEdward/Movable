package de.edward.textures;

import java.awt.*;
import javax.swing.*;

public class textureRenderer {

    int PosX = 100;
    int PosY = 100;

    textureMaps tM = new textureMaps();

    public void drawTexture(Graphics g, char t){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++) {
                switch (tM.fetchTexture(t, i).charAt(j)) {
                    case 'b' -> g.setColor(Color.black);
                    case 'r' -> g.setColor(Color.red);
                    case 'p' -> g.setColor(Color.decode("#ba55d3")); // purple
                }
                g.fillRect(PosX + (5 * i), PosY + (5 * j), 5, 5);
            }
        }
        /*
        g.setColor(Color.blue);
        g.drawRect(125,125,50,50);
         */
    }

}
