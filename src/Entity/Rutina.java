package Entity;

public class Rutina {

	//Atributos de la claser Rutina
	private int id;
	private String nombre;
	private int duracion;
	private String nivelDeDificultad;
	private String descripcion;

	//Constructores de la clase Rutina

	public Rutina() {
	}
	public
	Rutina(int id, String nombre, int duracion, String nivelDeDificultad, String descripcion) {
		this.id                = id;
		this.nombre            = nombre;
		this.duracion          = duracion;
		this.nivelDeDificultad = nivelDeDificultad;
		this.descripcion       = descripcion;
	}


	//Getters y Setters de la clase Rutina
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getNivelDeDificultad() {
		return nivelDeDificultad;
	}
	public void setNivelDeDificultad(String nivelDeDificultad) {
		this.nivelDeDificultad = nivelDeDificultad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Rutina{" +
				 "id=" + id +
				 ", nombre='" + nombre + '\'' +
				 ", duracion=" + duracion +
				 ", nivelDeDificultad='" + nivelDeDificultad + '\'' +
				 ", descripcion='" + descripcion + '\'' +
				 '}';
	}


}
