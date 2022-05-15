package de.edward.maps;

import de.edward.textures.textureRenderer;

import java.awt.*;

public class mapRenderer {

    int startPos = 40;

    mapDir mD = new mapDir();
    textureRenderer tR = new textureRenderer(startPos, startPos);

    public void drawMap(Graphics g, String t) {
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 17; j++) {
                tR = new textureRenderer(startPos + (30 * i), startPos + (30 * j));
                tR.drawTexture(g, mD.fetchMap(t, j).charAt(i));
            }
        }
    }
}
