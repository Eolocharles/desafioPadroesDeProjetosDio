package com.dio.desafioPadroesDeProjetosDio.services;

import com.dio.desafioPadroesDeProjetosDio.entities.Cliente;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarClientePorId(Long id);

    void inserir(Cliente cliente);

    void atualizarPorId(Long id, Cliente cliente);

    void deletar(Long id);

}
