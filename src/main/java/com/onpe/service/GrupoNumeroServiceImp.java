package com.onpe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onpe.model.GrupoNumero;
import com.onpe.repository.IGrupoNumero;

@Service
public class GrupoNumeroServiceImp implements IGrupoNumeroService{
@Autowired
IGrupoNumero iGrupoNumero;
@Override
public GrupoNumero getGrupoVotacion(String id) {
	
	return iGrupoNumero.getGrupoVotacion(id);
}

}
