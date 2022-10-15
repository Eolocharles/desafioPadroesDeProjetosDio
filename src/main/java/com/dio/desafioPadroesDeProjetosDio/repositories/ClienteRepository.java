package com.dio.desafioPadroesDeProjetosDio.repositories;

import com.dio.desafioPadroesDeProjetosDio.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
