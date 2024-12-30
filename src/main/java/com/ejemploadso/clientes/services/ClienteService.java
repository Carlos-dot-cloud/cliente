package com.ejemploadso.clientes.services;

import com.ejemploadso.clientes.model.Cliente;

public interface ClienteService {

	Cliente newCliente(Cliente newCliente);
	Iterable<Cliente> getAll();
	Cliente modifyCliente(Cliente cliente);
	Boolean deleteCliente(Long id);
	
}
