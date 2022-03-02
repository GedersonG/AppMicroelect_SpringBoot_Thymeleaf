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

import com.gestion.microelectronica.entities.ComponenteCapacitorElectroliticoEntity;
import com.gestion.microelectronica.services.ComponenteCapacitorElectroliticoService;

@RestController
@RequestMapping("/componentes-capacitores-electroliticos")
public class ComponenteCapacitorElectroliticoController {


	@Autowired
	private ComponenteCapacitorElectroliticoService componenteCapacitorElectroliticoService;

	// ============= MÉTODOS HTTP CRUD ==============

	// ----POST----
	@PostMapping("/")
	public boolean addComponente(@RequestBody ComponenteCapacitorElectroliticoEntity componenteCapacitorElectrolitico) {

		return componenteCapacitorElectroliticoService.addComponente(componenteCapacitorElectrolitico);
	}

	// ----PUT-----
	@PutMapping("/")
	public boolean updateComponente(@RequestBody ComponenteCapacitorElectroliticoEntity componenteCapacitorElectrolitico) {

		return componenteCapacitorElectroliticoService.updateComponente(componenteCapacitorElectrolitico);
	}

	// ---DELETE---
	@DeleteMapping("/{id}")
	public boolean deleteComponente(@PathVariable("id") int id) {

		return componenteCapacitorElectroliticoService.deleteComponente(id);
	}




	// ---GET---
	// --- LISTADO PAGINADO Y COMPLETO ---
	@GetMapping("/listado")
	public List<ComponenteCapacitorElectroliticoEntity> getAll(Pageable pageable) {

		return componenteCapacitorElectroliticoService.getAllComponente(pageable);
	}
	
	
	
	//---GET---
	//---VISTA Y LISTA DE COMPONENTES-CAPACITORES-ELECTROLITICOS---
	@GetMapping("/")
	public ModelAndView listarModelAndView() {
	    ModelAndView mav = new ModelAndView();
	    mav.addObject("listaComponentesCapacitoresElectroliticos", componenteCapacitorElectroliticoService.getAllComponente());
	    mav.setViewName("componentes-capacitor-electrolitico");
	    return mav;
	}
	
	// ============= MÉTODOS HTTP BÚSQUEDA ==============

	// ---GET---
	@GetMapping("/{id}")
	public ComponenteCapacitorElectroliticoEntity getById(@PathVariable("id") int id) {

		return componenteCapacitorElectroliticoService.findById(id);
	}
	
	// ---GET---
	@GetMapping("/{id_componente}")
	public ComponenteCapacitorElectroliticoEntity getByIdComponente(@PathVariable("id_componente") int id_componente) {

		return componenteCapacitorElectroliticoService.findByIdComponente(id_componente);
	}
	
	
	
	
	
}
