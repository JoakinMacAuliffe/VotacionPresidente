package view.screens;

import view.panels.listaCandidatosPanel;
import javax.swing.*;
import java.awt.*;

public class listaCandidatosScreen {

    private final JPanel panel;

    public listaCandidatosScreen(JPanel parentPanel, CardLayout cardLayout) {

        panel = new listaCandidatosPanel(parentPanel, cardLayout).getPanel();

    }

    public JPanel getPanel() {
        return panel;
    }

}
