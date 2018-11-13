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
import org.springframework.web.bind.annotation.ResponseBody;
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
    public String init(Model model) {

        List<Estacao> estacoes = (List<Estacao>) estacaoRepository.findAll();
        List<Linha> linhas = (List<Linha>) repository.findAll();

        model.addAttribute("linhas", linhas);
        model.addAttribute("estacoes", estacoes);

        return "index";
    }



}
