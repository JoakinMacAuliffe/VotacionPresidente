package view.panels;
import javax.swing.*;
import java.util.Map;

public class StartButtonPanel {
    private final JPanel panel;
    private final Map<String, JButton> buttons;

    public StartButtonPanel(JPanel panel, Map<String, JButton> buttons) {
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
