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

    textureRenderer tR;

    {
        try {
            EmptyDungeonBGMapReader = new mapReader("/de/edward/maps/mapFiles/EmptyDungeon_map.png");
            oneMapBGMapReader = new mapReader("/de/edward/maps/mapFiles/1_map.png");
            border = new mapReader("/de/edward/maps/mapFiles/border.png");

            tallLibraryEDMapReader = new mapReader("/de/edward/maps/mapFiles/tall-library-ED_map.png");
            testingEDMapReader = new mapReader("/de/edward/maps/mapFiles/testing-ED_map.png");
            oneMapReader = new mapReader( "/de/edward/maps/mapFiles/1-ent_map.png");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void GUI_soon(Graphics2D g){
        g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
        g.setColor(Color.decode("#d59b00"));
        g.drawString("GUI elements coming soon", 400,700);
    }

    private void drawEDBackground(Graphics2D g, int startPos){
        for (int j = 0; j < 17; j++) {
            for (int i = 0; i < 40; i++) {
                tR = new textureRenderer(startPos + (30 * i), startPos + (30 * j));
                tR.drawTexture(g, EmptyDungeonBGMapReader.greenAmount(i, j), EmptyDungeonBGMapReader.redAmount(i, j), true);
            }
        }
    }

    private void drawBorder(Graphics2D g, int startPos){
        for (int j = 0; j < 17; j++) {
            for (int i = 0; i < 40; i++) {
                tR = new textureRenderer(startPos + (30 * i), startPos + (30 * j));
                tR.drawTexture(g, border.greenAmount(i, j), border.redAmount(i, j), false);
            }
        }
    }


    public mapLoader(int startPos){
        
        tallLibraryEDMap = new BufferedImage(1600, 900, BufferedImage.TYPE_INT_RGB);
        final Graphics2D tallLibraryEDMapGraphics = tallLibraryEDMap.createGraphics();
        tallLibraryEDMapGraphics.setColor(Color.decode("#101728")); // Doesn't always fill the entire window somehow. I hate JFrame.
        tallLibraryEDMapGraphics.fillRect(-10,-10,2000,2000);
        drawEDBackground(tallLibraryEDMapGraphics, startPos);
        for (int j = 0; j < 17; j++) {
            for (int i = 0; i < 40; i++) {
                tR = new textureRenderer(startPos + (30 * i), startPos + (30 * j));
                tR.drawTexture(tallLibraryEDMapGraphics, tallLibraryEDMapReader.greenAmount(i, j), tallLibraryEDMapReader.redAmount(i, j), false);
            } // Due to aesthetic reasons, there should be a possibility to place multiple entities over each other, i.e. create multiple entity maps for singular map
        }
        drawBorder(tallLibraryEDMapGraphics, startPos);
        GUI_soon(tallLibraryEDMapGraphics);

        testingEDMap = new BufferedImage(1600, 900, BufferedImage.TYPE_INT_RGB);
        final Graphics2D testingEDMapGraphics = testingEDMap.createGraphics();
        testingEDMapGraphics.setColor(Color.decode("#101728"));
        testingEDMapGraphics.fillRect(-10,-10,2000,2000);
        drawEDBackground(testingEDMapGraphics, startPos);
        for (int j = 0; j < 17; j++) {
            for (int i = 0; i < 40; i++) {
                tR = new textureRenderer(startPos + (30 * i), startPos + (30 * j));
                tR.drawTexture(testingEDMapGraphics, testingEDMapReader.greenAmount(i, j), testingEDMapReader.redAmount(i, j), false);
            }
        }
        drawBorder(testingEDMapGraphics, startPos);
        GUI_soon(testingEDMapGraphics);

        oneMap = new BufferedImage(1600, 900, BufferedImage.TYPE_INT_RGB);
        final Graphics2D oneMapGraphics = oneMap.createGraphics();
        oneMapGraphics.setColor(Color.decode("#101728"));
        oneMapGraphics.fillRect(-10,-10,2000,2000);
        for (int j = 0; j < 17; j++) {
            for (int i = 0; i < 40; i++) {
                tR = new textureRenderer(startPos + (30 * i), startPos + (30 * j));
                tR.drawTexture(oneMapGraphics, oneMapBGMapReader.greenAmount(i, j), oneMapBGMapReader.redAmount(i, j), true);
                tR.drawTexture(oneMapGraphics, oneMapReader.greenAmount(i, j), oneMapReader.redAmount(i, j), false);
            }
        }
        drawBorder(oneMapGraphics, startPos);
        GUI_soon(oneMapGraphics);

        awaitingInp = new BufferedImage(1600, 900, BufferedImage.TYPE_INT_RGB);
        final Graphics2D awaitingInpGraphics = awaitingInp.createGraphics();
        awaitingInpGraphics.setColor(Color.decode("#101728"));
        awaitingInpGraphics.fillRect(-10,-10,2000,2000);
        awaitingInpGraphics.setFont(new Font("TimesRoman", Font.PLAIN, 50));
        awaitingInpGraphics.setColor(Color.decode("#d59b00"));
        awaitingInpGraphics.drawString("Awaiting input...", 550,450);
    } // This is messy
}
