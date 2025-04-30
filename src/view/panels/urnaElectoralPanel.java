package view.panels;

import model.Candidato;
import view.dataManagement;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class urnaElectoralPanel {

    private final JPanel panel = new JPanel();
    private final Map<String, JButton> buttons = new HashMap<>();

    public urnaElectoralPanel(JPanel parentPanel, CardLayout cardLayout) {

        // Asignar el layout del panel a BoxLayout
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Crear título
        JLabel urnaElectoralTitle = new JLabel("Urna Electoral", SwingConstants.CENTER);
        urnaElectoralTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(urnaElectoralTitle);
        panel.add(Box.createVerticalStrut(20));

        // Crear cuadros de texto para ingresar parametros
        JComboBox<String> candidatoList = new JComboBox<>();

        candidatoList.addItem("Seleccione lista de candidatos");

        Map<String, Candidato> listaCandidatosMap = new dataManagement().getListaCandidatosMap();

        for (Map.Entry<String, Candidato> entry : listaCandidatosMap.entrySet()) {
            candidatoList.addItem(entry.getKey());
        }

        candidatoList.setMaximumSize(new Dimension(450, 30));
        panel.add(candidatoList);
        panel.add(Box.createVerticalStrut(5));

        // Crear botones
        JButton crearUrnaElectoralButton = addButton("Crear urna electoral");
        JButton volverAlMenuButton = addButton("Volver al menú");

        // Centrar botones
        crearUrnaElectoralButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        volverAlMenuButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Funcion del boton crearUrnaElectoral
        crearUrnaElectoralButton.addActionListener(e -> {

        });

        // Funcion del botón volverAlMenú
        volverAlMenuButton.addActionListener(e -> {
            cardLayout.show(parentPanel, "startScreen");
        });
    }

    private JButton addButton(String name) {
        JButton button = new JButton(name);
        buttons.put(name, button);
        panel.add(button);
        panel.add(Box.createVerticalStrut(5));
        return button;
    }

    public JPanel getPanel(){
        return panel;
    }

    public JButton getButton(String name) {
        return buttons.get(name);
    }

}