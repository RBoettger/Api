package com.project.api.services;

import com.project.api.domain.ComponentPc;
import com.project.api.feign.ComponentPcClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponentsPcService {

    /* ComponentsPcService depende do ComponentPcClient para puxar as informações do json para o service */
    private final ComponentPcClient componentPcClient;

    /* Construtor da classe recebendo como parametro a classe ComponentPcClient */
    public ComponentsPcService(ComponentPcClient client){
        this.componentPcClient = client;
    }

    /* Metodo com o nome getComponentsPcFromStock que retorna uma lista com os componentes de pc do JSON */
    public List<ComponentPc> getComponentsPcFromStock(){
        /* aqui eu chamo o atributo componentPcClient para acessar o metodo getComponentsPc() da classe ComponentPcCLient */
        return this.componentPcClient.getComponentsPc();
    }
}
