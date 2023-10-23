import javax.swing.*;

public class Window {
public static void main(String[] args) {
SwingUtilities.invokeLater(() -> {
JFrame janela = new JFrame("Primeira Janela");

janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
janela.setSize(300,200);
JButton botao = new JButton("Clique-me");
janela.add(botao);
janela.setVisible(true);
});

}
}
