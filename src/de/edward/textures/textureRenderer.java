package de.edward.textures;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class textureRenderer {

    int PosX;
    int PosY;
    BufferedImage img;

    public textureRenderer(int PosX, int PosY) {
        this.PosX = PosX;
        this.PosY = PosY;
    }


    public void drawTexture(Graphics g, int t, int t2, char m) {
        String ta = "" + t + t2;
        switch (ta) {
            default -> { // missing
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/missing.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "00" -> { // void
                if (m != 'e') {
                    try {
                        img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/void.png")));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    g.drawImage(img, PosX, PosY, null);
                }
            }
            case "0250" -> { // test
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/test.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "255255" -> { // reference
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/reference.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "105150" -> { // plank
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/plank.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "145145" -> { // stone-brick
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/stone-brick.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "100100" -> { // stone-wall
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/stone-wall.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "76201" -> { // upper-door
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/upper-door.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "46121" -> { // lower-door
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/lower-door.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "92208" -> { // small-bookshelf-top
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/small-bookshelf-top.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "69146" -> { // small-bookshelf
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/small-bookshelf.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "230255" -> { // small-chest
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/small-chest.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "152157" -> { // left-large-chest
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/left-large-chest.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "142153" -> { // right-large-chest
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/right-large-chest.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "1970" -> { // player
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/player.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "0203" -> { // blood
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/blood.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "2034" -> { // coin
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/coin.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "112203" -> { // brick
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/brick.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "82149" -> { // brick-wall
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/brick-wall.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "0217" -> { // small-flame
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/small-flame.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "693" -> { // torch-holder-lit
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/torch-holder-lit.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "6106" -> { // torch-holder-unlit
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/torch-holder-unlit.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "13580" -> { // pedestal-lower
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/pedestal-lower.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "163132" -> { // pedestal-upper
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/pedestal-upper.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "6242" -> { // left-bookshelf
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/left-bookshelf.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "107109" -> { // mid-bookshelf
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/mid-bookshelf.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "164166" -> { // right-bookshelf
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/right-bookshelf.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "114187" -> { // border_lt
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/border_lt.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "95173" -> { // border_rt
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/border_rt.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "72157" -> { // border_rb
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/border_rb.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "44135" -> { // border_lb
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/border_lb.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "184129" -> { // border_l
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/border_l.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "170107" -> { // border_r
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/border_r.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "14276" -> { // border_t
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/border_t.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "13566" -> { // border_b
                try {
                    img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/border_b.png")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
        }
    }
}
