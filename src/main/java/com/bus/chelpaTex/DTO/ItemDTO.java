package com.bus.chelpaTex.DTO;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ItemDTO implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idItem;
	
	private String tipoItem;
	
	private String idTrazabilidad;
	
	private BigDecimal precioUnidad;
	
	private BigDecimal cantidadMinima;
	
	private String nombre;
	
	private String imagen;
	
	private String origen;
	
	private String fabricante; 
	
	private String referencia;
	
	private String uso;
	
	private String segmentoCategoria;
	
	private String base;
	
	private String ligamento;
	
	private String codigoAcabado;
	
	private BigDecimal anchoTotal;
	
	private BigDecimal pesoGramaje; 
	
	private BigDecimal peso; 
	
	private String color; 
	
	private String composicion;
	
	private String tipoTejido;
	
	private String diseno;
	
	private String ubicacion;
	
	private String tamano;
	
	private String tipoMaterial;
	
	private String tipoPrenda;
	
	private String maquinasEspeciales;
	
	private BigDecimal cantidadPrenda; 
	
	private String objetivo; 
	
	private String usoSugerido;
	
	private String tipoTintura;
	
	private String ecologico;
	
	private String impactoSocial; 
	
	private String normaCertificacion;
	
	private BigDecimal anchoUtil;
	
	private BigDecimal longitud;
	
	private BigDecimal calibreGrosor; 
	
	private String aseguramiento; 
	
	private String forma;
	
	private BigDecimal numeroLigas;
	
	private String textura;
	
	private String encogimiento;
	
	private String elongacion;
	
	private String unidad;	
	
	private String idUsuario;
			
	private Boolean activo;

	
	
	public ItemDTO(Long idItem, String tipoItem, String idTrazabilidad, BigDecimal precioUnidad,
			BigDecimal cantidadMinima, String nombre, String referencia, String segmentoCategoria, Boolean activo) {
		super();
		this.idItem = idItem;
		this.tipoItem = tipoItem;
		this.idTrazabilidad = idTrazabilidad;
		this.precioUnidad = precioUnidad;
		this.cantidadMinima = cantidadMinima;
		this.nombre = nombre;
		this.referencia = referencia;
		this.segmentoCategoria = segmentoCategoria;
		this.activo = activo;
	}


	
	
	
}
