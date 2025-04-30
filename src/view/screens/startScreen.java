package view.screens;

import view.panels.StartButtonPanel;
import javax.swing.*;
import java.awt.*;

public class startScreen {

    private final CardLayout cardLayout;
    private final JPanel cardPanel;

    public startScreen() {

        JFrame startFrame = new JFrame("Votación Presidencial");
        startFrame.setSize(500, 500);
        startFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Terminar proceso una vez que se cierra el programa

        // Inicializar primera pantalla
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Instanciar panel de inicio
        StartButtonPanel startButtonPanel = new StartButtonPanel();
        JPanel startPanel = new JPanel(new BorderLayout(10, 10));
        JLabel startTitle = new JLabel("Votación Presidencial", SwingConstants.CENTER);
        startPanel.add(startTitle, BorderLayout.NORTH);
        startPanel.add(startButtonPanel.getPanel(), BorderLayout.CENTER);

        // Instanciar paneles
        urnaElectoralScreen urnaElectoralScreen = new urnaElectoralScreen(cardPanel, cardLayout);
        votanteScreen votanteScreen = new votanteScreen(cardPanel, cardLayout);
        votoScreen votoScreen = new votoScreen(cardPanel, cardLayout);
        listaCandidatosScreen listaCandidatosScreen = new listaCandidatosScreen(cardPanel, cardLayout);
        datosIngresadosScreen datosIngresadosScreen = new datosIngresadosScreen(cardPanel, cardLayout);

        // Indicar pantallas
        cardPanel.add(startPanel, "startScreen");
        cardPanel.add(urnaElectoralScreen.getPanel(), "urnaElectoralScreen");
        cardPanel.add(votanteScreen.getPanel(), "votanteScreen");
        cardPanel.add(votoScreen.getPanel(), "votoScreen");
        cardPanel.add(listaCandidatosScreen.getPanel(), "listaCandidatosScreen");
        cardPanel.add(datosIngresadosScreen.getPanel(), "datosIngresadosScreen");

        // Agregar el panel principal al frame de inicio
        startFrame.add(cardPanel);
        startFrame.setVisible(true);

        // Crear botones
        JButton urnaElectoralButton = startButtonPanel.getButton("Insertar urna electoral");
        JButton votanteButton = startButtonPanel.getButton("Ingresar votante");
        JButton votoButton = startButtonPanel.getButton("Ingresar voto");
        JButton listaCandidatosButton = startButtonPanel.getButton("Ingresar lista de candidatos");
        JButton datosIngresadosButton = startButtonPanel.getButton("Ver datos ingresados");

        // Acciones de botones
        urnaElectoralButton.addActionListener(e -> {
            cardLayout.show(cardPanel, "urnaElectoralScreen");
        });
        votanteButton.addActionListener(e -> {
            cardLayout.show(cardPanel, "votanteScreen");
        });
        votoButton.addActionListener(e -> {
            cardLayout.show(cardPanel, "votoScreen");
        });
        listaCandidatosButton.addActionListener(e -> {
            cardLayout.show(cardPanel, "listaCandidatosScreen");
        });
        datosIngresadosButton.addActionListener(e -> {
            cardLayout.show(cardPanel, "datosIngresadosScreen");
        });

    }

}
