package Api_Fer;

import java.util.List;
import java.util.Map;
import org.springframework.http.ResponseEntity;

public interface ICategoriaService {
	List<Categoria> consultarTodasCategorias();  
	ResponseEntity<Categoria> consultarUno(int idCat);
	ResponseEntity<Map<String, String>> actualizarCategoria(Categoria obj,int idCat);
	ResponseEntity<Map<String, String>> insertarCategoria(Categoria obj);	
	ResponseEntity<?> eliminarCategoria(int idCat);
	ResponseEntity<Categoria> consultarbyNombre(String nombre);  
	List<Categoria> consultarPorNivel(int niv);
	
}
