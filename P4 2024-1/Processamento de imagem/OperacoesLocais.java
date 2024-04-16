import java.awt.*;
import java.awt.image.BufferedImage;

public class OperacoesLocais {
    public static BufferedImage SuavizaImgMediana(BufferedImage imagemEntrada) {
        int altura = imagemEntrada.getHeight();
        int largura = imagemEntrada.getWidth();
        
        BufferedImage imagemSaida = new BufferedImage(largura, altura, imagemEntrada.getType());
        for (int x = 1; x < largura-1; x++) {
            for (int y = 1; y < altura-1; y++) {
                int[] arrayMediana = new int[9];
                for (int i = 0; i < arrayMediana.length; i++) {
                    
                }
                
//                pintaPixelCor(imagemSaida, corNegativo, x, y); PINTA VALOR CENTRAL
                
            }
        }
        return imagemSaida;
    }
}
