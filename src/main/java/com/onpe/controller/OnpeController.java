package com.onpe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.onpe.service.IGeneralPresidencialService;
import com.onpe.service.IGrupoNumeroService;

@Configuration
@CrossOrigin
@Controller
public class OnpeController extends WebMvcAutoConfiguration{
public void addCorsMappings (CorsRegistry registry) {
	registry.addMapping("/**");
}
	
@GetMapping ("/index")

public String index() {
	
	return "index";
}

@GetMapping ("/actas")

public String actas() {
	
	return "actas";
}

@GetMapping ("/actas_info")

public String actas_info() {
	
	return "actas_info";
}

//CREACCION DE LA NUEVA CARP :D
@GetMapping ("/GeneralPresi")

public String GeneralPresi() {
	
	return "GeneralPrecidencial";
}

@Autowired 
private IGrupoNumeroService iGrupoNumeroService; 

@GetMapping ("/actas_info/{id}")
public String listar (Model modelo, @PathVariable ("id")String id) {
	
modelo.addAttribute("actas", iGrupoNumeroService.getGrupoVotacion(id));
return "actas_info";
}
@Autowired
private IGeneralPresidencialService iGeneralPresidencialService;
@RequestMapping ("/GeneralP")
public String presidencial(Model modelo) {
	modelo.addAttribute("presidenciales", iGeneralPresidencialService.getpresidencial());
	return "GeneralPresidencialFinal";
}
}






