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
        //mR.drawMap(g, "EmptyDungeon");
        mR.drawMap(g, "1");
        //pR.drawPlayer(g, 40 + (30 * 6), 40 + (30 * 11));
    }

    public static void main(String[] args) {
        Mains m = new Mains();
        m.setSize(1280, 720);
        m.setBackground(Color.black); // Can't set the background colour.
        m.setResizable(false);
        m.setTitle("Movable");
        m.setVisible(true); // There's no "paint" here!
        System.out.println(" ----TheBoringEdward---- ");
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
