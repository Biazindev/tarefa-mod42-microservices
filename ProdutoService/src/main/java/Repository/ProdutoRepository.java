package Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.tbiazin.ProdutoService.Entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	Object findById(Long id);

	List<Produto> findAll();
}
