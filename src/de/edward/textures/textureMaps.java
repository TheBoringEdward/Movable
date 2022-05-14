package de.edward.textures;

public class textureMaps {

    String[] texMap = new String[5];

    String fetchTexture(char t, int i){
        switch (t) {
            default -> { // Missing Texture
                texMap[0] = "brbrb";
                texMap[1] = "rbrbr";
                texMap[2] = "brbrb";
                texMap[3] = "rbrbr";
                texMap[4] = "brbrb";
            }
            case '1' -> { // Test Texture
                texMap[0] = "pbpbp";
                texMap[1] = "bpbpb";
                texMap[2] = "pbpbp";
                texMap[3] = "bpbpb";
                texMap[4] = "pbpbp";
            }
        }
        return texMap[i];
    }

}
