import java.util.*;
import java.time.LocalTime;

public class UrnaElectoral {

    Linkedlist listaCandidatos;
    Stack<Voto> historialVotos = new Stack<>();
    Queue<Voto> votosReportados = new LinkedList<>();
    int idCounter = 0;

    public UrnaElectoral(Linkedlist listaCandidatos){ //Constructor
        this.listaCandidatos = listaCandidatos;
    }

    boolean verificarVotante(Votante votanteID){ //Verifica si el votante ya ha votado
        return votanteID.yaVoto;
    }

    void registrarVoto(Votante votanteID, int candidatoID) {

        // Toma el tiempo actual para asignarlo a int[] timestamp
        LocalTime time = LocalTime.now();
        int[] timestamp = {time.getHour(), time.getMinute(), time.getSecond()};

        // Verifica si el votante ya ha votado
        if (!verificarVotante(votanteID)) {

            //Recorrer linkedlist y buscar al candidato
            Linkedlist.Node current = listaCandidatos.head;
            boolean candidatoEncontrado = false; // Usado para verificar si el candidato existe o no

            while(current != null){
                if(current.value.getID() == candidatoID){ // Si es que se cumple esta condición, el candidato existe
                    candidatoEncontrado = true;
                    // Instancia un voto para asignarlo al votante
                    Voto voto = new Voto(votanteID.id, candidatoID, timestamp);

                    // Asigna ID al voto y lo considera en el idCounter
                    voto.setId(idCounter+1);
                    idCounter++;

                    // Añade el voto al stack historialVotos
                    historialVotos.push(voto);

                    //Asigna el atributo yaVoto del votante a true, de tal manera que no pueda volver a votar
                    votanteID.marcarComoVotado();

                    // Si se encuentra al candidato, se añade el voto a su respectivo queue.
                    current.value.anadeVoto(voto);
                    System.out.println("Voto añadido al candidato " + current.value.getNombre() +
                            " (ID " + current.value.getID() + ") correctamente. " +
                            "ID: " + voto.getId());
                    break;
                }
                current = current.next;
            }
            if(!candidatoEncontrado){ // En caso de que el candidato con la id candidatoID no exista
                System.out.println("Error: Candidato con ID " + candidatoID + " no encontrado.");
            }
        }else{
            System.out.println("Error: El votante ya ha votado previamente.");
        }
    }

    // La funcion reportar voto retira un voto de un candidato y lo añade al queue votosReportados
    void reportarVoto(Candidato candidatoID, int idVoto){
        // Instancia un voto y lo asigna al voto que se va a retirar
        Voto votoARetirar = candidatoID.retirarVoto(idVoto);
        if(votoARetirar == null){ // La función retirarVoto() retorna null si no se encuentra el voto (ver clase Candidato).
            System.out.println("Error: Voto no encontrado.");
        }else {
            // Añade el voto al queue votosReportados
            votosReportados.add(votoARetirar);
            System.out.println("El voto de ID " + idVoto + " para el candidato " + candidatoID.getNombre() +
                    " (ID " + candidatoID.getID() + ") ha sido reportado");

        }
    }

    void obtenerResultados(){
    Map<Candidato, Integer> map = new HashMap<>();
        // Recorre el linkedlist y por cada nodo con un candidato, lo añade junto a sus votos en un map
        // siendo el key un objeto de tipo Candidato y el value su cantidad de votos.
        Linkedlist.Node current = listaCandidatos.head;
        while(current != null){
            map.put(current.value, current.value.getVotos());
            current = current.next;
        }
        System.out.println("-----------------------------------------------");
        // Para recorrer un map, se hace uso de un iterador, al cual se le asigna como tipo de dato un entry
        // del map. Después, para crear el iterador se hace uso de un "entrySet" del mapa, el cual crea una lista
        // de objetos de tipo entry. Para recorrer el mapa, el iterador recorrerá dicha lista.
        Iterator<Map.Entry<Candidato, Integer>> iterator = map.entrySet().iterator();
        // hasNext() y next() son métodos de un entry
        while(iterator.hasNext()){
            Map.Entry<Candidato, Integer> entry = iterator.next();
            // Instancia un entry para poder acceder a sus atributos (en el caso de un map, el key y el value)
            String nombre = entry.getKey().getNombre();
            int ID = entry.getKey().getID();
            String partido = entry.getKey().getPartido();
            int votos = entry.getValue();

            System.out.println("Candidato " + nombre + " (ID: " + ID + ") (Partido: " + partido + ")");
            System.out.println(votos + " votos");
        }
        System.out.println("-----------------------------------------------");

    }

}


