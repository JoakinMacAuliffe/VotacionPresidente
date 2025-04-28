package GUI;
import Objects.*;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class SwingImplementation {



    public SwingImplementation() {

        JFrame startFrame = new JFrame("Votación Presidencial");
        startFrame.setSize(500, 500);
        startFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Terminar proceso una vez que se cierra el programa

        JPanel startPanel = new JPanel(new BorderLayout(10, 10));

        JLabel startTitle = new JLabel("Votación Presidencial");
        startTitle.setHorizontalAlignment(SwingConstants.CENTER);

        startPanel.add(startTitle, BorderLayout.NORTH);
        startPanel.add(getStartButtonPanel().getPanel(), BorderLayout.CENTER);

        startFrame.add(startPanel);
        startFrame.setVisible(true);

        // Funciones de botones
        JButton urnaElectoralButton = getStartButtonPanel().getButton("Objects.UrnaElectoral");
        urnaElectoralButton.addActionListener(e -> {

        });
    }

    private static ButtonPanelResult getStartButtonPanel() {

        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 10)); // Panel utilizado para organizar automaticamente posicion de botones
        Map<String, JButton> buttons = new HashMap<>();

        JButton urnaElectoralButton = new JButton("Ingresar urna electoral");
        JButton votanteButton = new JButton("Ingresar votante");
        JButton votoButton = new JButton("Ingresar voto");
        JButton candidatoButton = new JButton("Ingresar candidato");
        JButton verDatosIngresadosButton = new JButton("Ver datos ingresados");

        buttons.put("Objects.UrnaElectoral", urnaElectoralButton);
        buttons.put("Objects.Votante", votanteButton);
        buttons.put("Objects.Voto", votoButton);
        buttons.put("Objects.Candidato", candidatoButton);
        buttons.put("VerDatosIngresados", verDatosIngresadosButton);

        buttonPanel.add(urnaElectoralButton);
        buttonPanel.add(votanteButton);
        buttonPanel.add(votoButton);
        buttonPanel.add(candidatoButton);
        buttonPanel.add(verDatosIngresadosButton);

        return new ButtonPanelResult(buttonPanel, buttons);
    }

    private static class ButtonPanelResult {
        private final JPanel panel;
        private final Map<String, JButton> buttons;

        public ButtonPanelResult(JPanel panel, Map<String, JButton> buttons) {
            this.panel = panel;
            this.buttons = buttons;
        }

        public JPanel getPanel() {
            return panel;
        }

        public JButton getButton(String name) {
            return buttons.get(name);
        }

    }

}
