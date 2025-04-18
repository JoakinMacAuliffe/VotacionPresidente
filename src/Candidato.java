import java.util.LinkedList;
import java.util.Queue;
	
public class Candidato {

	private int id = 0;
	private String nombre, partido;
	private Queue<Voto> votosRecibidos = new LinkedList<>();

	public Candidato(int id, String nombre, String partido){
		this.id = id;
		this.nombre = nombre;
		this.partido = partido;
	}

	public void añadeVoto(Voto v) {
		votosRecibidos.add(v);
	}

}
