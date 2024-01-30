package com.microsservico.projectdemo1.Service;

import com.microsservico.projectdemo1.DTO.Produto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ProdutoService {

    public List<Produto> GetAllProdutos(){
        return Stream.of(new Produto(1, "Iphone", 21, 1000),
                new Produto(2, "Iphone", 41, 550)
        ).collect(Collectors.toList());
    }
}

