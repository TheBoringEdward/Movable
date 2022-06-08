package de.edward;

import de.edward.maps.mapFiles.mapLoader;
import de.edward.objects.textureLoader;
import de.edward.player.playerRenderer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Mains extends JFrame{

    Scanner scn2 = new Scanner(System.in);

    private static final textureLoader tL = new textureLoader();

    private BufferedImage crrntMap;

    mapLoader mL = new mapLoader(40); // Gets marked as issue, even though it is necessary.

    playerRenderer pR;

    public void askMap(){
        System.out.println("1 for tallLibraryED, 2 for testingED, 3 for one, 4 for lootRoomED");
        int q = scn2.nextInt();
        switch(q){
            default -> System.out.println("Invalid option");
            case 1 -> {
                crrntMap = mapLoader.tallLibraryEDMap;
                //ApR.drawPlayer(g, 6, 12, mapLoader.tallLibraryEDMap);
            }
            case 2 -> {
                crrntMap = mapLoader.testingEDMap;
                //ApR.drawPlayer(g, 6, 12, mapLoader.testingEDMap);
            }
            case 3 -> {
                crrntMap = mapLoader.oneMap;
                //ApR.drawPlayer(g, 6, 12, mapLoader.oneMap);
            }
            case 4 -> {
                crrntMap = mapLoader.lootRoomEDMap;
                //ApR.drawPlayer(g, 6, 7, mapLoader.lootRoomEDMap);
            }
        }
    }

    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(crrntMap, 0, 10, null);
    }

    public void press(KeyEvent key){
        if(key.getKeyCode() == KeyEvent.VK_LEFT){
            pR.move(, -1, 0);
        }
    }

    public Mains(){
        this.crrntMap = mapLoader.awaitingInput;
    }

    public static void main(String[] args) {
        tL.loadTextures();
        Mains m = new Mains();
        m.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent key){
                m.press(key);
            }
        });
        m.setSize(1600, 900);
        m.setResizable(false);
        m.setBackground(Color.black); // Check "mapLoader" for changing background
        m.setTitle("Movable - Alpha - master");
        try {
            m.setIconImage(ImageIO.read(Objects.requireNonNull(Mains.class.getResource("/de/edward/textures/sword.png"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        m.setVisible(true); // As it seems, there is no control over when the "paint" method gets called. fml
        m.askMap();
        pR = new playerRenderer(6, 12, m.crrntMap);
        m.repaint();
        System.out.println(" ----Made by TheBoringEdward with the great help of some fellows---- ");
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
