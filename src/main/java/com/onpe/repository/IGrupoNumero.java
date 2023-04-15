package com.onpe.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onpe.model.GrupoNumero;
@Repository

public interface IGrupoNumero extends JpaRepository<GrupoNumero,String> {
@Query (value= "{call usp_getGrupoVotacion(:id)}",nativeQuery=true) 
GrupoNumero getGrupoVotacion(String id);

}
