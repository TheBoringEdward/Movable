package de.edward.maps.mapFiles;

import de.edward.maps.mapReader;
import de.edward.objects.textureRenderer;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class mapLoader {

    public static BufferedImage tallLibraryEDMap;
    public static BufferedImage testingEDMap;
    public static BufferedImage oneMap;
    public static BufferedImage awaitingInp;

    mapReader EmptyDungeonBGMapReader;
    mapReader oneMapBGMapReader;
    mapReader tallLibraryEDMapReader;
    mapReader testingEDMapReader;
    mapReader oneMapReader;
    mapReader border;

    {
        try {
            EmptyDungeonBGMapReader = new mapReader("/de/edward/maps/mapFiles/EmptyDungeon_map.png");
            tallLibraryEDMapReader = new mapReader("/de/edward/maps/mapFiles/tall-library-ED_map.png");
            testingEDMapReader = new mapReader("/de/edward/maps/mapFiles/testing-ED_map.png");
            oneMapReader = new mapReader( "/de/edward/maps/mapFiles/1-ent_map.png");
            oneMapBGMapReader = new mapReader("/de/edward/maps/mapFiles/1_map.png");
            border = new mapReader("/de/edward/maps/mapFiles/border.png");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public mapLoader(int startPos){

        textureRenderer tR;
        
        tallLibraryEDMap = new BufferedImage(1600, 900, BufferedImage.TYPE_INT_RGB);
        final Graphics2D tallLibraryEDMapGraphics = tallLibraryEDMap.createGraphics();
        tallLibraryEDMapGraphics.setColor(Color.decode("#101728")); // Doesn't always fill the entire window somehow. I hate JFrame.
        tallLibraryEDMapGraphics.fillRect(-10,-10,2000,2000);
        for (int j = 0; j < 17; j++) {
            for (int i = 0; i < 40; i++) {
                tR = new textureRenderer(startPos + (30 * i), startPos + (30 * j));
                tR.drawTexture(tallLibraryEDMapGraphics, EmptyDungeonBGMapReader.greenAmount(i, j), EmptyDungeonBGMapReader.redAmount(i, j), true);
                tR.drawTexture(tallLibraryEDMapGraphics, tallLibraryEDMapReader.greenAmount(i, j), tallLibraryEDMapReader.redAmount(i, j), false);
                tR.drawTexture(tallLibraryEDMapGraphics, border.greenAmount(i, j), border.redAmount(i, j), false);
            } // Due to aesthetic reasons, there should be a possibility to place multiple entities over each other, i.e. create multiple entity maps for singular map
        }
        tallLibraryEDMapGraphics.setFont(new Font("TimesRoman", Font.PLAIN, 50));
        tallLibraryEDMapGraphics.setColor(Color.decode("#d59b00"));
        tallLibraryEDMapGraphics.drawString("GUI elements coming soon", 400,700);

        testingEDMap = new BufferedImage(1600, 900, BufferedImage.TYPE_INT_RGB);
        final Graphics2D testingEDMapGraphics = testingEDMap.createGraphics();
        testingEDMapGraphics.setColor(Color.decode("#101728"));
        testingEDMapGraphics.fillRect(-10,-10,2000,2000);
        for (int j = 0; j < 17; j++) {
            for (int i = 0; i < 40; i++) {
                tR = new textureRenderer(startPos + (30 * i), startPos + (30 * j));
                tR.drawTexture(testingEDMapGraphics, EmptyDungeonBGMapReader.greenAmount(i, j), EmptyDungeonBGMapReader.redAmount(i, j), true);
                tR.drawTexture(testingEDMapGraphics, testingEDMapReader.greenAmount(i, j), testingEDMapReader.redAmount(i, j), false);
                tR.drawTexture(testingEDMapGraphics, border.greenAmount(i, j), border.redAmount(i, j), false);
            }
        }
        testingEDMapGraphics.setFont(new Font("TimesRoman", Font.PLAIN, 50));
        testingEDMapGraphics.setColor(Color.decode("#d59b00"));
        testingEDMapGraphics.drawString("GUI elements coming soon", 400,700);

        oneMap = new BufferedImage(1600, 900, BufferedImage.TYPE_INT_RGB);
        final Graphics2D oneMapGraphics = oneMap.createGraphics();
        oneMapGraphics.setColor(Color.decode("#101728"));
        oneMapGraphics.fillRect(-10,-10,2000,2000);
        for (int j = 0; j < 17; j++) {
            for (int i = 0; i < 40; i++) {
                tR = new textureRenderer(startPos + (30 * i), startPos + (30 * j));
                tR.drawTexture(oneMapGraphics, oneMapBGMapReader.greenAmount(i, j), oneMapBGMapReader.redAmount(i, j), true);
                tR.drawTexture(oneMapGraphics, oneMapReader.greenAmount(i, j), oneMapReader.redAmount(i, j), false);
                tR.drawTexture(oneMapGraphics, border.greenAmount(i, j), border.redAmount(i, j), false);
            }
        }
        oneMapGraphics.setFont(new Font("TimesRoman", Font.PLAIN, 50));
        oneMapGraphics.setColor(Color.decode("#d59b00"));
        oneMapGraphics.drawString("GUI elements coming soon", 400,700);

        awaitingInp = new BufferedImage(1600, 900, BufferedImage.TYPE_INT_RGB);
        final Graphics2D awaitingInpGraphics = awaitingInp.createGraphics();
        awaitingInpGraphics.setColor(Color.decode("#101728"));
        awaitingInpGraphics.fillRect(-10,-10,2000,2000);
        awaitingInpGraphics.setFont(new Font("TimesRoman", Font.PLAIN, 50));
        awaitingInpGraphics.setColor(Color.decode("#d59b00"));
        awaitingInpGraphics.drawString("Awaiting input...", 550,450);
    } // This is messy
}
