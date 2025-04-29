package view.panels;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class urnaElectoralPanel {

    private final JPanel panel;
    private final Map<String, JButton> buttons;

    public urnaElectoralPanel(){

        panel = new JPanel();
        buttons = new HashMap<>();

    }

    public JPanel getPanel(){
        return panel;
    }

    public void addButton(String name) {
        JButton button = new JButton(name);
        buttons.put(name, button);
        panel.add(button);
    }

}