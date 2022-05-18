package de.edward.maps;

public class mapDir {

    String[] map = new String[17];

    public String fetchMap(String t, int i) {

        switch (t) {
            default -> { // Missing Map
                map[0] =   "                                                                                ";
                map[1] =   "  02    02  02020202    02      02  020202  020202  0ä01                        ";
                map[2] =   "  0202  02  02    02    0202  0202  02  02  02  02  0ä01                        ";
                map[3] =   "  02  0202  02    02    02  02  02  020202  020202  0ä01                        ";
                map[4] =   "  02    02  02020202    02      02  02  02  02      0ä01                        ";
                map[5] =   "                                                                                ";
                map[6] =   "                                                    0ä0ä                        ";
                map[7] =   "                                                    0101                        ";
                map[8] =   "                                                                                ";
                map[9] =   "                                                                                ";
                map[10] =  "                                                                                ";
                map[11] =  "                                                                                ";
                map[12] =  "                                                                                ";
                map[13] =  "                                                                                ";
                map[14] =  "                                                                                ";
                map[15] =  "                                                                                ";
                map[16] =  "                                                                                ";
            }
            case ("1") -> { // Test
                map[0] =   "  0102030405060708090a0b0c0d0e0f0g0h0i0j0k0l0m0n0o0p0q                          ";
                map[1] =   "                                                                                ";
                map[2] =   "                    040404                06  05  0h                            ";
                map[3] =   "    02  02          0404040o0p0q  0a      07  08  0i                            ";
                map[4] =   "                    040404                                                      ";
                map[5] =   "  01      01                                                                    ";
                map[6] =   "    010101                                                                      ";
                map[7] =   "                                                                                ";
                map[8] =   "                                                                                ";
                map[9] =   "  0b0b0b  0b0b  0b0b0b  0b0b0b                                                  ";
                map[10] =  "    0b    0b    0b        0b                                                    ";
                map[11] =  "    0b    0b0b  0b0b0b    0b                                                    ";
                map[12] =  "    0b    0b        0b    0b                                                    ";
                map[13] =  "    0b    0b0b  0b0b0b    0b                                                    ";
                map[14] =  "                                                                                ";
                map[15] =  "                                                                                ";
                map[16] =  "                                                                                ";
            }
            case ("1-ent") -> { // Test
                map[0] =   "                                                                                ";
                map[1] =   "                                                                                ";
                map[2] =   "                      0j  090909  09  0n                                        ";
                map[3] =   "                      0k              0m                                        ";
                map[4] =   "                                                                                ";
                map[5] =   "                                                                                ";
                map[6] =   "                                                                                ";
                map[7] =   "                                                                                ";
                map[8] =   "                                                                                ";
                map[9] =   "                                                                                ";
                map[10] =  "                                                                                ";
                map[11] =  "                                                                                ";
                map[12] =  "                                                                                ";
                map[13] =  "                                                                                ";
                map[14] =  "                                                                                ";
                map[15] =  "                                                                                ";
                map[16] =  "                                                                                ";
            }
            case ("EmptyDungeon") -> { // Dungeon Template
                map[0] =   "                                                                                ";
                map[1] =   "          050505050505050505050505050505050505050505050505050505050505          ";
                map[2] =   "          050808080808080808080808080808080808080808080808080808080805          ";
                map[3] =   "          050404040404040404040404040404040404040404040404040404040405          ";
                map[4] =   "          050404040404040404040404040404040404040404040404040404040405          ";
                map[5] =   "          050404040404040404040404040404040404040404040404040404040405          ";
                map[6] =   "          050404040404040404040404040404040404040404040404040404040405          ";
                map[7] =   "          050404040404040404040404040404040404040404040404040404040405          ";
                map[8] =   "          050404040404040404040404040404040404040404040404040404040405          ";
                map[9] =   "          050404040404040404040404040404040404040404040404040404040405          ";
                map[10] =  "          050404040404040404040404040404040404040404040404040404040405          ";
                map[11] =  "          050404040404040404040404040404040404040404040404040404040405          ";
                map[12] =  "          050404040404040404040404040404040404040404040404040404040405          ";
                map[13] =  "          050404040404040404040404040404040404040404040404040404040405          ";
                map[14] =  "          050505050505050505050505050505050505050505050505050505050505          ";
                map[15] =  "          080808080808080808080808080808080808080808080808080808080808          ";
                map[16] =  "                                                                            01ää";
            }
            case ("testing-ent") -> { // Testing entities
                map[0] =   "                                                                                ";
                map[1] =   "          0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä          ";
                map[2] =   "                                    090909  09                                  ";
                map[3] =   "                0b  0c0d            0o0p0q  0a                      06          ";
                map[4] =   "                                                                    07          ";
                map[5] =   "                                                                                ";
                map[6] =   "                                                                                ";
                map[7] =   "                                                                                ";
                map[8] =   "                      0g                  0f                                    ";
                map[9] =   "                    0g0g0g            0j  0n  0j                                ";
                map[10] =  "          06                          0k  0m  0k                                ";
                map[11] =  "          07                                                                    ";
                map[12] =  "                                                                                ";
                map[13] =  "                                                                                ";
                map[14] =  "          0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä0ä          ";
                map[15] =  "                                                                                ";
                map[16] =  "                                                                                ";
            }
        }
            // TODO: Mayhaps add an image scanner, such as to save maps even more easily.

        return map[i];
    }
}