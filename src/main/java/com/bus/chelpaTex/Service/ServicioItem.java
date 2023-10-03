package com.bus.chelpaTex.Service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bus.chelpaTex.DTO.ActualizarDisenoDTO;
import com.bus.chelpaTex.DTO.ItemConCamposDTO;
import com.bus.chelpaTex.DTO.ItemDTO;

@Service
public interface ServicioItem {

	@Qualifier("ServicioItemImpl")
	BigDecimal calcularValorTotalUnidades(ActualizarDisenoDTO actualizarDisenoDTO);
	
	@Qualifier("ServicioItemImpl")
	List<ItemDTO> consultarItemsTipo(String tipoItem);
	
	@Qualifier("ServicioItemImpl")
	ItemDTO crear(ItemDTO itemDTO) throws  Exception;

	@Qualifier("ServicioItemImpl")
	List<ItemDTO> consultarItemsUsuario(String idUsuario, String tipoItem);
	
	@Qualifier("ServicioItemImpl")
	ItemConCamposDTO consultarDetallesItem(Long idItem);

	@Qualifier("ServicioItemImpl")
	ItemConCamposDTO crearItemConCampos(ItemConCamposDTO itemConCamposDTO) throws  Exception;
	
}
