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


    public void drawTexture(Graphics g, char t, char t2){
        String ta = "" + t + t2;
                switch (ta) {
                    default -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/missing.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "  " -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/void.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "01" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/test.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "02" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/refference.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "04" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/plank.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "05" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/stone-brick.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "06" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/upper-door.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "07" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/lower-door.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "08" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/stone-wall.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "09" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/small-bookshelf-top.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "0a" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/small-bookshelf.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "0b" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/small-chest.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "0c" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/left-large-chest.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "0d" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/right-large-chest.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "0e" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/player.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                g.drawImage(img, PosX, PosY, null);
    }

}
