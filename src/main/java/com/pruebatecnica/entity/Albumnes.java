package com.pruebatecnica.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


@Entity
@Table(name="Albumnes")
public class Albumnes {
	@Id
	@Column(name="album_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int album_id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="foto_id", referencedColumnName="foto_id")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Fotos fotos;
	
	
	public int getAlbum_id() {
		return album_id;
	}
	public void setAlbum_id(int album_id) {
		this.album_id= album_id;
	}
	
	public String getNombreAlbum() {
		return nombre;	
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;		
	}	
	public Date getFecha_creacion() {
		return fecha_creacion;
	}
	public Fotos getFotos() {
		return fotos;
	}
	public void setFotos( Fotos fotos) {
		this.fotos = fotos;
	}
	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	@Column(name = "nombre",length = 30)
	private String nombre;
	
	@Column(name = "fecha_creacion")
	private Date fecha_creacion;
	
}
