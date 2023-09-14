package br.com.wandersontimoteo.diopadraoprojeto.model.repositories;

import br.com.wandersontimoteo.diopadraoprojeto.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
