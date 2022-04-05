package com.gestion.microelectronica.controllers;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gestion.microelectronica.entities.ComponenteEntity;
import com.gestion.microelectronica.services.ComponenteService;

@RestController
@RequestMapping("/componentes")
public class ComponenteController {

	@Autowired
	private ComponenteService componenteService;

	//===============================================
	// ============= MÉTODOS HTTP CRUD ==============
	//===============================================

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
	// ---LISTADO PAGINADO Y COMPLETO---
	@GetMapping("/listado")
	public List<ComponenteEntity> getAll(Pageable pageable) {

		return componenteService.getAllComponente(pageable);
	}

	//==================================================
	// ============= MÉTODOS HTTP BÚSQUEDA =============
	//==================================================

	// ---GET---
	@PostMapping("/id/{id}")
	public ComponenteEntity getById(@PathVariable("id") int id) {

		return componenteService.findById(id);
	}

	// ---GET---
	@GetMapping("/codigo/{codigo}")
	public List<ComponenteEntity> getByCodigo(@PathVariable("codigo") String codigo) {

		return componenteService.findByCodigo(codigo);
	}

	// ---GET---
	@GetMapping("/imagen/{imagen}")
	public List<ComponenteEntity> getByImagen(@PathVariable("imagen") String imagen) {

		return componenteService.findByImagen(imagen);
	}

	// ---GET---
	@GetMapping("/nro-de-pieza/{nroPieza}")
	public List<ComponenteEntity> getByNroPieza(@PathVariable("nroPieza") String nroPieza) {

		return componenteService.findByNroPieza(nroPieza);
	}

	// ---GET---
	@GetMapping("/categoria/{categoria}")
	public List<ComponenteEntity> getByCategoria(@PathVariable("nroPieza") String nroPieza) {

		return componenteService.findByNroPieza(nroPieza);
	}

	// ---GET---
	@GetMapping("/descripcion/{descripcion}")
	public List<ComponenteEntity> getByDescripcion(@PathVariable("descripcion") String descripcion) {

		return componenteService.findByDescripcion(descripcion);
	}

	// ---GET---
	@GetMapping("/fabricante/{fabricante}")
	public List<ComponenteEntity> getByFabricante(@PathVariable("fabricante") String fabricante) {

		return componenteService.findByFabricante(fabricante);
	}

	// ---GET---
	@GetMapping("/stock/{stock}")
	public List<ComponenteEntity> getByStock(@PathVariable("stock") int stock) {

		return componenteService.findByStock(stock);
	}

	// ---GET---
	@GetMapping("/precio/{precio}")
	public List<ComponenteEntity> getByPrecio(@PathVariable("precio") double precio) {

		return componenteService.findByPrecio(precio);
	}

	
	//============================================================
	// ============= VISTAS Y OPERACIONES GENERALES ==============
	//============================================================
	
	//---GET---
	//-- VISTA del index--
	@GetMapping("/inicio")
	public ModelAndView inicioModelAndView() {
	
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("index");
		
		return mav;
		
	}
	
	
	

	// ---GET---
	// ---Vista Formulario Agregar Componentes---
	@GetMapping("/agregar-comp-form")
	public ModelAndView agregarComFormModelAndView() {
		
		ModelAndView mav = new ModelAndView();
		
		//Creamos un nuevo componente y lo agregamos a la vista
		ComponenteEntity componente = new ComponenteEntity();
		
		mav.addObject("nuevoComponente",componente);
		
		mav.setViewName("componentes/comp-agregar-form");
		
		return mav;
	}
	
	// ---POST---
	// ---Vista Formulario Validado Agregar Componentes---
	//Obtenemos el componente del Modelo agregarComFormModelAndView
	@PostMapping("/agregar-comp-form-validado")
	public ModelAndView agregarCompFormValidadoModelAndView(@ModelAttribute("nuevoComponente") ComponenteEntity nuevoComponente) {
		
		ModelAndView mav = new ModelAndView();
		
		//Agregamos el componente a la db y al modelo
		mav.addObject( componenteService.addComponente(nuevoComponente));
		
		//Buscamos el componente agregado a traves de su id
		mav.addObject("componenteAgregado", componenteService.findById(nuevoComponente.getId()));
		
		//Agregamos el componente a la vista
		mav.setViewName("componentes/comp-agregar-form-validado");
		
	
		return mav;
	}
	

	
	// ---GET---
	// ---Vista Formulario Editar Componentes---
	//Pasamos el id con el formato String porque obtenemos los datos en formato String con Thymeleaf 
	//luego lo parseamops para el findBy
	@GetMapping("/editar-comp-form/id/{id}")
	public ModelAndView editarCompFormModelAndView(@PathVariable("id") String id) {
		
		ModelAndView mav = new ModelAndView();
		

		//Buscamos el componente segun su id y lo Agregamos al modelo
		mav.addObject("editarComponente",componenteService.findById(Integer.valueOf(id)));
		
	
		//Agregamos el componente a la vista
		mav.setViewName("componentes/comp-editar-form");
		
	
		return mav;
	}
	
	// ---POST---
	// ---VISTA COMP-EDITAR.HTML---
	//---Vista Formulario Validado Editar Componentes---
	//Obtenemos el componente del Modelo editarCompFormModelAndView
	@PostMapping("/editar-comp-form-validado")
	public ModelAndView editarCompFormValidadoModelAndView(@ModelAttribute("editarComponente") ComponenteEntity componenteEditado) {
		
		
		ModelAndView mav = new ModelAndView();
		
		//Agregamos el componente a la db y al modelo
		mav.addObject( componenteService.updateComponente(componenteEditado));
		
		//Buscamos el componente agregado a traves de su id
		mav.addObject("componenteAgregado", componenteService.findById(componenteEditado.getId()));
		
		//Agregamos el componente a la vista
		mav.setViewName("componentes/comp-editar-form-validado");
		
	
		return mav;
	}

	// ---GET---
	// ---Vista Eliminar Componentes---
	//Pasamos el id con el formato String porque obtenemos los datos en formato String con Thymeleaf 
	//luego lo parseamos para el findBy
	@GetMapping("/eliminar-comp/id/{id}")
	public ModelAndView eliminarCompModelAndView(@PathVariable("id") String id) {
		
		ModelAndView mav = new ModelAndView();
		

		int idComponente = Integer.valueOf(id);
	

		//Buscamos el Componente
		ComponenteEntity componenteEliminar= componenteService.findById(idComponente);
		
		

		if((idComponente > 0) && !(componenteEliminar == null)) {


			//Lo Agregamos al modelo
			mav.addObject("eliminarComponente",componenteEliminar);
			
		
			//Agregamos el componente a la vista
			mav.setViewName("componentes/comp-eliminar");
			
		}else {
			mav.setViewName("componentes/comp-eliminar");
		}
		
	
		return mav;
	}
	
	
	// ---POST---
	//---Vista Eliminar Componentes Validado---
	//--No pude obtener el id del modelo anterior, la solucion es obtener nuevamente el id y eliminar
	@GetMapping("/eliminar-comp-validado/id/{id}")
	public ModelAndView eliminarCompValidadoModelAndView(@PathVariable("id") String id) {
		
		
		ModelAndView mav = new ModelAndView();
		
		
		int idComponente = Integer.valueOf(id);
		
		//Buscamos el Componente
		ComponenteEntity componenteEliminar= componenteService.findById(idComponente);
		
		

		if((idComponente > 0) && !(componenteEliminar == null)) {


			//Eliminamos el componente de la db y al modelo
			mav.addObject(componenteService.deleteComponente(componenteEliminar.getId()));
			
			//Agregamos el componente a la vista
			mav.setViewName("componentes/comp-eliminar-validado");
			
		}else {
			mav.setViewName("componentes/comp-eliminar-validado");
		}
		
	
		return mav;
	}
	
	
	//=================================================
	// ============= FILTROS Y BUSQUEDAS ==============
	//=================================================

	

	//===========================================
	// ============= PAGINACIONES  ==============
	//===========================================
	

	// ---GET---
	// ---VISTA listado componentes paginacion---
	//Obtenemos formato String y parseamos
	@GetMapping("/listar-paginado/{nroPagina}/{nroElementos}/{campo}/{direccion}")
	public ModelAndView listarPaginadoModelAndView(
			@PathVariable("nroPagina")String nroPagina 
			, @PathVariable("nroElementos") String nroElementos
			, @PathVariable("campo") String campo
			, @PathVariable("direccion") String direccion
			) {
		
		
		ModelAndView mav = new ModelAndView();
		
		/*
		if((campo.equals("id") || (campo.equals("stock") || (campo.equals("precio"))))) 
		{
			

			//Seteamos un paginado (nro Paginas, nro de objetos)
			Pageable paginado = PageRequest.of(
					Integer.parseInt(nroPagina)
					, Integer.parseInt(nroElementos)
					, Sort.by(Sort.Direction.fromString(direccion), campo)
					);
			
			
		}else {
			//Seteamos un paginado (nro Paginas, nro de objetos)
			Pageable paginado = PageRequest.of(
					Integer.parseInt(nroPagina)
					, Integer.parseInt(nroElementos)
					, Sort.by(Sort.Direction.fromString(direccion), campo)
					);

		}
		*/
		
		//Seteamos un paginado (nro Paginas, nro de objetos)
		Pageable paginado = PageRequest.of(
				Integer.parseInt(nroPagina)
				, Integer.parseInt(nroElementos)
				, Sort.by(Sort.Direction.fromString(direccion), campo ));
		
		//Creamos objeto paginado para obtener datos y pasarlos al modelo
		Page<ComponenteEntity> ultimoPaginado =  componenteService.getAllComponentePage(paginado);
		
		
		
		//--Operaciones Info del Paginado--

		//Seteamos el Paginado en la Vista
		mav.addObject("objetoPaginado",ultimoPaginado);
		
		//Caracteristicas Paginado
		mav.addObject("ultimoNroPagina",(ultimoPaginado.getNumber()));
		mav.addObject("totalNroPaginas",(ultimoPaginado.getTotalPages()));
		
		//PaginadoVista arranca de Uno
		mav.addObject("ultimoNroPaginaVista",(ultimoPaginado.getNumber() + 1));
		
			
		mav.addObject("ultimoNroElementos",ultimoPaginado.getNumberOfElements());
		mav.addObject("totalElementos",ultimoPaginado.getTotalElements());
		
		
		//Limites de Paginado
		mav.addObject("limiteMenorPaginado",ultimoPaginado.getNumber() > 0);
		// -1 porque arrancamos la vista desde 1
		mav.addObject("limiteMayorPaginado",ultimoPaginado.getNumber() < (ultimoPaginado.getTotalPages() - 1));
		
	

		//Paginados btn
		mav.addObject("siguientePagina",ultimoPaginado.getNumber() + 1 );
		mav.addObject("anteriorPagina", ultimoPaginado.getNumber() - 1 );

		
		
		//Agregamos la lista de paginados al modelo
		mav.addObject("listaComponentesPaginado", ultimoPaginado);
		
		//Seteamos la vista
		mav.setViewName("componentes/comp-listar");
		return mav;
	}
	

	

	//====================================================
	// ============= ORDENACIONES PAGINADOS ==============
	//====================================================
	

	// ---GET---
	//Ordenacion por ID
	@GetMapping("/ordenar-por-id-paginado")
	public ModelAndView ordenarPorIdPaginadoModelAndView(@ModelAttribute("ultimoPaginado") Page<ComponenteEntity> ultimoPaginado) {

		ModelAndView mav = new ModelAndView();

		
		//Seteamos un paginado ordenado por id (nro Paginas, nro de objetos, sortBy..)
		Pageable sortByIdPaginado = PageRequest.of(ultimoPaginado.getNumber()
				, ultimoPaginado.getNumberOfElements(), Sort.by("id").ascending());
		

		//Pageable sortByIdPaginado = PageRequest.of(nroPagina , nroElementos);
		
		//Agregamos la lista de paginados ordenados por id al modelo
		mav.addObject("listaComponentesPaginado", componenteService.getAllComponente(sortByIdPaginado) );
		
		//Seteamos la vista
		mav.setViewName("componentes/comp-listar");
		
		return mav;
		
		
		
		
		
	
	}
	

}
