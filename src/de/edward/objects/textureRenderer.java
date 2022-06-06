package de.edward.objects;

import java.awt.*;
import java.awt.image.BufferedImage;

public class textureRenderer {

    int PosX;
    int PosY;
    BufferedImage img;

    public textureRenderer(int PosX, int PosY) {
        this.PosX = PosX;
        this.PosY = PosY;
    }


    public void drawTexture(Graphics g, int t, int t2, Boolean m) {
        String ta = "" + t + t2;
        switch (ta) {
            case "00" -> { // void
                if (m) {
                    img = textureLoader.the_void;
                    g.drawImage(img, PosX, PosY, null);
                }
            }
            default -> { // missing
                img = textureLoader.missing;
                g.drawImage(img, PosX, PosY, null);
            }
            case "0250" -> { // test
                img = textureLoader.test;
                g.drawImage(img, PosX, PosY, null);
            }
            case "255255" -> { // reference
                img = textureLoader.reference;
                g.drawImage(img, PosX, PosY, null);
            }
            case "105150" -> { // plank
                img = textureLoader.plank;
                g.drawImage(img, PosX, PosY, null);
            }
            case "145145" -> { // stone-brick
                img = textureLoader.stone_brick;
                g.drawImage(img, PosX, PosY, null);
            }
            case "100100" -> { // stone-wall
                img = textureLoader.stone_wall;
                g.drawImage(img, PosX, PosY, null);
            }
            case "76201" -> { // upper-door
                img = textureLoader.upper_door;
                g.drawImage(img, PosX, PosY, null);
            }
            case "46121" -> { // lower-door
                img = textureLoader.lower_door;
                g.drawImage(img, PosX, PosY, null);
            }
            case "92208" -> { // small-bookshelf-top
                img = textureLoader.bookshelf_top;
                g.drawImage(img, PosX, PosY, null);
            }
            case "69146" -> { // small-bookshelf
                img = textureLoader.bookshelf;
                g.drawImage(img, PosX, PosY, null);
            }
            case "230255" -> { // small-chest
                img = textureLoader.small_chest;
                g.drawImage(img, PosX, PosY-15, null);
            }
            case "152157" -> { // left-large-chest
                img = textureLoader.left_chest;
                g.drawImage(img, PosX, PosY-15, null);
            }
            case "142153" -> { // right-large-chest
                img = textureLoader.right_chest;
                g.drawImage(img, PosX, PosY-15, null);
            }
            case "1970" -> { // player
                img = textureLoader.player;
                g.drawImage(img, PosX, PosY, null);
            }
            case "0203" -> { // blood
                img = textureLoader.blood;
                g.drawImage(img, PosX, PosY, null);
            }
            case "2034" -> { // coin
                img = textureLoader.coin;
                g.drawImage(img, PosX, PosY, null);
            }
            case "112203" -> { // brick
                img = textureLoader.brick;
                g.drawImage(img, PosX, PosY, null);
            }
            case "82149" -> { // brick-wall
                img = textureLoader.brick_wall;
                g.drawImage(img, PosX, PosY, null);
            }
            case "0217" -> { // small-flame
                img = textureLoader.small_flame;
                g.drawImage(img, PosX, PosY, null);
            }
            case "693" -> { // torch-holder-lit
                img = textureLoader.torch_holder_lit;
                g.drawImage(img, PosX, PosY, null);
            }
            case "6106" -> { // torch-holder-unlit
                img = textureLoader.torch_holder_unlit;
                g.drawImage(img, PosX, PosY, null);
            }
            case "13580" -> { // pedestal-lower
                img = textureLoader.pedestal_lower;
                g.drawImage(img, PosX, PosY, null);
            }
            case "163132" -> { // pedestal-upper
                img = textureLoader.pedestal_upper;
                g.drawImage(img, PosX, PosY, null);
            }
            case "6242" -> { // left-bookshelf
                img = textureLoader.left_bookshelf;
                g.drawImage(img, PosX, PosY, null);
            }
            case "107109" -> { // mid-bookshelf
                img = textureLoader.mid_bookshelf;
                g.drawImage(img, PosX, PosY, null);
            }
            case "164166" -> { // right-bookshelf
                img = textureLoader.right_bookshelf;
                g.drawImage(img, PosX, PosY, null);
            }
            case "114187" -> { // border_lt
                img = textureLoader.border_lt;
                g.drawImage(img, PosX, PosY, null);
            }
            case "95173" -> { // border_rt
                img = textureLoader.border_rt;
                g.drawImage(img, PosX, PosY, null);
            }
            case "72157" -> { // border_rb
                img = textureLoader.border_rb;
                g.drawImage(img, PosX, PosY, null);
            }
            case "44135" -> { // border_lb
                img = textureLoader.border_lb;
                g.drawImage(img, PosX, PosY, null);
            }
            case "184129" -> { // border_l
                img = textureLoader.border_l;
                g.drawImage(img, PosX, PosY, null);
            }
            case "170107" -> { // border_r
                img = textureLoader.border_r;
                g.drawImage(img, PosX, PosY, null);
            }
            case "14276" -> { // border_t
                img = textureLoader.border_t;
                g.drawImage(img, PosX, PosY, null);
            }
            case "13566" -> { // border_b
                img = textureLoader.border_b;
                g.drawImage(img, PosX, PosY, null);
            }
            case "300" -> {
                img = textureLoader.sword;
                g.drawImage(img, PosX, PosY, null);
            }
        }
    }
}
