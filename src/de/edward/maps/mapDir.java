package de.edward.maps;

public class mapDir {

    String[] map = new String[17];

    String fetchMap(String t, int i) {

        switch (t) {
            default -> { // Missing Map
                map[0] =   "                                        ";
                map[1] =   " b  b bbbb  b   b bbb bbb  ä1           ";
                map[2] =   " bb b b  b  bb bb b b b b  ä1           ";
                map[3] =   " b bb b  b  b b b bbb bbb  ä1           ";
                map[4] =   " b  b bbbb  b   b b b b    ä1           ";
                map[5] =   "                                        ";
                map[6] =   "                           ää           ";
                map[7] =   "                           11           ";
                map[8] =   "                                        ";
                map[9] =   "                                        ";
                map[10] =  "                                        ";
                map[11] =  "                                        ";
                map[12] =  "                                        ";
                map[13] =  "                                        ";
                map[14] =  "                                        ";
                map[15] =  "                                        ";
                map[16] =  "                                        ";
            }
            case ("1") -> { // Test
                map[0] =   "                                        ";
                map[1] =   "               123 bä                   ";
                map[2] =   "                                        ";
                map[3] =   "   2 2                                  ";
                map[4] =   "                                        ";
                map[5] =   "  1   1                                 ";
                map[6] =   "   111                                  ";
                map[7] =   "                                        ";
                map[8] =   "                                        ";
                map[9] =   " bbb bb bbb bbb                         ";
                map[10] =  "  b  b  b    b                          ";
                map[11] =  "  b  bb bbb  b                          ";
                map[12] =  "  b  b    b  b                          ";
                map[13] =  "  b  bb bbb  b                          ";
                map[14] =  "                                        ";
                map[15] =  "                                        ";
                map[16] =  "                                        ";
            }
            case ("map_EmptyDungeon") -> { // Dungeon Template
                map[0] =   "                                        ";
                map[1] =   "     55555555555555555555555555555      ";
                map[2] =   "     54444444444444444444444444445      ";
                map[3] =   "     54444444444444444444444444445      ";
                map[4] =   "     54444444444444444444444444445      ";
                map[5] =   "     54444444444444444444444444445      ";
                map[6] =   "     54444444444444444444444444445      ";
                map[7] =   "     54444444444444444444444444445      ";
                map[8] =   "     54444444444444444444444444445      ";
                map[9] =   "     54444444444444444444444444445      ";
                map[10] =  "     54444444444444444444444444445      ";
                map[11] =  "     34444444444444444444444444445      ";
                map[12] =  "     54444444444444444444444444445      ";
                map[13] =  "     54444444444444444444444444445      ";
                map[14] =  "     54444444444444444444444444445      ";
                map[15] =  "     55555555555555555555555555555      ";
                map[16] =  "                                        ";
            }
        }


        return map[i];
    }
}