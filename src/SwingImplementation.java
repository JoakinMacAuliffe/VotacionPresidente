// Intento de implementar una gui usando la librería swing.
import java.io.*;
import javax.swing.*;

public class SwingImplementation {

    public SwingImplementation() {

        JFrame startFrame = new JFrame();
        JPanel startPanel = new JPanel();

        // Botones de la pantalla de inicio
        JButton urnaElectoralButton = new JButton();
        JButton votanteButton = new JButton();
        JButton votoButton = new JButton();
        JButton candidatoButton = new JButton();

        startFrame.setSize(400, 400);

        urnaElectoralButton.setBounds(100, 100, 30, 10);

        startFrame.add(urnaElectoralButton);
        startFrame.add(votanteButton);
        startFrame.add(votoButton);
        startFrame.add(candidatoButton);

        startFrame.setVisible(true);

    }
}
