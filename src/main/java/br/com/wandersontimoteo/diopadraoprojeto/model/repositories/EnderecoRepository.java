package br.com.wandersontimoteo.diopadraoprojeto.model.repositories;

import br.com.wandersontimoteo.diopadraoprojeto.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
