package FrontProjetoIntegrador;
import javax.swing.*;
import java.awt.*;
public class MainFrame {

    public static void main(String[] args) {

        //Botões
        JButton mainbotao = new JButton();

        // Texto Avulso
        JLabel tpTexto1 = new JLabel();
        tpTexto1.setText("Bem Vindo ao Sistema.");
        tpTexto1.setHorizontalAlignment((JLabel.CENTER));
        tpTexto1.setVisible(true);
        //Tela
        JFrame TelaPrincipal = new JFrame();

        TelaPrincipal.setTitle("TelaInicial");
        TelaPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        TelaPrincipal.setResizable(true);
        TelaPrincipal.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        TelaPrincipal.setVisible(true);
        TelaPrincipal.getContentPane().setBackground(new Color(135, 175, 245));
        TelaPrincipal.add(tpTexto1);

        //Deixe NESSA ordem, botão, texto e depois a tela principal, pois a tela precisa ler o que está antes.
        //
    }
}