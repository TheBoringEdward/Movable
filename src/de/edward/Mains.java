package de.edward;

import de.edward.maps.mapRenderer;

import javax.swing.*;
import java.awt.*;


public class Mains extends JFrame{

    /*
    int startX = 10; // starting position for X
    int startY = 40; // starting position for Y
     */

    mapRenderer mR = new mapRenderer();

    public void paint(Graphics g){
        super.paint(g);
        mR.drawMap(g, '1');
    }

    public static void main(String[] args) {
        Mains m = new Mains();
        m.setSize(1280, 720);
        m.setBackground(Color.black); // Can't set the background colour. It does flicker blue for a split second, but that's it.
        m.setResizable(false);
        m.setTitle("Movable");
        m.setVisible(true); // There's no "paint" here!!! I'm loosing my mind!!!
        System.out.println(" ----TheBoringEdward---- "); // It executes AFTER printing this!!! WHY?!?!
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
