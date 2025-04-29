package view;

import view.screens.urnaElectoralScreen;
import view.panels.StartButtonPanel;
import javax.swing.*;
import java.awt.*;

public class startScreen {

    private CardLayout cardLayout;
    private JPanel cardPanel;
    private JPanel startPanel;

    public startScreen() {

        JFrame startFrame = new JFrame("Votación Presidencial");
        startFrame.setSize(500, 500);
        startFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Terminar proceso una vez que se cierra el programa

        // Inicializar primera pantalla
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Instanciar panel de inicio
        StartButtonPanel startButtonPanel = new StartButtonPanel();

        // Instanciar pantalla de entrada
        JPanel startPanel = new JPanel(new BorderLayout(10, 10));
        JLabel startTitle = new JLabel("Votación Presidencial", SwingConstants.CENTER);
        startPanel.add(startTitle, BorderLayout.NORTH);
        startPanel.add(startButtonPanel.getPanel(), BorderLayout.CENTER);

        urnaElectoralScreen urnaElectoralScreen = new urnaElectoralScreen();

        cardPanel.add(startPanel, "StartScreen");
        cardPanel.add(urnaElectoralScreen.getPanel(), "urnaElectoralScreen");

        startFrame.add(cardPanel);
        startFrame.setVisible(true);

        JButton urnaElectoralButton = startButtonPanel.getButton("Insertar urna electoral");

        urnaElectoralButton.addActionListener(e -> {
            cardLayout.show(cardPanel, "urnaElectoralScreen");
        });

    }

}
