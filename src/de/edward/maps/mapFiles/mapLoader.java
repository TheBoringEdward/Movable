package de.edward.maps.mapFiles;

import java.awt.*;
import java.awt.image.BufferedImage;

public class mapLoader {

    private final BufferedImage map;

    public mapLoader(){
        map = new BufferedImage(1600, 900, BufferedImage.TYPE_INT_RGB);
        final Graphics2D g = map.createGraphics();

    }

}
