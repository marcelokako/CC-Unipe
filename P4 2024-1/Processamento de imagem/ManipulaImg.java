import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ManipulaImg {
    public static void exibirImagem(String titulo, BufferedImage... imagens) {
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

    public static BufferedImage pegarImagem(String path) throws IOException {
        try{
            return ImageIO.read(new File(path));
        } catch (IOException e){
            System.out.println("Erro ao pegar a imagem");
            throw new RuntimeException(e);
        }
    }

    public static void salvarImagem(BufferedImage imagem, String formato, String nomeImagem) throws IOException {
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
