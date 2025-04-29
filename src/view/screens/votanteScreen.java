package view.screens;

import javax.swing.*;
import java.awt.*;

public class votanteScreen {

    private final JPanel panel;

    public votanteScreen(JPanel parentPanel, CardLayout cardLayout) {
        panel = new JPanel();
        panel.add(new JLabel("test"));
        JButton button1 = addButton("test");
        panel.add(button1);

        button1.addActionListener(e -> {
            cardLayout.show(parentPanel, "startScreen");
        });

    }

    public JPanel getPanel() {
        return panel;
    }

    public JButton addButton(String name){
        return new JButton(name);
    }

}
