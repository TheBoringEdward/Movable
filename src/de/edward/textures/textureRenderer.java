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
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/reference.png"));
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
                    case "0f" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/blood.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "0g" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/coin.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "0h" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/brick.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "0i" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/brick-wall.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "0j" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/small-flame.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "0k" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/torch-holder-lit.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "0l" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/torch-holder-unlit.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "0m" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/pedestal-lower.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "0n" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/pedestal-upper.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "0o" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/left-bookshelf.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "0p" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/mid-bookshelf.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "0q" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/right-bookshelf.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                g.drawImage(img, PosX, PosY, null);
    }

}
