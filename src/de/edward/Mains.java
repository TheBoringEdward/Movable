package de.edward;

import de.edward.maps.mapReader;
import de.edward.maps.mapRenderer;
import de.edward.player.playerRenderer;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Mains extends JFrame{

    mapRenderer mR = new mapRenderer();
    playerRenderer pR = new playerRenderer();
    mapReader mRe;

    {
        try {
            mRe = new mapReader();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void paint(Graphics g){
        super.paint(g);

        String map = "EmptyDungeon";
        String ent = "testing-ent";
        // String map = "1";
        // String ent = "1-ent";

        mR.drawMap(g, map, ent, 1);
        //mR.drawMap(g, "1", "1-ent", 1);
        //pR.drawPlayer(g, 6, 11, map, ent);
        mRe.showTextureColour( 2, 0);
    }

    public static void main(String[] args) {
        Mains m = new Mains();
        m.setSize(1280, 720);
        m.setBackground(Color.black); // Can't set the background colour.
        m.setResizable(false);
        m.setTitle("Movable");
        m.setVisible(true); // There's no "paint" here!
        System.out.println(" ----Made by TheBoringEdward with the help of some fellows---- ");
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
