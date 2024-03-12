import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // String url_imagem = "Processamento de imagem\\exemplo.png";
        String url_imagem = "src/exemplo.png";

        BufferedImage imagemAntes = ManipulaImg.pegarImagem(url_imagem);
        BufferedImage imagem = ManipulaImg.pegarImagem(url_imagem);

        int altura = imagem.getHeight();
        int largura = imagem.getWidth();
        int qtdPixel = altura * largura;
        System.out.println("Altura: " + altura);
        System.out.println("Largura: " + largura);
        System.out.println("Quantidade de pixels: " + qtdPixel);

        OperacoesManuais.pintaPixelCor(imagem, Color.blue,0,0);
        OperacoesManuais.pintaPixelCor(imagem, Color.green,largura/2,altura/2);
        OperacoesManuais.pintaPixelCor(imagem, Color.red,largura-1,altura-1);
        //exibeRGBPixel(imagem);

        BufferedImage bandaRed = OperacoesManuais.bandasRGB(imagem, true, false, false);
        //BufferedImage bandaGreen = OperacoesManuais.bandasRGB(imagem, false, true, false);
        //BufferedImage bandaBlue = OperacoesManuais.bandasRGB(imagem, false, false, true);

        BufferedImage negativo = OperacoesManuais.negativo(imagem);
        BufferedImage bandaCinza = OperacoesManuais.bandaCinza(imagem);
        
        ManipulaImg.exibirImagem(
                "Processamento de imagem", 
                imagemAntes, 
                bandaRed, 
                negativo, 
                bandaCinza);
        //ManipulaImg.salvarImagem(imagem, "png", "/exemplo_edit.png");
    }

}
