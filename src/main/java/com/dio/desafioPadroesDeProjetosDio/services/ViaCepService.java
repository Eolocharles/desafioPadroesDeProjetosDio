package com.dio.desafioPadroesDeProjetosDio.services;

import com.dio.desafioPadroesDeProjetosDio.entities.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ViaCepService", url = "https://viacep.com.br/ws/")
public interface ViaCepService {

    @GetMapping("{cep}/json/")
    Endereco findEnderecoByCep( @PathVariable("cep") String cep);

}
