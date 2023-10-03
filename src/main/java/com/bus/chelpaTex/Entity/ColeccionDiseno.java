package com.bus.chelpaTex.Entity;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "COLECCION_DISENO")
public class ColeccionDiseno {
	
	@EmbeddedId
	private ColeccionDisenoPK coleccionDisenoPK;
	
	@Column(name = "activo")
	private Boolean activo;
}
	