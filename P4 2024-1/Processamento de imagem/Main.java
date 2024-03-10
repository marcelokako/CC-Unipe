import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedImage imagemAntes = pegarImagem("Processamento de imagem\\exemplo.png");
        BufferedImage imagem = pegarImagem("Processamento de imagem\\exemplo.png");
        BufferedImage imagem1 = pegarImagem("Processamento de imagem\\exemplo.png");
        BufferedImage imagem2 = pegarImagem("Processamento de imagem\\exemplo.png");
        BufferedImage imagem3 = pegarImagem("Processamento de imagem\\exemplo.png");

        int altura = imagem.getHeight();
        int largura = imagem.getWidth();
        int qtdPixel = altura * largura;
        System.out.println("Altura: " + altura);
        System.out.println("Largura: " + largura);
        System.out.println("Quantidade de pixels: " + qtdPixel);

        pintaPixelCor(imagem, Color.blue,0,0);
        pintaPixelCor(imagem, Color.green,altura/2,largura/2);
        pintaPixelCor(imagem, Color.red,altura-1,largura-1);
        //exibeRGBPixel(imagem);
        
        BufferedImage bandaRed = bandasRGB(imagem1, true, false, false);
        BufferedImage bandaGreen = bandasRGB(imagem2, false, true, false);
        BufferedImage bandaBlue = bandasRGB(imagem3, false, false, true);

        exibirImagem("Processamento de imagem", imagemAntes, bandaRed, bandaGreen, bandaBlue, imagem);
        salvarImagem(imagem, "png", "/exemplo_edit.png");
    }


    private static void exibeRGBPixel(BufferedImage imagem){
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();
        for (int x = 0; x < altura; x++){
            for (int y = 0; y < largura; y++){
                System.out.println("Pixel [" + (x+1) + ", " + (y+1) + "]: " + convertRGBtoString(imagem.getRGB(x,y)));
            }
        }
    }
    private static BufferedImage bandasRGB(BufferedImage imagem, boolean red, boolean green, boolean blue){
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();
        for (int x = 0; x < altura; x++){
            for (int y = 0; y < largura; y++){
                Color corPixel = new Color(imagem.getRGB(x, y));
                Color corBanda = new Color(
                    red ? corPixel.getRed() : 0,
                    green ? corPixel.getGreen() : 0,
                    blue ? corPixel.getBlue() : 0);
                pintaPixelCor(imagem, corBanda, x, y);
            }
        }
        return imagem;
    }
    private static String convertRGBtoString(int rgb_value){
        Color cor = new Color(rgb_value);
        return "("+cor.getRed()+", "+cor.getGreen()+", "+cor.getBlue()+")";
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

    private static BufferedImage getEstadoImagemAtual(BufferedImage imagem){
        BufferedImage estado = new BufferedImage(imagem.getWidth(), imagem.getHeight(), imagem.getType());
        Graphics2D g = estado.createGraphics();
        g.drawImage(imagem, 0, 0, null);
        // g.dispose();
        return estado;
    }
}
