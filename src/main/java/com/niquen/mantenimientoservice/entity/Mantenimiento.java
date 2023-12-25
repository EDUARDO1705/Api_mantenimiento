package com.niquen.mantenimientoservice.entity;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="Mantenimientos")
public class Mantenimiento {
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private Integer id;
	@Column (unique = true,nullable = false, length = 100 )
	private String propietario;
	@Column(name="create_at", nullable=false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date Fecha;
	@Column(unique = true,nullable = false, length = 100 )
	private String vehiculo;
	@Column (nullable=false)
	private String placa;
	@Column (nullable=false)
	private String descripcion;


	
	
	

}

