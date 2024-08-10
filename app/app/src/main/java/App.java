import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class App extends JFrame {

    public App() {
        setTitle("Contagem de Dias até o Fim do Ano");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        LocalDate hoje = LocalDate.now();
        LocalDate fimAno = LocalDate.of(hoje.getYear(), 12, 31);
        long diasRestantes = ChronoUnit.DAYS.between(hoje, fimAno);

        JLabel label = new JLabel("Dias restantes até o final do ano: " + diasRestantes);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        
        add(label);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(App::new);
    }
}
