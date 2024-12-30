package com.ejemploadso.clientes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemploadso.clientes.model.Cliente;
import com.ejemploadso.clientes.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public Cliente newCliente(Cliente newCliente) {
		return clienteRepository.save(newCliente);
	}

	@Override
	public Iterable<Cliente> getAll() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente modifyCliente(Cliente cliente) {
		
		Optional<Cliente> clienteEncontrado = this.clienteRepository.findById(cliente.getId());
		if(clienteEncontrado.get() != null) {
			clienteEncontrado.get().setName(cliente.getName());
			clienteEncontrado.get().setLastname(cliente.getLastname());
			clienteEncontrado.get().setEmail(cliente.getEmail());
			return this.newCliente(clienteEncontrado.get());
		}
		return null;
	}

	@Override
	public Boolean deleteCliente(Long id) {
		this.clienteRepository.deleteById(id);
		return true;
	}
	
}
