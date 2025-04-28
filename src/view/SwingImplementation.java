package view;
import view.panels.StartButtonPanel;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class SwingImplementation {

    private CardLayout cardLayout;
    private JPanel cardPanel;

    public SwingImplementation() {

        JFrame startFrame = new JFrame("Votación Presidencial");
        startFrame.setSize(500, 500);
        startFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Terminar proceso una vez que se cierra el programa

        // Inicializar primera pantalla
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        JPanel startPanel = new JPanel(new BorderLayout(10, 10));

        JLabel startTitle = new JLabel("Votación Presidencial");
        startTitle.setHorizontalAlignment(SwingConstants.CENTER);

        startPanel.add(startTitle, BorderLayout.NORTH);
        startPanel.add(getStartButtonPanel().getPanel(), BorderLayout.CENTER);

        JPanel urnaElectoralPanel = new JPanel();

        startFrame.add(cardPanel);
        startFrame.setVisible(true);

        // Funciones de botones
        JButton urnaElectoralButton = getStartButtonPanel().getButton("UrnaElectoral");
        urnaElectoralButton.addActionListener(e -> {

        });
    }

    private static StartButtonPanel getStartButtonPanel() {

        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 10)); // Panel utilizado para organizar automaticamente posicion de botones
        Map<String, JButton> buttons = new HashMap<>();

        JButton urnaElectoralButton = new JButton("Ingresar urna electoral");
        JButton votanteButton = new JButton("Ingresar votante");
        JButton votoButton = new JButton("Ingresar voto");
        JButton candidatoButton = new JButton("Ingresar candidato");
        JButton verDatosIngresadosButton = new JButton("Ver datos ingresados");

        buttons.put("UrnaElectoral", urnaElectoralButton);
        buttons.put("Votante", votanteButton);
        buttons.put("Voto", votoButton);
        buttons.put("Candidato", candidatoButton);
        buttons.put("VerDatosIngresados", verDatosIngresadosButton);

        buttonPanel.add(urnaElectoralButton);
        buttonPanel.add(votanteButton);
        buttonPanel.add(votoButton);
        buttonPanel.add(candidatoButton);
        buttonPanel.add(verDatosIngresadosButton);

        return new StartButtonPanel(buttonPanel, buttons);
    }

}
