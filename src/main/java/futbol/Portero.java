package futbol;
public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	public Portero() {
		// TODO Auto-generated constructor stub
	}

	public Portero(String nombre, int edad, String posicion,short golesRecibidos,byte dorsal) {
		super(nombre, edad, posicion);
		this.dorsal=dorsal;
		this.golesRecibidos=golesRecibidos;
	}

	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return true;
	}

	public int compareTo(Futbolista f) {
		
			Portero p=(Portero) f;
			return (int) this.golesRecibidos-p.golesRecibidos;
		
		
	}
	public String toString() {
		return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+", y juega de "+this.getPosicion()+" con el dorsal "+dorsal+" .Le han marcado "+golesRecibidos;
	}

	@Override
	public int compareTo(Object f) {
		Portero p=(Portero) f;
		return (int) this.golesRecibidos-p.golesRecibidos;
	}


}
