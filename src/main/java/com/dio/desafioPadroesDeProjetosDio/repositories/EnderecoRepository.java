package com.dio.desafioPadroesDeProjetosDio.repositories;

import com.dio.desafioPadroesDeProjetosDio.entities.Cliente;
import com.dio.desafioPadroesDeProjetosDio.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String> {

}
