package de.edward.textures;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class textureRenderer {

    int PosX;
    int PosY;
    BufferedImage img;

    public textureRenderer(int PosX, int PosY){
        this.PosX = PosX;
        this.PosY = PosY;
    }


    public void drawTexture(Graphics g, char t, char t2, int q){
        String ta = "" + t + t2;
                switch (ta) {
                    default -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/missing.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "  " -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/void.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "01" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/test.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "02" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/reference.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "04" -> {
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
                    case "05" -> {
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
                    case "06" -> {
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
                    case "07" -> {
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
                    case "08" -> {
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
                    case "09" -> {
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
                    case "0a" -> {
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
                    case "0b" -> {
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
                    case "0c" -> {
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
                    case "0d" -> {
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
                    case "0e" -> {
                        try {
                            img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/player.png"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "0f" -> {
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
                    case "0g" -> {
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
                    case "0h" -> {
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
                    case "0i" -> {
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
                    case "0j" -> {
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
                    case "0k" -> {
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
                    case "0l" -> {
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
                    case "0m" -> {
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
                    case "0n" -> {
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
                    case "0o" -> {
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
                    case "0p" -> {
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
                    case "0q" -> {
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

    public void drawEntity(Graphics g, char t, char t2, int q){
        String ta = "" + t + t2;
        switch (ta) {
            default -> {
                // Ignore
            }
            case "0a" -> {
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
            case "06" -> {
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
            case "07" -> {
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
            case "09" -> {
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
            case "0b" -> {
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
            case "0c" -> {
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
            case "0d" -> {
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
            case "0e" -> {
                try {
                    img = ImageIO.read(new File("/home/edward/IdeaProjects/Movable/src/de/edward/textures/player.png"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(img, PosX, PosY, null);
            }
            case "0f" -> {
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
            case "0g" -> {
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
            case "0j" -> {
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
            case "0k" -> {
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
            case "0l" -> {
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
            case "0m" -> {
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
            case "0n" -> {
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
            case "0o" -> {
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
            case "0p" -> {
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
            case "0q" -> {
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
