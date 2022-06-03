package de.edward;

import de.edward.maps.mapReader;
import de.edward.maps.mapRenderer;
import de.edward.player.playerRenderer;
import de.edward.objects.textureLoader;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Mains extends JFrame{

    private static final textureLoader tL = new textureLoader();

    mapRenderer mR = new mapRenderer();
    mapReader mRe;

    {
        try {
            mRe = new mapReader("/de/edward/maps/mapFiles/1_map.png");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    playerRenderer pR = new playerRenderer();
    public void paint(Graphics g){
        super.paint(g);

        String border = "/de/edward/maps/mapFiles/border.png";

        String map = "/de/edward/maps/mapFiles/EmptyDungeon_map.png";
        String ent = "/de/edward/maps/mapFiles/tall-library-ED_map.png"; // Due to aesthetic reasons, there should be a possibility to place multiple entities over each other, i.e. create multiple entity maps for singular map
        //String ent = "/de/edward/maps/mapFiles/testing-ED_map.png";
        //String map = "/de/edward/maps/mapFiles/1_map.png";
        //String ent = "/de/edward/maps/mapFiles/1-ent_map.png";
        mR.drawMap(g, map, ent, border);
        pR.drawPlayer(g, 6, 12, map, ent);
    }

    public static void main(String[] args) {
        Mains m = new Mains();
        tL.loadTextures();
        m.setSize(1600, 900);
        m.setBackground(Color.black); // Check "mapRenderer" for changing background
        m.setResizable(false);
        m.setTitle("Movable - Alpha - map fiddeling");
        m.setVisible(true); // As it seems, there is no control over when the "paint" method gets called. fml
        System.out.println(" ----Made by TheBoringEdward with the great help of some fellows---- ");
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
