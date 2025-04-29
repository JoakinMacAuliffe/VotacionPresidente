package view.screens;

import javax.swing.*;
import java.awt.*;

public class candidatoScreen {

    private final JPanel panel;

    public candidatoScreen(JPanel parentPanel, CardLayout cardLayout) {
        panel = new JPanel();

    }

    public JPanel getPanel() {
        return panel;
    }

    public JButton addButton(String name){
        return new JButton(name);
    }

}
