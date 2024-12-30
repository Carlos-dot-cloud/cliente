package com.ejemploadso.clientes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemploadso.clientes.model.Cliente;
import com.ejemploadso.clientes.services.ClienteService;

@RestController
@RequestMapping("/v1/clientes")
public class ClientController {
	
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping("/nuevo")
	public Cliente newClient(@RequestBody Cliente newCliente) {
		return clienteService.newCliente(newCliente);
	}

	@GetMapping("/mostrar")
	public Iterable<Cliente> getAll() {
		return this.clienteService.getAll();
	}
	
	@PutMapping("/modificar")
	public Cliente updateClient(@RequestBody Cliente cliente) {
		return clienteService.modifyCliente(cliente);
	}
	
	@DeleteMapping("/{id}")
	public Boolean deleteClient(@PathVariable Long id) {
		return clienteService.deleteCliente(id);
	}
	
}
