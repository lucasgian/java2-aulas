import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChamadaForm extends JFrame implements ActionListener {
    private JTextField nomeField;
    private JTextField idadeField;
    private JButton loginButton;

    public ChamadaForm() {
        super("Chamada");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 300);
        setLocationRelativeTo(null);

        JLabel nomeLabel = new JLabel("Nome:");
        JLabel idadeLabel = new JLabel("Idade:");

        nomeField = new JTextField(20);
        idadeField = new JTextField(20);

        loginButton = new JButton("Cadastrar");
        loginButton.addActionListener(this);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(5, 5, 5, 5);
        panel.add(nomeLabel, constraints);
        constraints.gridy = 1;
        panel.add(idadeLabel, constraints);
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(nomeField, constraints);
        constraints.gridy = 1;
        panel.add(idadeField, constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        panel.add(loginButton, constraints);

        add(panel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String nome = nomeField.getText();
            String idade = new String(idadeField.getText());
            // Faça a validação de login aqui
            System.out.println("nome: " + nome);
            System.out.println("idade: " + idade);
        }
    }

}