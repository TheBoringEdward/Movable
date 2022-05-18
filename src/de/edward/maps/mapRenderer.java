package de.edward.maps;

import de.edward.textures.textureRenderer;

import java.awt.*;

public class mapRenderer {

    int startPos = 40;

    mapDir mD = new mapDir();
    textureRenderer tR = new textureRenderer(startPos, startPos);

    public void drawMap(Graphics g, String map, String ent, int q) {
        for (int j = 0; j < 17; j++) {
            int a = 0;
            for (int i = 0; i < 80; i++) {
                tR = new textureRenderer(startPos + (30 * a), startPos + (30 * j));
                tR.drawTexture(g, mD.fetchMap(map, j).charAt(i), mD.fetchMap(map, j).charAt(i + 1), q);
                tR.drawEntity(g, mD.fetchMap(ent, j).charAt(i), mD.fetchMap(ent, j).charAt(i + 1), q);
                i++;
                a++;
            }
        }
    }
}
