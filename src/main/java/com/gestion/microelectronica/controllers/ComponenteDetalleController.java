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

import com.gestion.microelectronica.entities.ComponenteDetalleEntity;
import com.gestion.microelectronica.entities.ComponenteEntity;
import com.gestion.microelectronica.services.ComponenteDetalleService;

@RestController
@RequestMapping("/componentes_detalles")
public class ComponenteDetalleController {
	

	@Autowired
	private ComponenteDetalleService componenteDetalleService;

	// ============= MÉTODOS HTTP CRUD ==============

	// ----POST----
	@PostMapping("/")
	public boolean addComponenteDetalle(@RequestBody ComponenteDetalleEntity componenteDetalle) {

		return componenteDetalleService.addComponente(componenteDetalle);
	}

	// ----PUT-----
	@PutMapping("/")
	public boolean updateComponenteDetalle(@RequestBody ComponenteDetalleEntity componenteDetalle) {

		return componenteDetalleService.updateComponente(componenteDetalle);
	}

	// ---DELETE---
	@DeleteMapping("/{id}")
	public boolean deleteComponenteDetalle(@PathVariable("id") int id) {

		return componenteDetalleService.deleteComponente(id);
	}




	// ---GET---
	// --- LISTADO PAGINADO Y COMPLETO ---
	@GetMapping("/listado")
	public List<ComponenteDetalleEntity> getAll(Pageable pageable) {

		return componenteDetalleService.getAllComponente(pageable);
	}
	
	
	
	//---GET---
	//---VISTA Y LISTA DE COMPONENTES---
	@GetMapping("/")
	public ModelAndView listarModelAndView() {
	    ModelAndView mav = new ModelAndView();
	    mav.addObject("listaComponentesDetalles", componenteDetalleService.getAllComponente());
	    mav.setViewName("componentes_detalles");
	    return mav;
	}
	
	// ============= MÉTODOS HTTP BÚSQUEDA ==============

	// ---GET---
	@GetMapping("/{id}")
	public ComponenteDetalleEntity getById(@PathVariable("id") int id) {

		return componenteDetalleService.findById(id);
	}
	
	// ---GET---
	@GetMapping("/{id_componente}")
	public ComponenteDetalleEntity getByIdComponente(@PathVariable("id_componente") int id_componente) {

		return componenteDetalleService.findByIdComponente(id_componente);
	}
	
	

	
	
	


}
