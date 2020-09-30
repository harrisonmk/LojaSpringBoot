package com.projeto.LojaSpringBoot.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaControle {

    @GetMapping
    public String Listar() {

        return "Rest esta funcionando";

    }

}
