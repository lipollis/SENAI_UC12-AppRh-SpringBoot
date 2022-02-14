package com.AppRH.AppRH.repository;

import com.AppRH.AppRH.models.Empresa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmpresaRepository extends CrudRepository<Empresa, Long> {
    Empresa findById(long id);
    Empresa findByCnpj(String cnpj);
    Empresa findByNome(String nome);

    @Query(value = "select u from Empresa u where u.nome like %?1%")
    List<Empresa> findByNomesEmpresas(String nome);
}
