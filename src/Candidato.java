import java.util.LinkedList
import java.util.Queue
	
public class Candidato{
	    
	   private int id = 0;
	   private String nombre, partido;
	   private Queue <Integer> colaVotos = new LinkedList <>();
	   
	   public int añadeVoto(Voto v){
	       
	       colaVotos.push(v);
	   }
