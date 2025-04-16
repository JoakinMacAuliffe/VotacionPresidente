import java.util.*;
import java.time.LocalTime;

public class UrnaElectoral {

    LinkedList<Candidato> listaCandidatos = new LinkedList<>();
    Stack<Voto> historialVotos = new Stack<>();
    Queue<Voto> votosReportados = new LinkedList<>();
    int idCounter = 0;

    public UrnaElectoral(LinkedList<Candidato> listaCandidatos){

        this.listaCandidatos = listaCandidatos;

    }

    void agregarCandidato(Candidato candidato){
        listaCandidatos.add(candidato);
    }

    boolean verificarVotante(Votante votanteID){ //Verifica si el votante ya ha votado
        return votanteID.yaVoto;
    }

    void registrarVoto(Votante votanteID, int candidatoID) {

        LocalTime time = LocalTime.now();
        int[] timestamp = {time.getHour(), time.getMinute(), time.getSecond()};
        Voto voto = new Voto(idCounter, votanteID.id, candidatoID, timestamp);

        if (!votanteID.yaVoto) {
            idCounter++;
            historialVotos.push(voto);
            votanteID.yaVoto = true;



            //Falta agregar el voto al candidato
        }
    }

    void obtenerResultados(){

        Map<Candidato, Integer> map = new HashMap<>();

        for(int i = 0; i < listaCandidatos.size(); i++){
            Candidato candidato = listaCandidatos.get(i);
            map.put(candidato, candidato.)
        }

    }

}


