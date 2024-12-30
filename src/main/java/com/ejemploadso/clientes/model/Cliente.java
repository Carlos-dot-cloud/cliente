/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ejemploadso.clientes.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 *
 * @author USUARIO
 */
@Entity
@Data
public class Cliente {

    @Id
    @Column (name="id")
    private Long id;
    
    @Column (name="nombre", nullable=false, length=20)
    private String name;
    
    @Column (name="apellido", nullable=false)
    private String lastname;
    
    @Column (name="email", unique=true, nullable=false)
    private String email;
}
