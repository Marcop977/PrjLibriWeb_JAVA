package repos;

import java.util.List;

import model.Libro;

public interface LibroDAO {

	String FIND_ALL = "SELECT * FROM libri3";
	String FIND_BY_ID = "SELECT * FROM libri3 WHERE id = ?";
	String ADD = "INSERT INTO libri3 (titolo, pagine, prezzo) VALUES (?, ?, ?)";
	String UPDATE = "UPDATE libri3 SET titolo = ?, pagine = ?, prezzo = ? WHERE id = ?";
	String DELETE_BY_ID = "DELETE FROM libri3 WHERE id = ?";
	
	List<Libro> findAll();
	Libro findById(int id);
	void addLibro(Libro l);
	void updateLibro(Libro l);
	void deleteLibro(int id);
	
}
