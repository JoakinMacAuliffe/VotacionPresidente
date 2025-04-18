import java.util.*;
import java.time.LocalTime;

public class UrnaElectoral {

    Linkedlist listaCandidatos = new Linkedlist();
    Stack<Voto> historialVotos = new Stack<>();
    Queue<Voto> votosReportados = new LinkedList<>() {
    };
    int idCounter = 0;

    public UrnaElectoral(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese cantidad de candidatos: ");
        int cantidad = scanner.nextInt();

        for(int i = 0; i < cantidad; i++){

            System.out.print("Ingrese nombre del candidato " + i + ": ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese partido del candidato " + i + ": ");
            String partido = scanner.nextLine();

            Candidato candidato = new Candidato(i+1, nombre, partido);

            listaCandidatos.insert(candidato);
        }

    }

    void agregarCandidato(Candidato candidato){
        listaCandidatos.insert(candidato);
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

            //Recorrer linked list

            //Falta agregar el voto al candidato
        }
    }

    void obtenerResultados(){

        Map<Candidato, Integer> map = new HashMap<>();

        for(int i = 0; i < listaCandidatos.getSize(); i++){
            Candidato candidato = listaCandidatos.get(i);
            map.put(candidato, candidato.)

        }

    }

}


