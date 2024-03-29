package org.generation.farmacia.controller;

import java.util.List;

import org.generation.farmacia.model.ProdutoModel;
import org.generation.farmacia.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author marianatheml
 * @since 1.0
 *
 */

@RestController
@RequestMapping("/produtos")
@CrossOrigin("*")
public class ProdutoController {

	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<ProdutoModel>> findAllProduto () {
		return ResponseEntity.ok(repository.findAll());
	}
	
}
