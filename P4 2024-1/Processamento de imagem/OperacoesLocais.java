import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OperacoesLocais {
    public static BufferedImage SuavizaImgMediana(BufferedImage imagemEntrada, int dimensao) {
        int altura = imagemEntrada.getHeight();
        int largura = imagemEntrada.getWidth();
        
        int parteInteira = dimensao / 2;

        BufferedImage imagemSaida = new BufferedImage(largura, altura, imagemEntrada.getType());
        for (int l = parteInteira; l < largura - parteInteira; l++) {
            for (int a = parteInteira; a < altura - parteInteira; a++) {

                //List<List<Integer>> listaRGB = getListasRGB (imagemEntrada, l, a, dimensao);
                List<Integer> listaR = new ArrayList<>();
                List<Integer> listaG = new ArrayList<>();
                List<Integer> listaB = new ArrayList<>();
                for (int i = 0; i < dimensao; i++) {
                    for (int j = 0; j < dimensao; j++) {
                        Color corPixel = new Color(imagemEntrada.getRGB(l-parteInteira+j, a-parteInteira+i));
                        listaR.add(corPixel.getRed());
                        listaG.add(corPixel.getGreen());
                        listaB.add(corPixel.getBlue());
                    }
                }          
                
                Collections.sort(listaR);
                int corMedianaR = listaR.get(listaR.size() / 2);
                Collections.sort(listaG);
                int corMedianaG = listaG.get(listaG.size() / 2);
                Collections.sort(listaB);
                int corMedianaB = listaB.get(listaB.size() / 2);
                OperacoesManuais.pintaPixelCor(imagemSaida, new Color(corMedianaR,corMedianaG,corMedianaB), l, a);   

            }
        }
        return imagemSaida;
    }

    public static BufferedImage SuavizaImgMedia(BufferedImage imagemEntrada, int dimensao) {
        int altura = imagemEntrada.getHeight();
        int largura = imagemEntrada.getWidth();
        
        int parteInteira = dimensao / 2;
        BufferedImage imagemSaida = new BufferedImage(largura, altura, imagemEntrada.getType());
        for (int l = parteInteira; l < largura - parteInteira; l++) {
            for (int a = parteInteira; a < altura - parteInteira; a++) {

                double somaR = 0;
                double somaG = 0;
                double somaB = 0;
                for (int i = 0; i < dimensao; i++) {
                    for (int j = 0; j < dimensao; j++) {
                        Color corPixel = new Color(imagemEntrada.getRGB(l-parteInteira+j, a-parteInteira+i));

                        somaR += corPixel.getRed();
                        somaG += corPixel.getGreen();
                        somaB += corPixel.getBlue();
                    }
                }          
                int corMediaR = (int) (somaR/(dimensao * dimensao));
                int corMediaG = (int) (somaG/(dimensao * dimensao));
                int corMediaB = (int) (somaB/(dimensao * dimensao));
                OperacoesManuais.pintaPixelCor(imagemSaida, new Color(corMediaR,corMediaG,corMediaB), l, a);   

            }
        }
        return imagemSaida;
    }
    
    public static BufferedImage SuavizaGaussiano3x3(BufferedImage imagemEntrada) {
        int altura = imagemEntrada.getHeight();
        int largura = imagemEntrada.getWidth();
        
        BufferedImage imagemSaida = new BufferedImage(largura, altura, imagemEntrada.getType());

        double[][] filtroGaussiano = {{1.0/16, 2.0/16, 1.0/16},
                                      {2.0/16, 4.0/16, 2.0/16},
                                      {1.0/16, 2.0/16, 1.0/16}};
        for (int l = 1; l < largura - 1; l++) {
            for (int a = 1; a < altura - 1; a++) {

                double somaR = 0;
                double somaG = 0;
                double somaB = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        Color corPixel = new Color(imagemEntrada.getRGB(l-1+j, a-1+i));

                        somaR += corPixel.getRed() * filtroGaussiano[i][j];
                        somaG += corPixel.getGreen() * filtroGaussiano[i][j];
                        somaB += corPixel.getBlue() * filtroGaussiano[i][j];
                    }
                }          
                int corMediaR = OperacoesManuais.limitaPixel(somaR);
                int corMediaG = OperacoesManuais.limitaPixel(somaG);
                int corMediaB = OperacoesManuais.limitaPixel(somaB);
                OperacoesManuais.pintaPixelCor(imagemSaida, new Color(corMediaR,corMediaG,corMediaB), l, a);   

            }
        }
        return imagemSaida;
    }

    private static List<List<Integer>> getListasRGB (BufferedImage imagem, int l, int a, int dimensao){
        List<Integer> listaR = new ArrayList<>();
        List<Integer> listaG = new ArrayList<>();
        List<Integer> listaB = new ArrayList<>();
        List<List<Integer>> listaTotal = new ArrayList<>();
        int parteInteira = dimensao / 2;

        for (int i = 0; i < dimensao; i++) {
            for (int j = 0; j < dimensao; j++) {
                Color corPixel = new Color(imagem.getRGB(l-parteInteira+j, a-parteInteira+i));
                listaR.add(corPixel.getRed());
                listaG.add(corPixel.getGreen());
                listaB.add(corPixel.getBlue());
            }
        }  
        listaTotal.add(listaR);
        listaTotal.add(listaG);
        listaTotal.add(listaB);
        return listaTotal;
    }
}
