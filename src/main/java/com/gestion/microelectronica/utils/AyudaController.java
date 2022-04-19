package com.gestion.microelectronica.utils;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/v1/utils")
public class AyudaController {
	
	@GetMapping("/ayuda")
	public ModelAndView ayudaModelAndView() {

		ModelAndView mav = new ModelAndView();

	
		// Agregamos el componente a la vista
		mav.setViewName("utils/ayuda");

		return mav;
	}

}
