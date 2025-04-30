package view.screens;

import javax.swing.*;
import java.awt.*;
import view.panels.urnaElectoralPanel;

public class urnaElectoralScreen {

    private final JPanel panel;

    public urnaElectoralScreen(JPanel parentPanel, CardLayout cardLayout) {

        panel = new urnaElectoralPanel(parentPanel, cardLayout).getPanel();

    }

    public JPanel getPanel() {
        return panel;
    }

}
