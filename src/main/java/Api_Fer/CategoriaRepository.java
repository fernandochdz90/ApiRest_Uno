package Api_Fer;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>  {
	@Query ("select o from Categoria o where o.nombreCat like %?1")
	Categoria findByNombre(String nombre);
	
	@Query ("select x from Categoria x where x.nivel = ?1") //3
	List<Categoria> buscarXNivel(int niv); //3
}
