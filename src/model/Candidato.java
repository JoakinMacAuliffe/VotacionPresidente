package model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
	
public class Candidato {

	private int id = 0;
	private String nombre, partido;
	private Queue<Voto> votosRecibidos = new LinkedList<>();

	public Candidato(String nombre, String partido){
		this.nombre = nombre;
		this.partido = partido;
	}
	public void anadeVoto(Voto v) {
		votosRecibidos.add(v);
	}
	int getID(){
		return id;
	}
	public String getNombre(){
		return nombre;
	}
	public String getPartido(){
		return partido;
	}
	public int getVotos(){
		return votosRecibidos.size();
	}

	Voto retirarVoto(int idVoto){
		// Metodo que retira un voto y lo retorna.
		// Iterador para recorrer el queue votosRecibidos
		Iterator<Voto> iterator = votosRecibidos.iterator();
		while(iterator.hasNext()){
			Voto current = iterator.next();
			// Verificar que la ID del voto solicitado coincida con la del voto a eliminar
			if(current.getId() == idVoto){
				iterator.remove();
				return current;
			}
		}
		// Retorna null si no se encuentra un voto cuya id coincida con idVoto.
        return null;
    }

	void setID(int id){ // Usado para que las IDs se asignen automaticamente
		this.id = id;
	}
}
