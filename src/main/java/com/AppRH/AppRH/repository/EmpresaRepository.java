package com.AppRH.AppRH.repository;

import com.AppRH.AppRH.models.Empresa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmpresaRepository extends CrudRepository<Empresa, Long> {
    Empresa findById(long id);
    Empresa findByCnpj(String cnpj);

    @Query(value = "SELECT u FROM Empresa u WHERE u.nome LIKE %?1%")
    List<Empresa> findByNomesEmpresas(String nome);
}
