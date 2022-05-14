package de.edward.maps;

public class mapDir {

    String[] map = new String[10];

    String fetchMap(char t, int i) {

        switch (t) {
            case ('1') -> {
                map[0] =  "          ";
                map[1] =  "          ";
                map[2] =  "          ";
                map[3] =  "          ";
                map[4] =  "          ";
                map[5] =  "    11    ";
                map[6] =  "    21    ";
                map[7] =  "          ";
                map[8] =  "          ";
                map[9] =  "          ";
            }
        }


        return map[i];
    }
}