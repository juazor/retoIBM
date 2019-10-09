package com.prueba.reto.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.reto.business.RetoBusiness;
import com.prueba.reto.model.PruebaSumarResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/reto")
public class RetoController {

	private static final Logger logger = LoggerFactory.getLogger(RetoController.class);
	
	@Autowired
	private RetoBusiness retoBusiness;
	
	@RequestMapping( value = "/sumar/{num1}/{num2}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<PruebaSumarResponse> ObtenerTextoVisanet(@PathVariable("num1") Integer num1,@PathVariable("num2") Integer num2) {
		logger.info("Start return visanet text");
		ResponseEntity<PruebaSumarResponse> client = retoBusiness.obtenerSuma(num1, num2);
		return new ResponseEntity<PruebaSumarResponse>(client.getBody(), HttpStatus.OK);
	}
	
}
