import javax.swing.*;

public class Formulario2 extends JFrame {
    private JLabel labelNome;
    private JTextField campoNome;
    private JButton botaoEnviar;

    public Formulario2() {
        super("Formulário");
        setSize(300, 150);

        labelNome = new JLabel("Nome:");
        campoNome = new JTextField(20);
        botaoEnviar = new JButton("Enviar");

        JPanel painel = new JPanel();
        painel.add(labelNome);
        painel.add(campoNome);
        painel.add(botaoEnviar);

        this.setContentPane(painel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}