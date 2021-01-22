package com.pruebatecnica.entity;

import java.sql.Date;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Fotos")
public class Fotos {
	
	@Id
	@Column(name="foto_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int foto_id;
	
	@OneToMany	
  	List<Albumnes> albumnes;
	
	public int getFoto_id() {
		return foto_id;
	}
	public void setFoto_id(int foto_id) {
		this.foto_id = foto_id;
	}
	public String getUrl_documento() {
		return url_documento;		
	}
	public void setUrl_documento(String url_documento) {
		this.url_documento = url_documento;		
	}
	public String  getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}	
	public List<Albumnes> getAlbumnes(){
		return albumnes;	
	}
	public void setAlbumnes( List<Albumnes> albumnes) {
		this.albumnes = albumnes;
	}
	@Column(name = "url_documento", nullable = false)
	private String url_documento;
	
	@Column(name = "descripcion", nullable = false)
	private String descripcion;
	
	@Column(name = "fecha_creacion")
	private Date fecha_creacion;

}
