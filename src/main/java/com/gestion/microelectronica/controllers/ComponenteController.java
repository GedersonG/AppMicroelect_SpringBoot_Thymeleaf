package com.gestion.microelectronica.controllers;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.microelectronica.entities.ComponenteEntity;
import com.gestion.microelectronica.services.ComponenteService;

@RestController
@RequestMapping("/componentes")
public class ComponenteController {

	@Autowired
	private ComponenteService componenteService;

	// ============= MÉTODOS HTTP CRUD ==============

	// ----POST----
	@PostMapping("/")
	public boolean addComponente(@RequestBody ComponenteEntity componente) {

		return componenteService.addComponente(componente);
	}

	// ----PUT-----
	@PutMapping("/")
	public boolean updateComponente(@RequestBody ComponenteEntity componente) {

		return componenteService.updateComponente(componente);
	}

	// ---DELETE---
	@DeleteMapping("/{id}")
	public boolean deleteComponente(@PathVariable("id") int id) {

		return componenteService.deleteComponente(id);
	}

	// ---GET---
	@GetMapping("/listado")
	public List<ComponenteEntity> getAll(Pageable pageable) {

		return componenteService.getAllComponente(pageable);
	}
	
	//---GET---
	//---LISTA DE COMPONENTES PARA EL MODEL---
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listaComponentes", componenteService.getAllComponente());
		return "index";
	}
	
	// ============= MÉTODOS HTTP BÚSQUEDA ==============

	// ---GET---
	@GetMapping("/{id}")
	public ComponenteEntity getById(@PathVariable("id") int id) {

		return componenteService.findById(id);
	}
	
	// ---GET---
	@GetMapping("/{codigo}")
	public List<ComponenteEntity> getByCodigo(@PathVariable("codigo") String codigo) {

		return componenteService.findByCodigo(codigo);
	}
	
	
	
	

}
