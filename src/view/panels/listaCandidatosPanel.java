package view.panels;

import model.Linkedlist;

import javax.swing.*;
import java.awt.*;
import java.awt.event.TextEvent;
import java.util.HashMap;
import java.util.Map;

public class listaCandidatosPanel {

    private final JPanel panel = new JPanel();
    private final Map<String, JButton> buttons = new HashMap<>();

    public listaCandidatosPanel(JPanel parentPanel, CardLayout cardLayout) {

        // Setear layout del panel
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Crear título
        JLabel listaCandidatosTitle = new JLabel("Listas de Candidatos", SwingConstants.CENTER);
        listaCandidatosTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(listaCandidatosTitle);
        panel.add(Box.createVerticalStrut(20));

        // Crear botones
        JButton crearNuevaLista = addButton("Crear nueva lista");
        JButton volverAlMenuButton = addButton("Volver al menú");

        // Centrar botones
        crearNuevaLista.setAlignmentX(Box.CENTER_ALIGNMENT);
        volverAlMenuButton.setAlignmentX(Box.CENTER_ALIGNMENT);

        // Función del botón volverAlMenu
        volverAlMenuButton.addActionListener(e -> {
            cardLayout.show(parentPanel, "startScreen");
        });

        // Función del botón crearNuevaLista
        crearNuevaLista.addActionListener(e -> {
            Linkedlist listaCandidatos = new Linkedlist();
        });


    }

    private JButton addButton(String name) {
        JButton button = new JButton(name);
        buttons.put(name, button);
        panel.add(button);
        panel.add(Box.createVerticalStrut(5));
        return button;
    }

    public JPanel getPanel() {
        return panel;
    }

    public JButton getButton(String name) {
        return buttons.get(name);
    }

}
