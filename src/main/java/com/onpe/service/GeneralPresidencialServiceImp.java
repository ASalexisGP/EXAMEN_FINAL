package com.onpe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onpe.model.GeneralPresidencial;
import com.onpe.repository.IGeneralPresidencial;
@Service
public class GeneralPresidencialServiceImp implements IGeneralPresidencialService{
	@Autowired
	IGeneralPresidencial iGeneralPresidencial;
	@Override
	public GeneralPresidencial getpresidencial() {
		return iGeneralPresidencial.getpresidencial();
		
	}
	
}


