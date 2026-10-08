package controller;
import model.GewinnModel;
import view.GewinnView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public  class GewinnController implements ActionListener {
    private GewinnModel m;
    private GewinnView g;

    public GewinnController() {
        this.m = new GewinnModel();
        this.g = new GewinnView(this);
        g.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Enter")) {
            String eingabe = g.getTxtEingabe().getText();
            int eingabeZahl;
            try {
                eingabeZahl = Integer.parseInt(eingabe);
            } catch (NumberFormatException ex) {
                g.getLblRundengebnis().setText("Gib eine Zahl von 1 bis 9");
                return;
            }
            if (eingabeZahl < 1 || eingabeZahl > 9) {
                g.getLblRundengebnis().setText("Gib eine Zahl von 1 bis 9");
                return;
            }
            m.berechneComputerZahl();
            m.berechneRunde(eingabeZahl);
            g.getTxtComputerZahl().setText("" + m.getComputerZahl());
            g.getLblRundengebnis().setText("" + m.getRundenErgebnis());
            g.getLblGesamtpunkte().setText("" + m.getGesamtPunkte());
            if (m.getRundenErgebnis() > 0 || m.hatGewonnen()) {
                g.getLblRundengebnis().setBackground(Color.GREEN);
                g.getLblGesamtpunkte().setBackground(Color.GREEN);
            } else if (m.getRundenErgebnis() < 0 || m.hatVerloren()) {
                g.getLblRundengebnis().setBackground(Color.RED);
                g.getLblGesamtpunkte().setBackground(Color.RED);
            } else {
                g.getLblRundengebnis().setBackground(Color.WHITE);
                g.getLblGesamtpunkte().setBackground(Color.WHITE);
            }
            if(m.hatGewonnen()){
                g.getLblRundengebnis().setText("Gewonnen");
            }else if(m.hatVerloren()){
                g.getLblRundengebnis().setText("Verloren");
            }
        } else if (e.getActionCommand().equals("NochEinmal")) {
            g.getLblRundengebnis().setText("Gib eine Zahl von 1 bis 9");
            g.getTxtComputerZahl().setText("");
            g.getTxtEingabe().setText("");
            g.getTxtEingabe().setBackground(Color.WHITE);
            g.getLblGesamtpunkte().setBackground(Color.WHITE);
        }
    }
    public static void main(String[] args) {
        new GewinnController();
    }
}