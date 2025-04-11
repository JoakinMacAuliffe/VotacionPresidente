import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.time.LocalTime;

public class UrnaElectoral {

    LinkedList<Candidato> listaCandidatos = new LinkedList<>();
    Stack<Voto> historialVotos = new Stack<>();
    Queue<Voto> votosReportados = new LinkedList<>();
    int idCounter = 0;

    public UrnaElectoral(LinkedList<Candidato> listaCandidatos){

        this.listaCandidatos = listaCandidatos;

    }

    boolean verificarVotante(Votante votanteID){ //Verifica si el votante ya ha votado
        return votanteID.yaVoto;
    }

    void registrarVoto(Votante votanteID, int candidatoID) {

        LocalTime time = LocalTime.now();
        int[] timestamp = {time.getHour(), time.getMinute(), time.getSecond()};
        Voto voto = new Voto(idCounter, votanteID.id, candidatoID, timestamp);

        if (votanteID.yaVoto == false) {
            idCounter++;
            historialVotos.push(voto);
            votanteID.yaVoto = true;
            //Falta agregar el voto al candidato
        }
    }
}


