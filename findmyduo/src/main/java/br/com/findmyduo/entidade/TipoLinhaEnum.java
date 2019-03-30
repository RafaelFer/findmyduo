package br.com.findmyduo.entidade;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Created by user on 16/10/2018.
 */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum TipoLinhaEnum {
    TREM(1L,"Linha de Trem"),
    METRO(2L, "Linha de Metro");

    private Long codigo;
    private String descricao;

    TipoLinhaEnum(Long codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoLinhaEnum getEnum(Long codigo){
        for (TipoLinhaEnum tipoLinhaEnum : TipoLinhaEnum.values()) {
            if(tipoLinhaEnum.getCodigo() == codigo){
                return tipoLinhaEnum;
            }
        }
        return null;
    }

    public static final TipoLinhaEnum getDocumentByCode(Long code) {
        TipoLinhaEnum type = null;
        for (TipoLinhaEnum tipo : TipoLinhaEnum.values()) {
            if (tipo.getCodigo() == code) {
                type = tipo;
                break;
            }
        }
        return type;
    }

}
