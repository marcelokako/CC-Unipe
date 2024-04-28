import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class OperacoesManuais {
    public static void exibeRGBPixel(BufferedImage imagem) {
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();
        for (int x = 0; x < largura; x++) {
            for (int y = 0; y < altura; y++) {
                System.out.println(
                        "Pixel [" + (x + 1) + ", " + (y + 1) + "]: " + convertRGBtoString(imagem.getRGB(x, y)));
            }
        }
    }

    public static BufferedImage bandasRGB(BufferedImage imagemEntrada, boolean red, boolean green, boolean blue) {
        int altura = imagemEntrada.getHeight();
        int largura = imagemEntrada.getWidth();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, imagemEntrada.getType());
        for (int x = 0; x < largura; x++) {
            for (int y = 0; y < altura; y++) {
                Color corPixel = new Color(imagemEntrada.getRGB(x, y));
                Color corBanda = new Color(
                        red ? corPixel.getRed() : 0,
                        green ? corPixel.getGreen() : 0,
                        blue ? corPixel.getBlue() : 0);
                pintaPixelCor(imagemSaida, corBanda, x, y);
            }
        }
        return imagemSaida;
    }

    public static String convertRGBtoString(int rgb_value) {
        Color cor = new Color(rgb_value);
        return "(" + cor.getRed() + ", " + cor.getGreen() + ", " + cor.getBlue() + ")";
    }

    public static void pintaPixelCor(BufferedImage imagem, Color cor, int x, int y) {
        imagem.setRGB(x, y, cor.getRGB());
        return;
    }

    public static BufferedImage negativo(BufferedImage imagemEntrada) {
        int altura = imagemEntrada.getHeight();
        int largura = imagemEntrada.getWidth();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, imagemEntrada.getType());
        for (int x = 0; x < largura; x++) {
            for (int y = 0; y < altura; y++) {
                Color corPixel = new Color(imagemEntrada.getRGB(x, y));
                Color corNegativo = new Color(
                        255 - corPixel.getRed(),
                        255 - corPixel.getGreen(),
                        255 - corPixel.getBlue());
                pintaPixelCor(imagemSaida, corNegativo, x, y);
            }
        }
        return imagemSaida;
    }

    public static BufferedImage bandaCinza(BufferedImage imagemEntrada) {
        int altura = imagemEntrada.getHeight();
        int largura = imagemEntrada.getWidth();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, imagemEntrada.getType());
        for (int x = 0; x < largura; x++) {
            for (int y = 0; y < altura; y++) {
                Color corPixel = new Color(imagemEntrada.getRGB(x, y));
                int media = (corPixel.getRed() + corPixel.getGreen() + corPixel.getBlue()) / 3;
                Color corCinzaMedia = new Color(media, media, media);
                pintaPixelCor(imagemSaida, corCinzaMedia, x, y);
            }
        }
        return imagemSaida;
    }

    public static BufferedImage bandaCinzaR(BufferedImage imagemEntrada) {
        int altura = imagemEntrada.getHeight();
        int largura = imagemEntrada.getWidth();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, imagemEntrada.getType());
        for (int x = 0; x < largura; x++) {
            for (int y = 0; y < altura; y++) {
                Color corPixel = new Color(imagemEntrada.getRGB(x, y));
                Color corCinzaRed = new Color(corPixel.getRed(), corPixel.getRed(), corPixel.getRed());
                pintaPixelCor(imagemSaida, corCinzaRed, x, y);
            }
        }
        return imagemSaida;
    }

    public static BufferedImage bandaCinzaG(BufferedImage imagemEntrada) {
        int altura = imagemEntrada.getHeight();
        int largura = imagemEntrada.getWidth();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, imagemEntrada.getType());
        for (int x = 0; x < largura; x++) {
            for (int y = 0; y < altura; y++) {
                Color corPixel = new Color(imagemEntrada.getRGB(x, y));
                Color corCinzaGreen = new Color(corPixel.getGreen(), corPixel.getGreen(), corPixel.getGreen());
                pintaPixelCor(imagemSaida, corCinzaGreen, x, y);
            }
        }
        return imagemSaida;
    }

    public static BufferedImage bandaCinzaB(BufferedImage imagemEntrada) {
        int altura = imagemEntrada.getHeight();
        int largura = imagemEntrada.getWidth();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, imagemEntrada.getType());
        for (int x = 0; x < largura; x++) {
            for (int y = 0; y < altura; y++) {
                Color corPixel = new Color(imagemEntrada.getRGB(x, y));
                Color corCinzaBlue = new Color(corPixel.getBlue(), corPixel.getBlue(), corPixel.getBlue());
                pintaPixelCor(imagemSaida, corCinzaBlue, x, y);
            }
        }
        return imagemSaida;
    }

    public static BufferedImage MostraDiferenca(BufferedImage imagem1, BufferedImage imagem2) {
        int altura = imagem1.getHeight();
        int largura = imagem1.getWidth();
        if (altura != imagem2.getHeight() || largura != imagem2.getWidth()) {
            throw new RuntimeException("Erro: Imagens de tamanhos diferentes");
        }
        BufferedImage imagemSaida = new BufferedImage(largura, altura, imagem1.getType());
        for (int x = 0; x < largura; x++) {
            for (int y = 0; y < altura; y++) {
                int corPixelImagem1 = imagem1.getRGB(x, y);
                int corPixelImagem2 = imagem2.getRGB(x, y);
                if (corPixelImagem1 != corPixelImagem2) {
                    Color corDiferenca = new Color(corPixelImagem2);
                    pintaPixelCor(imagemSaida, corDiferenca, x, y);
                } else {
                    pintaPixelCor(imagemSaida, new Color(255, 255, 255), x, y);
                }
            }
        }
        return imagemSaida;
    }

    public static BufferedImage BinarizarImg(BufferedImage imagem, int limiar) {
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();
        if (limiar < 0 || limiar > 255) {
            throw new RuntimeException("Erro: valor de limiar inválido");
        }
        BufferedImage imagemSaida = new BufferedImage(largura, altura, imagem.getType());
        for (int x = 0; x < largura; x++) {
            for (int y = 0; y < altura; y++) {
                Color corPixel = new Color(imagem.getRGB(x, y));
                int media = (corPixel.getRed() + corPixel.getGreen() + corPixel.getBlue()) / 3;
                Color corBinaria = media > limiar
                        ? new Color(255, 255, 255)
                        : new Color(0, 0, 0);
                pintaPixelCor(imagemSaida, corBinaria, x, y);
            }
        }
        return imagemSaida;
    }

    public static int limitaPixel(double pixel) {
        if (pixel > 255)
            return 255;
        if (pixel < 0)
            return 0;
        return (int) pixel;
    }

    public static BufferedImage aumentoTonalidade(BufferedImage imagem, String banda, int tom) {

        if (!banda.equalsIgnoreCase("red") &&
                !banda.equalsIgnoreCase("green") &&
                !banda.equalsIgnoreCase("blue")) {
            throw new IllegalArgumentException("Erro: Banda de cor inválida");
        }
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, imagem.getType());
        for (int x = 0; x < largura; x++) {
            for (int y = 0; y < altura; y++) {
                Color corPixel = new Color(imagem.getRGB(x, y));
                int red = corPixel.getRed();
                int green = corPixel.getGreen();
                int blue = corPixel.getBlue();
                if (banda.equalsIgnoreCase("red")) {
                    red = limitaPixel(red + tom);
                } else if (banda.equalsIgnoreCase("green")) {
                    green = limitaPixel(green + tom);
                } else { // case "blue"
                    blue = limitaPixel(blue + tom);
                }
                Color corTomAdd = new Color(red, green, blue);
                pintaPixelCor(imagemSaida, corTomAdd, x, y);
            }
        }
        return imagemSaida;
    }

    public static BufferedImage aumentoBrilhoAdd(BufferedImage imagem, int aumentoBrilho) {
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, imagem.getType());
        for (int x = 0; x < largura; x++) {
            for (int y = 0; y < altura; y++) {
                Color corPixel = new Color(imagem.getRGB(x, y));
                Color corBrilhoAdd = new Color(
                        limitaPixel(corPixel.getRed() + aumentoBrilho),
                        limitaPixel(corPixel.getGreen() + aumentoBrilho),
                        limitaPixel(corPixel.getBlue() + aumentoBrilho));
                pintaPixelCor(imagemSaida, corBrilhoAdd, x, y);
            }
        }
        return imagemSaida;
    }

    public static BufferedImage aumentoBrilhoMult(BufferedImage imagem, double aumentoBrilho) {
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, imagem.getType());
        for (int x = 0; x < largura; x++) {
            for (int y = 0; y < altura; y++) {
                Color corPixel = new Color(imagem.getRGB(x, y));
                Color corBrilhoMult = new Color(
                        limitaPixel(corPixel.getRed() * aumentoBrilho),
                        limitaPixel(corPixel.getGreen() * aumentoBrilho),
                        limitaPixel(corPixel.getBlue() * aumentoBrilho));
                pintaPixelCor(imagemSaida, corBrilhoMult, x, y);
            }
        }
        return imagemSaida;
    }

    public static double[][][] rgb2yiq(BufferedImage imagem) {
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();
        double[][][] arrayYIQ = new double[largura][altura][3];

        for (int x = 0; x < largura; x++) {
            for (int y = 0; y < altura; y++) {
                Color corPixel = new Color(imagem.getRGB(x, y));
                int red = corPixel.getRed();
                int green = corPixel.getGreen();
                int blue = corPixel.getBlue();
                arrayYIQ[x][y][0] = ((0.299 * red) + (0.587 * green) + (0.114 * blue)); // Y
                arrayYIQ[x][y][1] = ((0.596 * red) - (0.274 * green) - (0.322 * blue)); // I
                arrayYIQ[x][y][2] = ((0.211 * red) - (0.523 * green) + (0.312 * blue)); // Q
            }
        }

        return arrayYIQ;
    }

    public static BufferedImage yiq2rgb(double[][][] arrayYIQ) {
        int largura = arrayYIQ.length;
        int altura = arrayYIQ[0].length;
        BufferedImage imagemSaida = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_ARGB);

        for (int x = 0; x < largura; x++) {
            for (int y = 0; y < altura; y++) {
                double Y = arrayYIQ[x][y][0];
                double I = arrayYIQ[x][y][1];
                double Q = arrayYIQ[x][y][2];
                Color corPixel = new Color(
                        limitaPixel(Y + 0.956 * I + 0.621 * Q), // red
                        limitaPixel(Y - 0.272 * I - 0.647 * Q), // green
                        limitaPixel(Y - 1.106 * I + 1.703 * Q) // blue
                );

                pintaPixelCor(imagemSaida, corPixel, x, y);

            }
        }

        return imagemSaida;
    }

    public static BufferedImage aumentoBrilhoAdd(double[][][] arrayYIQ, int aumentoBrilho) {
        int largura = arrayYIQ.length;
        int altura = arrayYIQ[0].length;

        for (int x = 0; x < largura; x++) {
            for (int y = 0; y < altura; y++) {
                arrayYIQ[x][y][0] += aumentoBrilho;
            }
        }
        return yiq2rgb(arrayYIQ);
    }

    public static BufferedImage aumentoBrilhoMult(double[][][] arrayYIQ, double aumentoBrilho) {
        int largura = arrayYIQ.length;
        int altura = arrayYIQ[0].length;

        for (int x = 0; x < largura; x++) {
            for (int y = 0; y < altura; y++) {
                arrayYIQ[x][y][0] *= aumentoBrilho;
            }
        }
        return yiq2rgb(arrayYIQ);
    }

    public static BufferedImage negativo(double[][][] arrayYIQ) {
        int largura = arrayYIQ.length;
        int altura = arrayYIQ[0].length;

        for (int x = 0; x < largura; x++) {
            for (int y = 0; y < altura; y++) {
                arrayYIQ[x][y][0] = 255.0 - arrayYIQ[x][y][0];
            }
        }
        return yiq2rgb(arrayYIQ);
    }
}
