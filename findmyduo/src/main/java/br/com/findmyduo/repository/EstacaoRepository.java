package br.com.findmyduo.repository;

import br.com.findmyduo.entidade.Estacao;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by user on 16/10/2018.
 */
public interface EstacaoRepository extends CrudRepository<Estacao, Long> {

    List<Estacao> findByNome(String nome);
}
