package com.bus.chelpaTex.Entity;

import java.math.BigDecimal;

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
@Table(name = "MOLDE_ITEM")
public class MoldeItem {
	
	@EmbeddedId
	private MoldeItemPK moldeItemPK;
	
	@Column(name ="cantidad")
	private BigDecimal cantidad;
	
	@Column(name = "activo")
	private Boolean activo;
}
	