package view.screens;

import javax.swing.*;
import java.awt.*;

public class datosIngresadosScreen {

    private final JPanel panel;

    public datosIngresadosScreen(JPanel parentPanel, CardLayout cardLayout) {
        panel = new JPanel();

    }

    public JPanel getPanel() {
        return panel;
    }

    public JButton addButton(String name){
        return new JButton(name);
    }

}
