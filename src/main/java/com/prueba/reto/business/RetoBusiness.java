package com.prueba.reto.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.prueba.reto.model.PruebaSumarResponse;
import com.prueba.reto.services.RetoServices;

@Component
public class RetoBusiness {
	
	@Autowired
	private RetoServices retoServices;
	
	public ResponseEntity<PruebaSumarResponse> obtenerSuma(Integer num1,Integer num2) {
		return retoServices.obtenerSuma(num1,num2);
	}

}
