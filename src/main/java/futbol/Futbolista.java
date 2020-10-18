package futbol;
public abstract class Futbolista<T> implements Comparable<T> {
	private String nombre;
	private int edad;
	private final String posicion;
	public abstract boolean jugarConLasManos();
	public Futbolista() {
		this("Maradona",30,"delantero");
	}
	public Futbolista(String nombre, int edad, String posicion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}


	
	public boolean equals(Futbolista<T> f) {
		int x=0;
		x+=this.nombre.compareTo(f.nombre);
		x+=this.posicion.compareTo(f.posicion);
		x+=Integer.compare(edad, f.edad);
		if (x==0) {return true;}else {return false;}
	}
	
	public String toString() {
		return "El futbolista "+nombre+" tiene "+edad+", y juega de "+posicion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPosicion() {
		return posicion;
	}

	

}
