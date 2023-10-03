package com.bus.chelpaTex.DTO;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ItemConCamposDTO implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ItemDTO item;

	private List<CampoAdicionalDTO> camposAdicionales;

}
