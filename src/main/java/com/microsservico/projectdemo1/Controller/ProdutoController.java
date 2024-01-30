package com.microsservico.projectdemo1.Controller;

import com.microsservico.projectdemo1.DTO.Produto;
import com.microsservico.projectdemo1.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.Feature;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.util.NamedFeature;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    private FeatureManager manager;

    private static final Feature CONTA_PRODUTOS = new NamedFeature("CONTA_PRODUTOS");

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/lista")
    private List<Produto> MostraIphone(){
        if(manager.isActive(CONTA_PRODUTOS)){
            return produtosAcimaQuantidadeMinima(produtoService.GetAllProdutos());
        } else {
            return produtoService.GetAllProdutos();
        }
    }

    private List<Produto> produtosAcimaQuantidadeMinima(List<Produto> produtos) {
        List<Produto> ListaProdutosAcimaQuantidadeMinima = new ArrayList<>();
        produtoService.GetAllProdutos().forEach(lista -> {
            if(lista.getAmount() > 30){
                ListaProdutosAcimaQuantidadeMinima.add(lista);
            }
        });
        return ListaProdutosAcimaQuantidadeMinima;
    }

}
