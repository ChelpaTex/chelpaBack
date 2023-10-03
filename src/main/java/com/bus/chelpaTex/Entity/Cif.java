package com.bus.chelpaTex.Entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "CIF")
public class Cif {

	@Id
	@GeneratedValue(generator = "SEQ_CIF")
    @GenericGenerator(name = "SEQ_CIF", strategy = "increment")
	@Column(name = "id_cif")
	private Long idCif;
	
	@Column(name = "tipo_cif")
	private String tipoCif;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "valor")
	private BigDecimal valor;
	
	@Column(name = "periodo")
	private Long periodo;
	
	@Column(name = "productividad_periodo")
	private BigDecimal productividadPeriodo;
	
	@Column(name = "porcentaje_cif")
	private BigDecimal porcentajeCif;
		
	@Column(name = "activo")
	private Boolean activo;
	
	

}

