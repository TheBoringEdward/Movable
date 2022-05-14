package de.edward.maps;

public class mapDir {

    String[] map = new String[17];

    String fetchMap(char t, int i) {

        switch (t) {
            case ('1') -> {
                map[0] =   "                                        ";
                map[1] =   "                                        ";
                map[2] =   "                                        ";
                map[3] =   "   2 2                                  ";
                map[4] =   "                                        ";
                map[5] =   "  1   1                                 ";
                map[6] =   "   111                                  ";
                map[7] =   "                                        ";
                map[8] =   "                                        ";
                map[9] =   "                                        ";
                map[10] =  "               3                        ";
                map[11] =  "                                        ";
                map[12] =  "                                        ";
                map[13] =  "                                        ";
                map[14] =  "                                        ";
                map[15] =  "                                        ";
                map[16] =  "                                        ";
            }
        }


        return map[i];
    }
}