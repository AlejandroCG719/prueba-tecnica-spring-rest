package com.pruebatecnica.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebatecnica.dao.AlbumnesDAO;
import com.pruebatecnica.entity.Albumnes;

@RestController
@RequestMapping("PruebaTecnica")
public class AlbumREST {
	
	@Autowired
	private AlbumnesDAO albumnesDAO;	

	@GetMapping(value ="/Album")
	public ResponseEntity<List<Albumnes>> getAlbumnes() {
		List<Albumnes> albumnes = albumnesDAO.findAll();
		return ResponseEntity.ok(albumnes);
	}
	@PostMapping(value="/Album")
	public ResponseEntity<Map<String, Object>> createAlbum(@RequestBody Albumnes albumnes){
		Albumnes newAlbumnes =  albumnesDAO.save(albumnes);
		Map<String, Object> response =  new HashMap<>();		
		
		response.put("Albumn", newAlbumnes);
		response.put("Cve_Mensaje", "Guardado exitosamente");
		return new ResponseEntity<Map<String, Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@DeleteMapping("/Album/{albumn_id}")
	public ResponseEntity<Map<String,Object>> deleteAlbum(@PathVariable int albumn_id) {
		albumnesDAO.deleteById(albumn_id);
		Map<String, Object> response =  new HashMap<>();
		response.put("Cve_Mensaje", "Fue exitosamente eliminado");
		return new ResponseEntity<Map<String, Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}