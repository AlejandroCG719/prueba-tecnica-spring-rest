package com.pruebatecnica.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebatecnica.dao.FotosDAO;
import com.pruebatecnica.entity.Fotos;
@RestController
@RequestMapping("PruebaTecnica")
public class FotoREST {
	
	@Autowired
	private FotosDAO fotosDAO;
	
	@PostMapping(value="/Foto")
	public ResponseEntity<Map<String, Object>> createFoto(@RequestBody Fotos fotos){
		Fotos newFoto =  fotosDAO.save(fotos);
		Map<String, Object> response =  new HashMap<>();
		
		response.put("Foto", newFoto);
		response.put("Cve_Mensaje", "Guardado exitosamente");
		return new ResponseEntity<Map<String, Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
