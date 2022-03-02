package com.gestion.microelectronica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gestion.microelectronica.entities.ComponenteTransistorBipolarEntity;
import com.gestion.microelectronica.services.ComponenteTransistorBipolarService;

@RestController
@RequestMapping("/componentes-transistores-bipolares")
public class ComponenteTransistorBipolarController {
	
	

	@Autowired
	private ComponenteTransistorBipolarService componenteTransistorBipolarService;

	// ============= MÉTODOS HTTP CRUD ==============

	// ----POST----
	@PostMapping("/")
	public boolean addComponenteDetalle(@RequestBody ComponenteTransistorBipolarEntity componenteTransistorBipolar) {

		return componenteTransistorBipolarService.addComponente(componenteTransistorBipolar);
	}

	// ----PUT-----
	@PutMapping("/")
	public boolean updateComponenteDetalle(@RequestBody ComponenteTransistorBipolarEntity componenteTransistorBipolar) {

		return componenteTransistorBipolarService.updateComponente(componenteTransistorBipolar);
	}

	// ---DELETE---
	@DeleteMapping("/{id}")
	public boolean deleteComponenteDetalle(@PathVariable("id") int id) {

		return componenteTransistorBipolarService.deleteComponente(id);
	}




	// ---GET---
	// --- LISTADO PAGINADO Y COMPLETO ---
	@GetMapping("/listado")
	public List<ComponenteTransistorBipolarEntity> getAll(Pageable pageable) {

		return componenteTransistorBipolarService.getAllComponente(pageable);
	}
	
	
	
	//---GET---
	//---VISTA Y LISTA DE COMPONENTES---
	@GetMapping("/")
	public ModelAndView listarModelAndView() {
	    ModelAndView mav = new ModelAndView();
	    mav.addObject("listaComponentesTransistoresBioplares", componenteTransistorBipolarService.getAllComponente());
	    mav.setViewName("componentes-transistores-bipolares");
	    return mav;
	}
	
	// ============= MÉTODOS HTTP BÚSQUEDA ==============

	// ---GET---
	@GetMapping("/{id}")
	public ComponenteTransistorBipolarEntity getById(@PathVariable("id") int id) {

		return componenteTransistorBipolarService.findById(id);
	}
	
	// ---GET---
	@GetMapping("/{id_componente}")
	public ComponenteTransistorBipolarEntity getByIdComponente(@PathVariable("id_componente") int id_componente) {

		return componenteTransistorBipolarService.findByIdComponente(id_componente);
	}
	
	

	
	
	



}
