package de.edward.maps;

import de.edward.objects.textureRenderer;

import java.awt.*;
import java.io.IOException;

public class mapRenderer {

    int startPos = 40;

    textureRenderer tR = new textureRenderer(startPos, startPos);
    mapReader mRT;
    mapReader mRE;
    mapReader mRB;

    // To be replaced
    // TODO: Use "mapLoader" and "repaint" for the "playerRenderer"

    {
        try {
            mRT = new mapReader("");
            mRE = new mapReader("");
            mRB = new mapReader("");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void drawMap(Graphics g, String background, String objects, String border) {

        g.setColor(Color.decode("#101728")); // Doesn't always fill the entire window somehow. I hate JFrame.
        g.fillRect(-10,-10,2000,2000);

        try {
            mRT = new mapReader(background);
            mRE = new mapReader(objects);
            mRB = new mapReader(border);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int j = 0; j < 17; j++) {
            for (int i = 0; i < 40; i++) {
                tR = new textureRenderer(startPos + (30 * i), startPos + (30 * j));
                tR.drawTexture(g, mRT.greenAmount(i, j), mRT.redAmount(i, j), true);
                tR.drawTexture(g, mRE.greenAmount(i, j), mRE.redAmount(i, j), false);
                tR.drawTexture(g, mRB.greenAmount(i, j), mRB.redAmount(i, j), false);
            }
        }
    }
}
