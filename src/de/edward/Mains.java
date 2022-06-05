package de.edward;

import de.edward.maps.mapFiles.mapLoader;
import de.edward.maps.mapReader;
import de.edward.player.playerRenderer;
import de.edward.objects.textureLoader;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class Mains extends JFrame{

    Scanner scn2 = new Scanner(System.in);

    private static final textureLoader tL = new textureLoader();

    mapReader mRe;

    {
        try {
            mRe = new mapReader("/de/edward/maps/mapFiles/1_map.png");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    playerRenderer pR = new playerRenderer();

    mapLoader mL = new mapLoader(40); // Gets marked as issue, even though it is necessary.

    public void paint(Graphics g){
        super.paint(g);

        // Due to aesthetic reasons, there should be a possibility to place multiple entities over each other, i.e. create multiple entity maps for singular map

        System.out.println("1 for tallLibrary, 2 for testing, 3 for one");
        int q = scn2.nextInt();
        switch(q){
            default -> System.out.println("Invalid option");
            case 1 -> g.drawImage(mapLoader.tallLibraryEDMap, 0, 0, null);
            case 2 -> g.drawImage(mapLoader.testingEDMap, 0, 0, null);
            case 3 -> g.drawImage(mapLoader.oneMap, 0, 0, null);
        }

        //pR.drawPlayer(g, 6, 12, background, objects);

    }

    public static void main(String[] args) {
        tL.loadTextures();
        Mains m = new Mains();
        m.setSize(1600, 900);
        m.setBackground(Color.black); // Check "mapLoader" for changing background
        m.setResizable(false);
        m.setTitle("Movable - Alpha - map fiddeling");
        m.setVisible(true); // As it seems, there is no control over when the "paint" method gets called. fml
        System.out.println(" ----Made by TheBoringEdward with the great help of some fellows---- ");
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
