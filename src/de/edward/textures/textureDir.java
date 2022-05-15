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
            case '2' -> { // Test Texture #2
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
            case 'b' -> {   // white
                texMap[0] = "wwwwww";
                texMap[1] = "wwwwww";
                texMap[2] = "wwwwww";
                texMap[3] = "wwwwww";
                texMap[4] = "wwwwww";
                texMap[5] = "wwwwww";
            }
            case ' ' -> {   // black
                texMap[0] = "666666";
                texMap[1] = "666666";
                texMap[2] = "666666";
                texMap[3] = "666666";
                texMap[4] = "666666";
                texMap[5] = "666666";
            }

            case '4' -> { // Plank
                texMap[0] = "222333";
                texMap[1] = "333222";
                texMap[2] = "222333";
                texMap[3] = "333222";
                texMap[4] = "222333";
                texMap[5] = "333222";
            }

            case '5' -> { // Stone wall
                texMap[0] = "555555";
                texMap[1] = "445445";
                texMap[2] = "555555";
                texMap[3] = "544544";
                texMap[4] = "555555";
                texMap[5] = "454454";
            }
            case '6' -> { // Brick wall
                texMap[0] = "666666";
                texMap[1] = "rr6rr6";
                texMap[2] = "666666";
                texMap[3] = "6rr6rr";
                texMap[4] = "666666";
                texMap[5] = "r6rr6r";
            }
        }
        return texMap[i];
    }

}
