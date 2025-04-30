package view;

import model.*;

import java.util.HashMap;
import java.util.Map;

public class dataManagement {

    private final Map<String, Candidato> listaCandidatosMap = new HashMap<>();
    private final Map<String, UrnaElectoral> urnaElectoralMap = new HashMap<>();
    private final Map<String, Voto> votoMap = new HashMap<>();
    private final Map<String, Votante> votanteMap = new HashMap<>();

    public Map<String, Candidato> getListaCandidatosMap() {
        listaCandidatosMap.put("Lista 1", new Candidato("Jorge", "PC"));
        return listaCandidatosMap;
    }

    public Map<String, UrnaElectoral> getUrnaElectoralMap() {
        return urnaElectoralMap;
    }

    public Map<String, Voto> getVotoMap() {
        return votoMap;
    }

    public Map<String, Votante> getVotanteMap() {
        return votanteMap;
    }
}
