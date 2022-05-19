package de.edward;

import de.edward.maps.mapRenderer;
import de.edward.player.playerRenderer;

import javax.swing.*;
import java.awt.*;

public class Mains extends JFrame{

    mapRenderer mR = new mapRenderer();
    playerRenderer pR = new playerRenderer();
    public void paint(Graphics g){
        super.paint(g);

        int quality = 1;
        String map = "/de/edward/maps/mapFiles/EmptyDungeon_map.png";
        String ent = "/de/edward/maps/mapFiles/testing-ent_map.png";
        //String map = "/de/edward/maps/mapFiles/1_map.png";
        //String ent = "/de/edward/maps/mapFiles/1-ent_map.png";
        mR.drawMap(g, map, ent, quality);
        pR.drawPlayer(g, 6, 12, map, ent, quality);
    }

    public static void main(String[] args) {
        Mains m = new Mains();
        m.setSize(1280, 720);
        m.setBackground(Color.black); // Can't set the background colour.
        m.setResizable(false);
        m.setTitle("Movable");
        m.setVisible(true); // As it seems, there is no control over when the "paint" method gets called. fml
        System.out.println(" ----Made by TheBoringEdward with the help of some fellows---- ");
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
