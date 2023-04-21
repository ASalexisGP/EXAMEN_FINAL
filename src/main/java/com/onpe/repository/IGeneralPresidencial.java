package com.onpe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onpe.model.GeneralPresidencial;

@Repository
public interface IGeneralPresidencial extends JpaRepository<GeneralPresidencial, Integer> {
@Query (value="{call sp_getResumen_GomeroPiscoAS}", nativeQuery =true )
GeneralPresidencial getpresidencial();


	
}
