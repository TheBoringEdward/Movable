package de.edward.maps;

import de.edward.textures.textureRenderer;

import java.awt.*;
import java.io.IOException;

public class mapRenderer {

    int startPos = 40;

    textureRenderer tR = new textureRenderer(startPos, startPos);
    mapReader mRT;
    mapReader mRE;
    mapReader mRB;

    {
        try {
            mRT = new mapReader("");
            mRE = new mapReader("");
            mRB = new mapReader("");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void drawMap(Graphics g, String map, String ent, String border) {

        g.setColor(Color.decode("#101728")); // This is how I have to change the background colour from now on.
        g.fillRect(-10,-10,1940,2000);

        try {
            mRT = new mapReader(map);
            mRE = new mapReader(ent);
            mRB = new mapReader(border);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int j = 0; j < 17; j++) {
            for (int i = 0; i < 40; i++) {
                tR = new textureRenderer(startPos + (30 * i), startPos + (30 * j));
                tR.drawTexture(g, mRT.greenAmount(i, j), mRT.redAmount(i, j), 't');
                tR.drawTexture(g, mRE.greenAmount(i, j), mRE.redAmount(i, j), 'e');
                tR.drawTexture(g, mRB.greenAmount(i, j), mRB.redAmount(i, j), 'e');
            }
        }
    }
}
