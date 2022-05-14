package de.edward.textures;

public class textureDir {

    String[] texMap = new String[6];

    String fetchTexture(char t, int i){
        switch (t) {
            default -> { // Missing Texture
                texMap[0] = "brbrbr";
                texMap[1] = "rbrbrb";
                texMap[2] = "brbrbr";
                texMap[3] = "rbrbrb";       // TODO: This shite
                texMap[4] = "brbrbr";
                texMap[5] = "rbrbrb";
            }
            case '1' -> { // Test Texture
                texMap[0] = "pbpbpb";
                texMap[1] = "bpbpbp";
                texMap[2] = "pbpbpb";
                texMap[3] = "bpbpbp";
                texMap[4] = "pbpbpb";
                texMap[5] = "bpbpbp";
            }
            case '2' -> { // Test Texture
                texMap[0] = "bbbbbb";
                texMap[1] = "bppppb";
                texMap[2] = "bppppb";
                texMap[3] = "bppppb";
                texMap[4] = "bppppb";
                texMap[5] = "bbbbbb";
            }
            case '3' -> {   // Door?
                texMap[0] = "222222";
                texMap[1] = "232232";
                texMap[2] = "232232";
                texMap[3] = "232232";
                texMap[4] = "232232";
                texMap[5] = "222222";
            }
        }
        return texMap[i];
    }

}
