package com.prueba.reto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.prueba.reto.model.PruebaSumar;
import com.prueba.reto.model.PruebaSumarResponse;
import com.prueba.reto.repository.RetoRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class RetoServices {
	
	private static final Logger looger = LoggerFactory.getLogger(RetoServices.class);
	
	@Autowired
	private RetoRepository retoRepository;
	
	public ResponseEntity<PruebaSumarResponse> obtenerSuma(Integer num1,Integer num2) {
		looger.info("inicio ontener texto visanet acepto terminos y condiciones");
		
		PruebaSumarResponse pruebaResponse = new PruebaSumarResponse();
		PruebaSumar pruebaSumar = new PruebaSumar(); 
		pruebaSumar.setNum1(num1);
		pruebaSumar.setNum2(num2);
		try {
			
			Integer resu = sumar(num1,num2);
			pruebaSumar.setResultado(resu);
			save(pruebaSumar);
		} catch (Exception e) {
			pruebaResponse.setStatus("Error");
		}
		pruebaResponse.setPruebaSumar(pruebaSumar);
		pruebaResponse.setStatus("OK");
		
			
		return new ResponseEntity<PruebaSumarResponse>(pruebaResponse, HttpStatus.OK);
	}

	 public PruebaSumar save(PruebaSumar suma) {
	        return retoRepository.save(suma);
	    }

	 public Integer sumar(Integer num1,Integer num2) {
		Integer res=0;
		res = num1 + num2;
		return res; 
	 }
}
