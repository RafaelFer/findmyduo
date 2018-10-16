package br.com.findmyduo.repository;

import br.com.findmyduo.entidade.Linha;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by user on 16/10/2018.
 */
public interface LinhaRepository extends CrudRepository<Linha, Long> {

    List<Linha> findByNome(String nome);
}
