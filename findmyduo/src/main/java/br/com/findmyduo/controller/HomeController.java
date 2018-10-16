package br.com.findmyduo.controller;

import br.com.findmyduo.entidade.Estacao;
import br.com.findmyduo.entidade.Linha;
import br.com.findmyduo.entidade.TipoLinhaEnum;
import br.com.findmyduo.repository.EstacaoRepository;
import br.com.findmyduo.repository.LinhaRepository;
import javassist.compiler.ast.ASTList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.Contended;
import sun.plugin.javascript.navig.LinkArray;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 19/09/2018.
 */
@Controller
public class HomeController {

    @Autowired
    private LinhaRepository repository;

    @Autowired
    private EstacaoRepository estacaoRepository;


    @RequestMapping("/")
    public String init(Model model){
        //Iterable<Linha> linhas = repository.findAll();
        //model.addAttribute("linhas",linhas);

        Estacao estacao1 = new Estacao();
        estacao1.setNome("Republica");

        Estacao estacao2 = new Estacao();
        estacao2.setNome("Sé");

        Linha linha = new Linha();
        linha.setNome("VERMELHA");
        linha.setTipoLinhaEnum(TipoLinhaEnum.METRO);

        linha.setEstacoes(Arrays.asList(estacao1,estacao2));


        estacaoRepository.save(estacao1);
        estacaoRepository.save(estacao2);
        repository.save(linha);

        List<Linha> linhas = (List<Linha>) repository.findAll();

        for (Linha linha1 : linhas) {
            for (Estacao estacao : linha.getEstacoes()) {
                System.out.println(linha.getNome()+" - "+estacao.getNome());
            }
        }

        return "index";
    }

}
