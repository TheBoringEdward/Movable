package de.edward.textures;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class textureRenderer {

    int PosX;
    int PosY;
    BufferedImage img;

    public textureRenderer(int PosX, int PosY){
        this.PosX = PosX;
        this.PosY = PosY;
    }


    public void drawTexture(Graphics g, char t){
                switch (t) {
                    default -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/missing.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case ' ' -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/void.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case '4' -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/plank.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case '5' -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/stone-brick.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case '6' -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/upper-door.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case '7' -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/lower-door.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case '8' -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/stone-wall.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                g.drawImage(img, PosX, PosY, null);
    }

}
