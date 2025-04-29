package view.panels;
import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class StartButtonPanel {

    private final JPanel panel;
    private final Map<String, JButton> buttons;

    public StartButtonPanel() {

        panel = new JPanel();
        buttons = new HashMap<>();

        addButton("Insertar urna electoral");
        addButton("Ingresar votante");
        addButton("Ingresar voto");
        addButton("Ingresar candidato");
        addButton("Ver datos ingresados");

    }

    public void addButton(String name) {
        JButton button = new JButton(name);
        buttons.put(name, button);
        panel.add(button);
    }

    public JPanel getPanel() {
        return panel;
    }

    public JButton getButton(String name) {
        return buttons.get(name);
    }

}
