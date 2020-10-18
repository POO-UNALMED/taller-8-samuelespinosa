package futbol;
public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
	public Jugador() {
		golesMarcados=289;
		dorsal=7;
	}

	public Jugador(String nombre, int edad, String posicion,short golesMarcados,byte dorsal) {
		super(nombre, edad, posicion);
		this.dorsal=dorsal;
		this.golesMarcados=golesMarcados;
	}

	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	public String toString() {
		return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+", y juega de "+this.getPosicion()+" con el dorsal "+dorsal+". Ha marcado "+golesMarcados+" goles";
	}

	@Override
	public int compareTo(Object f) {
		Jugador f1=(Jugador) f; 
		return this.getEdad()-f1.getEdad();
	}
		
	

}
