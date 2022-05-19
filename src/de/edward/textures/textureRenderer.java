package de.edward.textures;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class textureRenderer {

    int PosX;
    int PosY;
    BufferedImage img;

    public textureRenderer(int PosX, int PosY){
        this.PosX = PosX;
        this.PosY = PosY;
    }


    public void drawTexture(Graphics g, int t, int t2, int q){
        String ta = "" + t + t2;
                switch (ta) {
                    default -> {
                        try {
                            img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/missing.png")));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "00" -> {
                        try {
                            img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/void.png")));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "0250" -> {
                        try {
                            img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/test.png")));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "255255" -> {
                        try {
                            img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/de/edward/textures/reference.png"))); // TODO: Finish this.
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "105150" -> {
                        if(q == 1) {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/plank.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/plank-h.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    case "145145" -> {
                        if(q == 1) {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/stone-brick.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/stone-brick-h.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    case "76201" -> {
                        if(q == 1) {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/upper-door.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/upper-door-h.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    case "46121" -> {
                        if(q == 1) {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/lower-door.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/lower-door-h.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    case "100100" -> {
                        if(q ==1) {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/stone-wall.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/stone-wall-h.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    case "92208" -> {
                        if(q ==1) {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/small-bookshelf-top.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/small-bookshelf-top-h.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    case "69146" -> {
                        if(q == 1) {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/small-bookshelf.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/small-bookshelf-h.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    case "230255" -> {
                        if(q == 1) {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/small-chest.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/small-chest-h.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    case "152157" -> {
                        if(q ==1) {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/left-large-chest.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/left-large-chest-h.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    case "142153" -> {
                        if(q ==1) {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/right-large-chest.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/right-large-chest-h.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    case "1970" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/player.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "0203" -> {
                        if(q == 1) {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/blood.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/blood-h.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    case "2034" -> {
                        if(q == 1) {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/coin.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/coin-h.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    case "112203" -> {
                        if(q ==1) {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/brick.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/brick-h.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    case "82149" -> {
                        if(q == 1) {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/brick-wall.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/brick-wall-h.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    case "0217" -> {
                        if(q == 1) {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/small-flame.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/small-flame-h.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    case "693" -> {
                        if(q ==1) {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/torch-holder-lit.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/torch-holder-lit-h.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    case "6106" -> {
                        if(q == 1) {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/torch-holder-unlit.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/torch-holder-unlit-h.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    case "13580" -> {
                        if(q == 1) {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/pedestal-lower.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/pedestal-lower-h.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    case "163132" -> {
                        if(q ==1) {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/pedestal-upper.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/pedestal-upper-h.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    case "6242" -> {
                        if(q ==1) {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/left-bookshelf.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/left-bookshelf-h.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    case "107109" -> {
                        if(q == 1) {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/mid-bookshelf.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/mid-bookshelf-h.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    case "164166" -> {
                        if(q == 1) {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/right-bookshelf.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            try {
                                img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/right-bookshelf-h.png"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
                g.drawImage(img, PosX, PosY, null);
    }

    public void drawEntity(Graphics g, int t, int t2, int q){
        String ta = "" + t + t2;
        switch (ta) {
            default -> {
                // Ignore
            }
            case "69146" -> {
                if(q == 1) {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/small-bookshelf.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/small-bookshelf-h.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "76201" -> {
                if(q == 1) {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/upper-door.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/upper-door-h.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "46121" -> {
                if(q == 1) {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/lower-door.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/lower-door-h.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "92208" -> {
                if(q ==1) {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/small-bookshelf-top.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/small-bookshelf-top-h.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "230255" -> {
                if(q == 1) {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/small-chest.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/small-chest-h.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                g.drawImage(img, PosX, PosY - 15, null);
            }
            case "152157" -> {
                if(q ==1) {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/left-large-chest.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/left-large-chest-h.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                g.drawImage(img, PosX, PosY - 15, null);
            }
            case "142153" -> {
                if(q ==1) {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/right-large-chest.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/right-large-chest-h.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                g.drawImage(img, PosX, PosY - 15, null);
            }
            case "1970" -> {
                try {
                    img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/player.png"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "0203" -> {
                if(q == 1) {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/blood.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/blood-h.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "2034" -> {
                if(q == 1) {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/coin.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/coin-h.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "0217" -> {
                if(q == 1) {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/small-flame.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/small-flame-h.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "693" -> {
                if(q ==1) {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/torch-holder-lit.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/torch-holder-lit-h.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "6106" -> {
                if(q == 1) {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/torch-holder-unlit.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/torch-holder-unlit-h.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "13580" -> {
                if(q == 1) {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/pedestal-lower.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/pedestal-lower-h.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "163132" -> {
                if(q ==1) {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/pedestal-upper.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/pedestal-upper-h.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "6242" -> {
                if(q ==1) {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/left-bookshelf.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/left-bookshelf-h.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "107109" -> {
                if(q == 1) {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/mid-bookshelf.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/mid-bookshelf-h.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "164166" -> {
                if(q == 1) {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/right-bookshelf.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/right-bookshelf-h.png"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                g.drawImage(img, PosX, PosY, null);
            }
        }   //  It's shit, I know...
    }

}
