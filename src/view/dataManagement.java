package view;

import model.*;

import javax.swing.*;

public class dataManagement {

    private final JList<Candidato> listaCandidatosJList = new JList<>();
    private final JList<UrnaElectoral> urnaElectoralJList = new JList<>();
    private final JList<Voto> votoJList = new JList<>();
    private final JList<Votante> votanteJList = new JList<>();

    public JList<Candidato> getListaCandidatosJList() {
        return listaCandidatosJList;
    }

    public JList<UrnaElectoral> getUrnaElectoralJList() {
        return urnaElectoralJList;
    }

    public JList<Voto> getVotoJList() {
        return votoJList;
    }

    public JList<Votante> getVotanteJList() {
        return votanteJList;
    }
}
