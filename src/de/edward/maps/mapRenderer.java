package de.edward.maps;

import de.edward.textures.textureRenderer;

import java.awt.*;
import java.io.IOException;

public class mapRenderer {

    int startPos = 40;

    textureRenderer tR = new textureRenderer(startPos, startPos);
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

    public void drawMap(Graphics g, String map, String ent, int q) {

        try {
            mRT = new mapReader(map);
            mRE = new mapReader(ent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int j = 0; j < 17; j++) {
            for (int i = 0; i < 40; i++) {
                tR = new textureRenderer(startPos + (30 * i), startPos + (30 * j));
                tR.drawTexture(g, mRT.greenAmount(i, j), mRT.redAmount(i, j), q);
                tR.drawEntity(g, mRE.greenAmount(i, j), mRE.redAmount(i, j), q);
                //i++;
            }
        }
    }
}
