package br.com.findmyduo.controller;

import br.com.findmyduo.entidade.Linha;
import br.com.findmyduo.entidade.TipoLinhaEnum;
import br.com.findmyduo.repository.LinhaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 12/11/2018.
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value="API REST Estacoes")
public class EstacoesRestController {

    @Autowired
    private LinhaRepository repository;

    @ApiOperation(value="Retorna uma lista de Produtos")
    @RequestMapping("/linhas")
    @ResponseBody
    public List<Linha> init(Model model) {

        List<Linha> linhas = (List<Linha>) repository.findAll();

        return linhas;
    }

    @ApiOperation(value="Retorna uma lista de Produtos")
    @RequestMapping("/linha")
    @ResponseBody
    public List<Linha> linhas() {

        Linha l = new Linha();
        l.setNome("Perreco");
        l.setId(1L);
        l.setTipoLinhaEnum(TipoLinhaEnum.getDocumentByCode(1L));

        Linha linha2 = new Linha();
        linha2.setNome("Perreco2");
        linha2.setId(2L);
        linha2.setTipoLinhaEnum(TipoLinhaEnum.getDocumentByCode(2L));

        List<Linha> linhas = new ArrayList<>();
        linhas.add(l);
        linhas.add(linha2);

        return linhas;
    }
}
