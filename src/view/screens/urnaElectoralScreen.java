package view.screens;

import javax.swing.*;
import java.awt.*;
import view.panels.urnaElectoralPanel;

public class urnaElectoralScreen {

    private final JPanel panel;

    public urnaElectoralScreen(JPanel parentPanel, CardLayout cardLayout) {

        panel = new urnaElectoralPanel().getPanel();

//        button1.addActionListener(e -> {
//            cardLayout.show(parentPanel, "startScreen");
//        });

    }

    public JPanel getPanel() {
        return panel;
    }

    public JButton addButton(String name){
        return new JButton(name);
    }

}
