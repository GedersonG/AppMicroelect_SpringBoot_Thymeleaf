package com.gestion.microelectronica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gestion.microelectronica.services.ComponenteTransistorBipolarService;

@RestController
@RequestMapping("/v1/componentes-transistores-bipolares")
public class ComponenteTransistorBipolarController {

	@Autowired
	private ComponenteTransistorBipolarService componenteTransistorBipolarService;

	// ============= MÉTODOS HTTP CRUD ==============

	//DESARROLLAR SI SE REQUIERE
	
	
	

	// ============= MODELS AND VIEWS ==============

	// ===============
	// ===== GET =====
	// ===============

	@GetMapping("/estado-servicio")
	public ModelAndView estadoServicioModelAndView() {

		ModelAndView mav = new ModelAndView();

		mav.setViewName("componentes-transistores-bipolares/comp-trans-bip-estado-servicio");

		return mav;
	}

	
}
