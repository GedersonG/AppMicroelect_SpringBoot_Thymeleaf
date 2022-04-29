package com.gestion.microelectronica.controllers;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
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

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/v1/componentes")
public class ComponenteController {

	@Autowired
	private ComponenteService componenteService;

	// ===============================================
	// ============= MÉTODOS HTTP CRUD ==============
	// ===============================================

	// ================
	// ===== POST =====
	// =================
	@Operation(summary = "Inserción de un Componente")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se ha Insertado el Componente Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudo Insertar el Componente. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "404", description = "La Inserción del Componente no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@PostMapping("/")
	public void addComponente(@RequestBody ComponenteEntity componente) {

		componenteService.addComponente(componente);
	}

	// ================
	// ===== PUT=====
	// =================
	@Operation(summary = "Actualización de un Componente")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se ha Actualizado el Componente Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudo Actualizar el Componente. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "404", description = "La Actualización del Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@PutMapping("/")
	public void updateComponente(@RequestBody ComponenteEntity componente) {

		componenteService.updateComponente(componente);
	}

	// ==================
	// ===== DELETE =====
	// ==================
	@Operation(summary = "Eliminación de un Componente por su ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se ha Eliminado el Componente Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudo Eliminar el Componente. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "404", description = "La Eliminación del Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@DeleteMapping("/{id}")
	public void deleteComponente(@PathVariable("id") int id) {

		componenteService.deleteComponente(id);
	}

	// ===============
	// ===== GET =====
	// ===============
	// ---LISTADO PAGINADO Y COMPLETO---
	@Operation(summary = "Listado Paginado de Componentes")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se ha Traído el Listado de Componentes", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudo traer el Listado de Componentes. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "404", description = "El Listado de Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@GetMapping("/listado")
	public Page<ComponenteEntity> getAll(Pageable pageable) {

		return componenteService.getAllComponente(pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	// ---LISTADO PAGINADO FILTROS ---
	@Operation(summary = "Listado Paginado de Componentes con Filtros")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se ha Traído el Listado de Componentes", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudo traer el Listado de Componentes. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "404", description = "El Listado de Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@GetMapping("/listado-filtrado")
	public Page<ComponenteEntity> getAllFilter(String filtro, Pageable pageable) {

		return componenteService.getAllFilterComponente(filtro, pageable);
	}

	// ==================================================
	// ============= MÉTODOS HTTP BÚSQUEDA =============
	// ==================================================

	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Búsqueda de un Componente por su ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se ha Traído el Componente Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudo Encontrar el Componente. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "404", description = "La Búsqueda del Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@GetMapping("/id/{id}")
	public ComponenteEntity getById(@PathVariable("id") int id) {

		return componenteService.findById(id);
	}

	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Búsqueda Paginada de Componentes por su Código")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se han Traído los Componentes Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudieron Encontrar los Componentes. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "404", description = "La Búsqueda de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@GetMapping("/codigo/{codigo}")
	public Page<ComponenteEntity> getByCodigo(@PathVariable("codigo") String codigo, Pageable pageable) {

		return componenteService.findByCodigo(codigo, pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Búsqueda Paginada de Componentes por su Imagen")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se han Traído los Componentes Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudieron Encontrar los Componentes. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "404", description = "La Búsqueda de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@GetMapping("/imagen/{imagen}")
	public Page<ComponenteEntity> getByImagen(@PathVariable("imagen") String imagen, Pageable pageable) {

		return componenteService.findByImagen(imagen, pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Búsqueda Paginada de Componentes por su Número de Piezas")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se han Traído los Componentes Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudieron Encontrar los Componentes. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "404", description = "La Búsqueda de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@GetMapping("/nro-de-pieza/{nroPieza}")
	public Page<ComponenteEntity> getByNroPieza(@PathVariable("nroPieza") String nroPieza, Pageable pageable) {

		return componenteService.findByNroPieza(nroPieza, pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Búsqueda Paginada de Componentes por su Categoría")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se han Traído los Componentes Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudieron Encontrar los Componentes. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "404", description = "La Búsqueda de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@GetMapping("/categoria/{categoria}")
	public Page<ComponenteEntity> getByCategoria(@PathVariable("nroPieza") String nroPieza, Pageable pageable) {

		return componenteService.findByNroPieza(nroPieza, pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Búsqueda Paginada de Componentes por su Descripción")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se han Traído los Componentes Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudieron Encontrar los Componentes. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "404", description = "La Búsqueda de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@GetMapping("/descripcion/{descripcion}")
	public Page<ComponenteEntity> getByDescripcion(@PathVariable("descripcion") String descripcion, Pageable pageable) {

		return componenteService.findByDescripcion(descripcion, pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Búsqueda Paginada de Componentes por su Fabricante")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se han Traído los Componentes Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudieron Encontrar los Componentes. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "404", description = "La Búsqueda de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@GetMapping("/fabricante/{fabricante}")
	public Page<ComponenteEntity> getByFabricante(@PathVariable("fabricante") String fabricante, Pageable pageable) {

		return componenteService.findByFabricante(fabricante, pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Búsqueda Paginada de Componentes por su Stock")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se han Traído los Componentes Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudieron Encontrar los Componentes. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "404", description = "La Búsqueda de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@GetMapping("/stock/{stock}")
	public Page<ComponenteEntity> getByStock(@PathVariable("stock") int stock, Pageable pageable) {

		return componenteService.findByStock(stock, pageable);
	}

	// ===============
	// ===== GET =====
	// ===============
	@Operation(summary = "Búsqueda Paginada de Componentes por su Precio")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Se han Traído los Componentes Correctamente", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "No se pudieron Encontrar los Componentes. Comprobar la Solicitud", content = @Content),
			@ApiResponse(responseCode = "404", description = "La Búsqueda de los Componentes no está Disponible ya que el recurso pedido no existe. Comprobar solicitud", content = @Content),
			@ApiResponse(responseCode = "500", description = "Se ha producido un error interno en el Servidor", content = @Content) })
	@GetMapping("/precio/{precio}")
	public Page<ComponenteEntity> getByPrecio(@PathVariable("precio") double precio, Pageable pageable) {

		return componenteService.findByPrecio(precio, pageable);
	}

	// ============================================================
	// ============= VISTAS Y OPERACIONES GENERALES ==============
	// ============================================================

	// ---GET---
	// -- VISTA del index--
	@GetMapping("/inicio")
	public ModelAndView inicioModelAndView() {

		ModelAndView mav = new ModelAndView();

		mav.setViewName("index.html");

		return mav;

	}

	// ---GET---
	// ---Vista Formulario Agregar Componentes---
	@GetMapping("/agregar-comp-form")
	public ModelAndView agregarComFormModelAndView() {

		ModelAndView mav = new ModelAndView();

		// Creamos un nuevo componente y lo agregamos a la vista
		ComponenteEntity componente = new ComponenteEntity();

		mav.addObject("nuevoComponente", componente);

		mav.setViewName("componentes/comp-agregar-form");

		return mav;
	}

	// ---POST---
	// ---Vista Formulario Validado Agregar Componentes---
	// Obtenemos el componente del Modelo agregarComFormModelAndView
	@PostMapping("/agregar-comp-form-validado")
	public ModelAndView agregarCompFormValidadoModelAndView(
			@ModelAttribute("nuevoComponente") ComponenteEntity nuevoComponente) {

		ModelAndView mav = new ModelAndView();

		// Agregamos el componente a la db
		componenteService.addComponente(nuevoComponente);

		// Buscamos el componente agregado a traves de su id
		mav.addObject("componenteAgregado", componenteService.findById(nuevoComponente.getId()));

		// Agregamos el componente a la vista
		mav.setViewName("componentes/comp-agregar-form-validado");

		return mav;
	}

	// ---GET---
	// ---Vista Formulario Editar Componentes---
	// Pasamos el id con el formato String porque obtenemos los datos en formato
	// String con Thymeleaf
	// luego lo parseamops para el findBy
	@GetMapping("/editar-comp-form/id/{id}")
	public ModelAndView editarCompFormModelAndView(@PathVariable("id") String id) {

		ModelAndView mav = new ModelAndView();

		// Buscamos el componente segun su id y lo Agregamos al modelo
		mav.addObject("editarComponente", componenteService.findById(Integer.valueOf(id)));

		// Agregamos el componente a la vista
		mav.setViewName("componentes/comp-editar-form");

		return mav;
	}

	// ---POST---
	// ---VISTA COMP-EDITAR.HTML---
	// ---Vista Formulario Validado Editar Componentes---
	// Obtenemos el componente del Modelo editarCompFormModelAndView
	@PostMapping("/editar-comp-form-validado")
	public ModelAndView editarCompFormValidadoModelAndView(
			@ModelAttribute("editarComponente") ComponenteEntity componenteEditado) {

		ModelAndView mav = new ModelAndView();

		// Agregamos el componente a la db
		componenteService.updateComponente(componenteEditado);

		// Buscamos el componente agregado a traves de su id
		mav.addObject("componenteAgregado", componenteService.findById(componenteEditado.getId()));

		// Agregamos el componente a la vista
		mav.setViewName("componentes/comp-editar-form-validado");

		return mav;
	}

	// ---GET---
	// ---Vista Eliminar Componentes---
	// Pasamos el id con el formato String porque obtenemos los datos en formato
	// String con Thymeleaf
	// luego lo parseamos para el findBy
	@GetMapping("/eliminar-comp/id/{id}")
	public ModelAndView eliminarCompModelAndView(@PathVariable("id") String id) {

		ModelAndView mav = new ModelAndView();

		int idComponente = Integer.valueOf(id);

		// Buscamos el Componente
		ComponenteEntity componenteEliminar = componenteService.findById(idComponente);

		if ((idComponente > 0) && !(componenteEliminar == null)) {

			// Lo Agregamos al modelo
			mav.addObject("eliminarComponente", componenteEliminar);

			// Agregamos el componente a la vista
			mav.setViewName("componentes/comp-eliminar");

		} else {
			mav.setViewName("componentes/comp-eliminar");
		}

		return mav;
	}

	// ---POST---
	// ---Vista Eliminar Componentes Validado---
	// --No pude obtener el id del modelo anterior, la solucion es obtener
	// nuevamente el id y eliminar
	@GetMapping("/eliminar-comp-validado/id/{id}")
	public ModelAndView eliminarCompValidadoModelAndView(@PathVariable("id") String id) {

		ModelAndView mav = new ModelAndView();

		int idComponente = Integer.valueOf(id);

		// Buscamos el Componente
		ComponenteEntity componenteEliminar = componenteService.findById(idComponente);

		if ((idComponente > 0) && !(componenteEliminar == null)) {

			// Eliminamos el componente de la db
			componenteService.deleteComponente(componenteEliminar.getId());

			// Agregamos el componente a la vista
			mav.setViewName("componentes/comp-eliminar-validado");

		} else {
			mav.setViewName("componentes/comp-eliminar-validado");
		}

		return mav;
	}

	// ---GET---

	@GetMapping("/ayuda-comp")
	public ModelAndView ayudaComModelAndView() {

		ModelAndView mav = new ModelAndView();

		// Agregamos el componente a la vista
		mav.setViewName("utils/ayuda");

		return mav;
	}

	// ================================================
	// ============= PAGINACION Y FILTRO ==============
	// ================================================

	// ---GET---
	// ---VISTA listado componentes paginacion---
	// Obtenemos formato String y parseamos
	@GetMapping("/listar-paginado/{nroPagina}/{nroElementos}/{campo}/{direccion}")
	public ModelAndView listarPaginadoModelAndView(@PathVariable("nroPagina") int nroPagina,
			@PathVariable("nroElementos") int nroElementos, @PathVariable("campo") String campo,
			@PathVariable("direccion") String direccion, @Param("filtro") String filtro) {

		ModelAndView mav = new ModelAndView();

		/*
		 * if((campo.equals("id") || (campo.equals("stock") ||
		 * (campo.equals("precio"))))) {
		 * 
		 * 
		 * //Seteamos un paginado (nro Paginas, nro de objetos) Pageable paginado =
		 * PageRequest.of( Integer.parseInt(nroPagina) , Integer.parseInt(nroElementos)
		 * , Sort.by(Sort.Direction.fromString(direccion), campo) );
		 * 
		 * 
		 * }else { //Seteamos un paginado (nro Paginas, nro de objetos) Pageable
		 * paginado = PageRequest.of( Integer.parseInt(nroPagina) ,
		 * Integer.parseInt(nroElementos) ,
		 * Sort.by(Sort.Direction.fromString(direccion), campo) );
		 * 
		 * }
		 */

		Pageable paginado = PageRequest.of(nroPagina, nroElementos,
				Sort.by(Sort.Direction.fromString(direccion), campo));

		//===============================================
		// ================== SIN FILTER =================

		// Creamos un objeto paginado con los componentes para obtener datos y pasarlos
		// al modelo
		Page<ComponenteEntity> ultimoPaginado = componenteService.getAllComponente(paginado);

		// --Operaciones Info del Paginado--

		// Seteamos el Paginado en la Vista
		mav.addObject("objetoPaginado", ultimoPaginado);

		// Caracteristicas Paginado
		mav.addObject("ultimoNroPagina", (ultimoPaginado.getNumber()));
		mav.addObject("totalNroPaginas", (ultimoPaginado.getTotalPages()));

		// PaginadoVista arranca de Uno
		mav.addObject("ultimoNroPaginaVistaModelo", (ultimoPaginado.getNumber() + 1));
		mav.addObject("totalNroPaginasVistaModelo", (ultimoPaginado.getTotalPages() - 1));

		mav.addObject("ultimoNroElementos", ultimoPaginado.getNumberOfElements());
		mav.addObject("totalElementos", ultimoPaginado.getTotalElements());

		// Limites de Paginado (true or false)
		mav.addObject("limiteMenorPaginado", ultimoPaginado.getNumber() > 0);
		// -1 porque arrancamos la vista desde 1
		mav.addObject("limiteMayorPaginado", ultimoPaginado.getNumber() < (ultimoPaginado.getTotalPages() - 1));

		// Paginados btn
		mav.addObject("siguientePagina", ultimoPaginado.getNumber() + 1);
		mav.addObject("anteriorPagina", ultimoPaginado.getNumber() - 1);

		// Agregamos la lista de paginados al modelo
		mav.addObject("listaComponentesPaginado", ultimoPaginado);

		// ===============================================
		// ================== CON FILTER =================

		// Objeto Paginado con el filter tomado del parametro de entrada
		Page<ComponenteEntity> ultimoPaginadoFilter = componenteService.getAllFilterComponente(filtro, paginado);

		mav.addObject("listaComponentesPaginadoFiltro", ultimoPaginadoFilter);

		mav.addObject("ultimoNroElementosFiltro", ultimoPaginadoFilter.getNumberOfElements());

		mav.addObject("filtro", filtro);

		
		
		
		
		
		// Seteamos la vista
		mav.setViewName("componentes/comp-listar");
		return mav;
	}

	// ====================================================
	// ============= ORDENACIONES PAGINADOS ==============
	// ====================================================

	// ---GET---
	// Ordenacion por ID
	@GetMapping("/ordenar-por-id-paginado")
	public ModelAndView ordenarPorIdPaginadoModelAndView(
			@ModelAttribute("ultimoPaginado") Page<ComponenteEntity> ultimoPaginado) {

		ModelAndView mav = new ModelAndView();

		// Seteamos un paginado ordenado por id (nro Paginas, nro de objetos, sortBy..)
		Pageable sortByIdPaginado = PageRequest.of(ultimoPaginado.getNumber(), ultimoPaginado.getNumberOfElements(),
				Sort.by("id").ascending());

		// Pageable sortByIdPaginado = PageRequest.of(nroPagina , nroElementos);

		// Agregamos la lista de paginados ordenados por id al modelo
		mav.addObject("listaComponentesPaginado", componenteService.getAllComponente(sortByIdPaginado));

		// Seteamos la vista
		mav.setViewName("componentes/comp-listar");

		return mav;

	}
	
	

	
	// ========================================
	// ============= GRÁFICOS ==============
	// ========================================

	@GetMapping("grafico-select")
	public ModelAndView graficoSeleccion() {

		ModelAndView mav = new ModelAndView();

		mav.setViewName("componentes/comp-graf-select");

		return mav;

	}

	@GetMapping("/grafico-stock-categoria")
	public ModelAndView graficoStockCateg() {

		ModelAndView mav = new ModelAndView();

		// Seteamos un paginado de 500 elementos hipoteticos
		Pageable paginado = PageRequest.of(0, 500, Sort.by("id").ascending());

		Page<ComponenteEntity> listComp = componenteService.getAllComponente(paginado);

		// ----------- VARIABLES CATEGORIA ---------------
		String transBjt = "Transistores BJT";
		String transMosfet = "Transistores MOSFET";
		String capElectr = "Capacitores Electroliticos";
		String resAltFrec = "Resistores de Alta Frecuencia";
		String microsPics = "Microcontroladores PICS";
		String microsAvrs = "Microcontroladores AVRS";
		String placasArd = "Placas Arduino";
		String placasEsp8266 = "Placas Esp8266";
		String placasEsp32 = "Placas Esp32";

		// ------------- STOCK POR CATEGORIA ------------------
		// Stock de Transistores BJT
		int stockTransBjt = componenteService.stockPorCategoria(listComp, transBjt);

		// Stock de Transistores MOSFET
		int stockTransMosfet = componenteService.stockPorCategoria(listComp, transMosfet);

		// Stock de Capacitores Electroliticos
		int stockCapElectr = componenteService.stockPorCategoria(listComp, capElectr);

		// Stock de Resistores de Alta Frecuencia
		int stockResisAltFrec = componenteService.stockPorCategoria(listComp, resAltFrec);

		// Stock de Microcontroladores PICS
		int stockMicrosPics = componenteService.stockPorCategoria(listComp, microsPics);

		// Stock de Microcontroladores AVRS
		int stockMicrosAvrs = componenteService.stockPorCategoria(listComp, microsAvrs);

		int stockPlacasArd = componenteService.stockPorCategoria(listComp, placasArd);

		int stockPlacasEsp8266 = componenteService.stockPorCategoria(listComp, placasEsp8266);

		int stockPlacasEsp32 = componenteService.stockPorCategoria(listComp, placasEsp32);

		// --------- SET DE STOCK POR CATEGORIA ------------

		Map<String, Integer> data = new LinkedHashMap();

		data.put(transBjt, stockTransBjt);
		data.put(transMosfet, stockTransMosfet);
		data.put(capElectr, stockCapElectr);
		data.put(resAltFrec, stockResisAltFrec);
		data.put(microsPics, stockMicrosPics);
		data.put(microsAvrs, stockMicrosAvrs);
		data.put(placasArd, stockPlacasArd);
		data.put(placasEsp8266, stockPlacasEsp8266);
		data.put(placasEsp32, stockPlacasEsp32);

		mav.addObject("keySetCateg", data.keySet());
		mav.addObject("valuesCateg", data.values());

		mav.setViewName("componentes/comp-graf-stock-categ");

		return mav;
	}

	@GetMapping("/grafico-stock-fabricante")
	public ModelAndView graficoStockFabr() {

		ModelAndView mav = new ModelAndView();

		// Seteamos un paginado de 500 elementos hipoteticos
		Pageable paginado = PageRequest.of(0, 500, Sort.by("id").ascending());

		Page<ComponenteEntity> listComp = componenteService.getAllComponente(paginado);

		// ----------- VARIABLES FABRICANTES ---------------
		String vish = "VISHAY";
		String eln = "ELNA";
		String kysh = "KYSHOCERA";
		String shanHuash = "SHANTOU HUASHAN";
		String slk = "SLKOR";
		String micr = "MICROCHIP";
		String micrTech = "MICROCHIP TECHNOLOGY";
		String twi = "T-WINS";
		String pan = "PANASONIC";
		String hit = "HITACHI";
		String advPow = "ADVANCED POWER";
		String ard = "ARDUINO";
		String wem = "WEMOS";
		String esprSys = "ESPRESSIF SYSTEMS";
		String stMicr = "STMICROELECTRONICS";
		String renElec = "RENESAS ELECTRONIC";
		String centSem = "CENTRAL SEMICONDUCTOR";
		String inchSem = "INCHANGE SEMICONDUCTOR";

		// ------------- STOCK POR FABRICANTE ------------------
		int stockVishay = componenteService.stockPorFabricante(listComp, vish);
		int stockElna = componenteService.stockPorFabricante(listComp, eln);
		int stockKyshoc = componenteService.stockPorFabricante(listComp, kysh);
		int stockShantHuash = componenteService.stockPorFabricante(listComp, shanHuash);
		int stockSlkor = componenteService.stockPorFabricante(listComp, slk);
		int stockMicr = componenteService.stockPorFabricante(listComp, micr);
		int stockMicrTech = componenteService.stockPorFabricante(listComp, micrTech);
		int stockTwins = componenteService.stockPorFabricante(listComp, twi);
		int stockPanas = componenteService.stockPorFabricante(listComp, pan);
		int stockHit = componenteService.stockPorFabricante(listComp, hit);
		int stockAdvPow = componenteService.stockPorFabricante(listComp, advPow);
		int stockArd = componenteService.stockPorFabricante(listComp, ard);
		int stockWemos = componenteService.stockPorFabricante(listComp, wem);
		int stockEsprSys = componenteService.stockPorFabricante(listComp, esprSys);
		int stockStMicr = componenteService.stockPorFabricante(listComp, stMicr);
		int stockRenElec = componenteService.stockPorFabricante(listComp, renElec);
		int stockCentSem = componenteService.stockPorFabricante(listComp, centSem);
		int stockInchSem = componenteService.stockPorFabricante(listComp, inchSem);

		// --------- SET DE STOCK POR FABRICANTE ------------

		Map<String, Integer> data02 = new LinkedHashMap();

		data02.put(vish, stockVishay);
		data02.put(eln, stockElna);
		data02.put(kysh, stockKyshoc);
		data02.put(shanHuash, stockShantHuash);
		data02.put(slk, stockSlkor);
		data02.put(micr, stockMicr);
		data02.put(micrTech, stockMicrTech);
		data02.put(twi, stockTwins);
		data02.put(pan, stockPanas);
		data02.put(hit, stockHit);
		data02.put(advPow, stockAdvPow);
		data02.put(ard, stockArd);
		data02.put(wem, stockWemos);
		data02.put(esprSys, stockEsprSys);
		data02.put(stMicr, stockStMicr);
		data02.put(renElec, stockRenElec);
		data02.put(centSem, stockCentSem);
		data02.put(inchSem, stockInchSem);

		mav.addObject("keySetFabr", data02.keySet());
		mav.addObject("valuesFabr", data02.values());

		mav.setViewName("componentes/comp-graf-stock-fabr");

		return mav;
	}

}
