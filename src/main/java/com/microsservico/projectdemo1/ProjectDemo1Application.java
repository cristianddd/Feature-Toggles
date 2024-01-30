package com.microsservico.projectdemo1;

import com.microsservico.projectdemo1.DTO.Produto;
import com.microsservico.projectdemo1.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.Feature;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.util.NamedFeature;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class ProjectDemo1Application {
	public static void main(String[] args) {SpringApplication.run(ProjectDemo1Application.class, args);}

}
