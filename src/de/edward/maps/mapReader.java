package de.edward.maps;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class mapReader {

    BufferedImage img;

    public mapReader(String map) throws IOException {
        img = ImageIO.read(Objects.requireNonNull(getClass().getResource(map)));
    }

    public void showTextureColour(int x, int y){
        final Color colour = new Color(img.getRGB(x,y), true);
        final int red = colour.getRed();
        final int green = colour.getGreen();
        final int blue = colour.getBlue();
        final int alpha = colour.getAlpha();
        System.out.println(red + " red");
        System.out.println(green + " green");
        System.out.println(blue + " blue");
        System.out.println(alpha + " alpha");
    }

    public int greenAmount(int x, int y){
        final Color colour = new Color(img.getRGB(x,y), true);
        return colour.getGreen();
    }

    public int redAmount(int x, int y){
        final Color colour = new Color(img.getRGB(x,y), true);
        return colour.getRed();
    }

    public int blueAmount(int x, int y){
        final Color colour = new Color(img.getRGB(x,y), true);
        return colour.getBlue();
    }

}
