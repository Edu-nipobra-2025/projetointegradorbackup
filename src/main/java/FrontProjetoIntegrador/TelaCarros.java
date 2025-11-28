package FrontProjetoIntegrador;
import javax.swing.JFrame;
import java.awt.*;

public class TelaCarros {
    public static void main(String[] args){
      JFrame TelaCarros = new JFrame();
      TelaCarros.setTitle("Controle de Carros");
      TelaCarros.setExtendedState(JFrame.MAXIMIZED_BOTH);
      TelaCarros.setResizable(false);
      TelaCarros.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
      TelaCarros.setVisible(true);
      TelaCarros.getContentPane().setBackground(new Color(135, 175, 245));
    }
}
