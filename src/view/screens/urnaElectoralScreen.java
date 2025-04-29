package view.screens;

import view.startScreen;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class urnaElectoralScreen {

    private final JPanel panel;

    public urnaElectoralScreen() {
        panel = new JPanel();
        panel.add(new JLabel("test"));
        JButton button1 = addButton("test");
        panel.add(button1);

        button1.addActionListener(e -> {
            panel.setBackground(Color.blue);
        });

    }

    public JPanel getPanel() {
        return panel;
    }

    public JButton addButton(String name){
        return new JButton(name);
    }

}
