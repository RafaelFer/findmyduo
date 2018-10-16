package br.com.findmyduo.controller;

import br.com.findmyduo.entidade.Linha;
import br.com.findmyduo.repository.LinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.Contended;

/**
 * Created by user on 19/09/2018.
 */
@Controller
public class HomeController {

    @Autowired
    private LinhaRepository repository;

    @RequestMapping("/")
    public String init(Model model){
        Iterable<Linha> linhas = repository.findAll();
        model.addAttribute("linhas",linhas);
        return "index";
    }

}
