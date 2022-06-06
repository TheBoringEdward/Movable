package de.edward.objects;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class textureLoader {
    public static BufferedImage blood;
    public static BufferedImage bookshelf;
    public static BufferedImage bookshelf_top;
    public static BufferedImage border_b;
    public static BufferedImage border_l;
    public static BufferedImage border_lb;
    public static BufferedImage border_lt;
    public static BufferedImage border_r;
    public static BufferedImage border_rb;
    public static BufferedImage border_rt;
    public static BufferedImage border_t;
    public static BufferedImage brick;
    public static BufferedImage brick_wall;
    public static BufferedImage coin;
    public static BufferedImage left_bookshelf;
    public static BufferedImage left_chest;
    public static BufferedImage lower_door;
    public static BufferedImage mid_bookshelf;
    public static BufferedImage missing;
    public static BufferedImage pedestal_lower;
    public static BufferedImage pedestal_upper;
    public static BufferedImage plank;
    public static BufferedImage player;
    public static BufferedImage reference;
    public static BufferedImage right_bookshelf;
    public static BufferedImage right_chest;
    public static BufferedImage small_chest;
    public static BufferedImage small_flame;
    public static BufferedImage stone_brick;
    public static BufferedImage stone_wall;
    public static BufferedImage test;
    public static BufferedImage the_void;
    public static BufferedImage torch_holder_lit;
    public static BufferedImage torch_holder_unlit;
    public static BufferedImage upper_door;
    public static BufferedImage sword;

    public void loadTextures (){
        try {
            blood = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/blood.png")));
            border_b = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/border_b.png")));
            border_l = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/border_l.png")));
            border_lb = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/border_lb.png")));
            border_lt = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/border_lt.png")));
            border_r = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/border_r.png")));
            border_rb = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/border_rb.png")));
            border_rt = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/border_rt.png")));
            border_t = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/border_t.png")));
            brick = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/brick.png")));
            brick_wall = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/brick-wall.png")));
            coin = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/coin.png")));
            left_bookshelf = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/left-bookshelf.png")));
            left_chest = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/left-large-chest.png")));
            lower_door = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/lower-door.png")));
            mid_bookshelf = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/mid-bookshelf.png")));
            missing = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/missing.png")));
            pedestal_lower = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/pedestal-lower.png")));
            pedestal_upper = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/pedestal-upper.png")));
            plank = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/plank.png")));
            player = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/player.png")));
            reference = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/reference.png")));
            right_bookshelf = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/right-bookshelf.png")));
            right_chest = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/right-large-chest.png")));
            bookshelf = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/small-bookshelf.png")));
            bookshelf_top = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/small-bookshelf-top.png")));
            small_chest = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/small-chest.png")));
            small_flame = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/small-flame.png")));
            stone_brick = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/stone-brick.png")));
            stone_wall = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/stone-wall.png")));
            test = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/test.png")));
            torch_holder_lit = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/torch-holder-lit.png")));
            torch_holder_unlit = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/torch-holder-unlit.png")));
            upper_door = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/upper-door.png")));
            the_void = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/void.png")));
            sword = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/sword.png")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
