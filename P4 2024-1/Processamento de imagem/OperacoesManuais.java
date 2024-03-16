import java.awt.*;
import java.awt.image.BufferedImage;

public class OperacoesManuais {
    public static void exibeRGBPixel(BufferedImage imagem){
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();
        for (int x = 0; x < largura; x++){
            for (int y = 0; y < altura; y++){
                System.out.println("Pixel [" + (x+1) + ", " + (y+1) + "]: " + convertRGBtoString(imagem.getRGB(x,y)));
            }
        }
    }
    public static BufferedImage bandasRGB(BufferedImage imagemEntrada, boolean red, boolean green, boolean blue){
        int altura = imagemEntrada.getHeight();
        int largura = imagemEntrada.getWidth();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, imagemEntrada.getType());
        for (int x = 0; x < largura; x++){
            for (int y = 0; y < altura; y++){
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
    public static String convertRGBtoString(int rgb_value){
        Color cor = new Color(rgb_value);
        return "("+cor.getRed()+", "+cor.getGreen()+", "+cor.getBlue()+")";
    }
    public static void pintaPixelCor(BufferedImage imagem, Color cor, int x, int y){
        imagem.setRGB(x,y, cor.getRGB());
        return;
    }
    public static BufferedImage negativo(BufferedImage imagemEntrada){
        int altura = imagemEntrada.getHeight();
        int largura = imagemEntrada.getWidth();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, imagemEntrada.getType());
        for (int x = 0; x < largura; x++){
            for (int y = 0; y < altura; y++){
                Color corPixel = new Color(imagemEntrada.getRGB(x, y));
                Color corNegativo = new Color(
                        255-corPixel.getRed(),
                        255-corPixel.getGreen(),
                        255-corPixel.getBlue()
                );
                pintaPixelCor(imagemSaida, corNegativo, x, y);
            }
        }
        return imagemSaida;
    }
    public static BufferedImage bandaCinza(BufferedImage imagemEntrada){
        int altura = imagemEntrada.getHeight();
        int largura = imagemEntrada.getWidth();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, imagemEntrada.getType());
        for (int x = 0; x < largura; x++){
            for (int y = 0; y < altura; y++){
                Color corPixel = new Color(imagemEntrada.getRGB(x, y));
                int media = (corPixel.getRed() + corPixel.getGreen() + corPixel.getBlue())/3;
                Color corCinzaMedia = new Color(media,media,media);
                pintaPixelCor(imagemSaida, corCinzaMedia, x, y);
            }
        }
        return imagemSaida;
    }

    public static BufferedImage bandaCinzaR(BufferedImage imagemEntrada){
        int altura = imagemEntrada.getHeight();
        int largura = imagemEntrada.getWidth();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, imagemEntrada.getType());
        for (int x = 0; x < largura; x++){
            for (int y = 0; y < altura; y++){
                Color corPixel = new Color(imagemEntrada.getRGB(x, y));
                Color corCinzaRed = new Color(corPixel.getRed(),corPixel.getRed(),corPixel.getRed());
                pintaPixelCor(imagemSaida, corCinzaRed, x, y);
            }
        }
        return imagemSaida;
    }

    public static BufferedImage bandaCinzaG(BufferedImage imagemEntrada){
        int altura = imagemEntrada.getHeight();
        int largura = imagemEntrada.getWidth();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, imagemEntrada.getType());
        for (int x = 0; x < largura; x++){
            for (int y = 0; y < altura; y++){
                Color corPixel = new Color(imagemEntrada.getRGB(x, y));
                Color corCinzaGreen = new Color(corPixel.getGreen(),corPixel.getGreen(),corPixel.getGreen());
                pintaPixelCor(imagemSaida, corCinzaGreen, x, y);
            }
        }
        return imagemSaida;
    }

    public static BufferedImage bandaCinzaB(BufferedImage imagemEntrada){
        int altura = imagemEntrada.getHeight();
        int largura = imagemEntrada.getWidth();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, imagemEntrada.getType());
        for (int x = 0; x < largura; x++){
            for (int y = 0; y < altura; y++){
                Color corPixel = new Color(imagemEntrada.getRGB(x, y));
                Color corCinzaBlue = new Color(corPixel.getBlue(),corPixel.getBlue(),corPixel.getBlue());
                pintaPixelCor(imagemSaida, corCinzaBlue, x, y);
            }
        }
        return imagemSaida;
    }

    public static BufferedImage MostraDiferenca(BufferedImage imagem1, BufferedImage imagem2){
        int altura = imagem1.getHeight();
        int largura = imagem1.getWidth();
        if(altura != imagem2.getHeight() || largura != imagem2.getWidth()){
            return null;
        }
        BufferedImage imagemSaida = new BufferedImage(largura, altura, imagem1.getType());
        for (int x = 0; x < largura; x++){
            for (int y = 0; y < altura; y++){
                int corPixelImagem1 = imagem1.getRGB(x, y);
                int corPixelImagem2 = imagem2.getRGB(x, y);
                if(corPixelImagem1 != corPixelImagem2){
                    Color corDiferenca = new Color(corPixelImagem2);
                    pintaPixelCor(imagemSaida, corDiferenca, x, y);
                } else {
                    pintaPixelCor(imagemSaida, new Color(255,255,255), x, y);
                }
            }
        }
        return imagemSaida;
    }
}
