import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedImage imagemAntes = pegarImagem("src/imagem.jpg");
        BufferedImage imagem = pegarImagem("src/imagem.jpg");

        int altura = imagem.getHeight();
        int largura = imagem.getWidth();
        int qtdPixel = altura * largura;
        System.out.println("Altura: " + altura);
        System.out.println("Largura: " + largura);
        System.out.println("Quantidade de pixels: " + qtdPixel);


        Color corAzul = new Color(0,0,255);
        Color corVerde = new Color(0, 255, 0);
        Color corVermelho = new Color(255,0,0);

        pintaPixelCor(imagem, corAzul,0,0);
        pintaPixelCor(imagem, corVerde,altura/2,largura/2);
        pintaPixelCor(imagem, corVermelho,altura-1,largura-1);

        exibeRGBPixel(imagem);
        exibirImagem("Processamento de imagem", imagemAntes, imagem);
        salvarImagem(imagem, "jpg", "src/imagem2.jpg");
    }

    private static void exibeRGBPixel(BufferedImage imagem){
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();
        for (int x = 0; x < altura; x++){
            for (int y = 0; y < largura; y++){
                System.out.println("Pixel " + (x+1) + ", " + (y+1) + ": " + convertIntRGB(imagem.getRGB(x,y)));
            }
        }
    }
    private static String convertIntRGB(int rgb_value){
        int blue = rgb_value & 0xff;
        int green = (rgb_value & 0xff00) >> 8;
        int red = (rgb_value & 0xff0000) >> 16;
        return "("+red+", "+green+", "+blue+")";
    }

    private static void pintaPixelCor(BufferedImage imagem, Color cor, int x, int y){
        imagem.setRGB(x,y, cor.getRGB());
        return;
    }

    private static void exibirImagem(String titulo, BufferedImage... imagens) {
        JFrame frame = new JFrame();
        frame.setTitle(titulo);
        frame.getContentPane().setLayout(new FlowLayout());
        for (BufferedImage imagem : imagens){
            JLabel label = new JLabel(new ImageIcon(imagem));
            frame.getContentPane().add(label);
        }

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private static BufferedImage pegarImagem(String path) throws IOException {
        try{
            return ImageIO.read(new File(path));
        } catch (IOException e){
            System.out.println("Erro ao pegar a imagem");
            throw new RuntimeException(e);
        }
    }

    private static void salvarImagem(BufferedImage imagem, String formato, String nomeImagem) throws IOException {
        try {
            ImageIO.write(imagem,formato,new File(nomeImagem));
            System.out.println("Imagem salva com sucesso");
            return;
        } catch (IOException e){
            System.out.println("Erro ao salvar a imagem");
            throw new RuntimeException(e);
        }

    }
}
