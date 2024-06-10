package com.project.api.controllers;

import com.project.api.domain.ComponentPc;
import com.project.api.services.ComponentsPcService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/* Mostra para o Spring que a classe é um Controller */
@RestController
/* Endereço do Endpoint, sempre que houver uma requisição para /api/componentsPc ele irá
procurar dentro da classe o tratamento para essa requisição. */
@RequestMapping("/api/componentsPc")
public class ComponentsPcController {

    private ComponentsPcService service;

    public ComponentsPcController(ComponentsPcService service) {
        this.service = service;
    }
    /*
    @GetMapping("")
    public String getComponentsPc(){
        List<ComponentPc> componentsPc = this.service.getComponentsPcFromStock();
        System.out.println(componentsPc);
        return "oi";
    } */

    @GetMapping("")
    public ResponseEntity<List<ComponentPc>> getComponentsPc(){
        List<ComponentPc> componentsPc = this.service.getComponentsPcFromStock();
        System.out.println(componentsPc);
        return ResponseEntity.ok().body(componentsPc);
    }
}
