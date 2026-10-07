package view;
import java.awt.*;
import javax.swing.*;

public class GewinnView extends JFrame {
    private JLabel lblGesamtpunkte;
    private JLabel lblRundengebnis;
    private JTextField txtEingabe;
    private JTextField txtComputerZahl;
    private JButton btnNochEinmal;

    public GewinnView() {
        setTitle("Zahlen-Gewinnspiel (v1.0)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel(new BorderLayout());
        JPanel topPanel = new JPanel(new GridLayout(1, 2));
        panel.add(topPanel, BorderLayout.NORTH);
        JPanel rundenP = new JPanel(new BorderLayout());
        JLabel rundenT = new JLabel("Rundenergebnis:");
        lblRundengebnis = new JLabel("Tippe eine Zahl von 1 bis 9");
        lblRundengebnis.setFont(new Font("Arial", Font.BOLD, 18));
        rundenP.add(rundenT, BorderLayout.NORTH);
        rundenP.add(lblRundengebnis, BorderLayout.CENTER);

        JPanel gesamtP = new JPanel(new BorderLayout());
        JLabel gesamtT = new JLabel("Gesamtpunkte:");
        lblGesamtpunkte = new JLabel("Gesamtpunkte: 30");
        lblGesamtpunkte.setFont(new Font("Arial", Font.BOLD, 18));
        gesamtP.add(gesamtT, BorderLayout.NORTH);
        gesamtP.add(lblGesamtpunkte, BorderLayout.CENTER);

        topPanel.add(rundenP);
        topPanel.add(gesamtP);

        add(panel);
        setVisible(true);

    }
}
