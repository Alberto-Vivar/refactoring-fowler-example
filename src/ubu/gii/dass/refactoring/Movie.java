package ubu.gii.dass.refactoring;
/**
 * Tema Refactorizaciones
 * 
 * Ejemplo de aplicaci�n de refactorizaciones. Actualizado para colecciones
 * gen�ricas de java 1.5
 * 
 * @author M. Fowler y <A HREF="mailto:clopezno@ubu.es">Carlos L�pez</A>
 * @version 1.1
 * @see java.io.File
 * 
 */

public class Movie {
	
	private MovieType movieType;


	private String _title;
	
	void setType(int type){
		movieType = MovieType.newType(type); 
	}
	
	MovieType getType(){
		return movieType;
	}

	public Movie(String title, int priceCode) {
		_title = title;
		setType(priceCode);
	}

	public String getTitle() {
		return _title;
	}
}
