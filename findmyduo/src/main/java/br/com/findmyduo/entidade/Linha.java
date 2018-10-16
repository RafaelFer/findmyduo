package br.com.findmyduo.entidade;

import javax.persistence.*;
import java.util.List;

/**
 * Created by user on 15/10/2018.
 */
@Entity(name = "linha")
public class Linha {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    @Enumerated(EnumType.STRING)
    private TipoLinhaEnum tipoLinhaEnum;

    @ManyToMany
    List<Estacao> estacoes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoLinhaEnum getTipoLinhaEnum() {
        return tipoLinhaEnum;
    }

    public void setTipoLinhaEnum(TipoLinhaEnum tipoLinhaEnum) {
        this.tipoLinhaEnum = tipoLinhaEnum;
    }

    public List<Estacao> getEstacoes() {
        return estacoes;
    }

    public void setEstacoes(List<Estacao> estacoes) {
        this.estacoes = estacoes;
    }
}
