package view;
import controller.GewinnController;

import java.awt.*;
import javax.swing.*;


public class GewinnView extends JFrame {
    private JLabel lblGesamtpunkte;
    private JLabel lblRundengebnis;
    private JTextField txtEingabe;
    private JTextField txtComputerZahl;
    private JButton btnNochEinmal;

    public GewinnView(GewinnController controller) {
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

        lblRundengebnis.setOpaque(true);
        lblRundengebnis.setBackground(Color.WHITE);

        lblGesamtpunkte.setOpaque(true);
        lblGesamtpunkte.setBackground(Color.WHITE);


        gesamtP.add(gesamtT, BorderLayout.NORTH);
        gesamtP.add(lblGesamtpunkte, BorderLayout.CENTER);
        topPanel.add(rundenP);
        topPanel.add(gesamtP);

        JPanel centerP = new JPanel(new GridLayout(1, 2));


        JPanel spielerP = new JPanel(new BorderLayout());
        JLabel spielerLabel = new JLabel("Deine Zahl:");

        txtEingabe = new JTextField();
        txtEingabe.setFont(new Font("Arial", Font.PLAIN, 20));
        txtEingabe.setHorizontalAlignment(JTextField.CENTER);
        txtEingabe.setActionCommand("Enter");
        txtEingabe.addActionListener(controller);


        spielerP.add(spielerLabel, BorderLayout.NORTH);
        spielerP.add(txtEingabe, BorderLayout.CENTER);


        JPanel computerP = new JPanel(new BorderLayout());
        JLabel computerT = new JLabel("Computer:");
        computerT.setFont(new Font("Arial", Font.BOLD, 12));

        txtComputerZahl = new JTextField();
        txtComputerZahl.setEditable(false);
        txtComputerZahl.setFont(new Font("Arial", Font.PLAIN, 20));
        txtComputerZahl.setHorizontalAlignment(JTextField.CENTER);

        computerP.add(computerT, BorderLayout.NORTH);
        computerP.add(txtComputerZahl, BorderLayout.CENTER);

        centerP.add(spielerP);
        centerP.add(computerP);
        panel.add(centerP, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        btnNochEinmal = new JButton("Noch einmal!");
        btnNochEinmal.setActionCommand("NochEinmal");
        btnNochEinmal.addActionListener(controller);
        bottomPanel.add(btnNochEinmal);
        panel.add(bottomPanel, BorderLayout.SOUTH);


        add(panel);
        setVisible(true);

    }
    public JLabel getLblGesamtpunkte() {
        return lblGesamtpunkte;
    }

    public JLabel getLblRundengebnis() {
        return lblRundengebnis;
    }

    public JTextField getTxtEingabe() {
        return txtEingabe;
    }

    public JTextField getTxtComputerZahl() {
        return txtComputerZahl;
    }

    public JButton getBtnNochEinmal() {
        return btnNochEinmal;
    }
}
