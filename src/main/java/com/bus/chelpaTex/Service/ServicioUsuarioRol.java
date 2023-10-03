package com.bus.chelpaTex.Service;

import java.security.InvalidParameterException;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bus.chelpaTex.DTO.UsuarioRolDTO;

@Service
public interface ServicioUsuarioRol {
	
	@Qualifier("ServicioUsuarioRolImpl")
	public UsuarioRolDTO crear(UsuarioRolDTO usuarioRolDTO) throws InvalidParameterException;

}
