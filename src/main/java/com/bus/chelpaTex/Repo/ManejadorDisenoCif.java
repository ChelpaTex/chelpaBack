package com.bus.chelpaTex.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bus.chelpaTex.DTO.CifDTO;
import com.bus.chelpaTex.Entity.DisenoCif;
import com.bus.chelpaTex.Entity.DisenoCifPK;

@Repository
public interface ManejadorDisenoCif extends JpaRepository<DisenoCif ,DisenoCifPK> {

	@Query("Select NEW com.bus.chelpaTex.DTO.CifDTO( "
			+  "d.idCif, "
			+  "d.nombre, "
			+  "d.tipoCif, "
			+  "d.valor, "
			+  "d.periodo, "
			+  "d.productividadPeriodo, "
			+  "d.porcentajeCif ,"
			+  "d.activo ) "
			+ "FROM Cif d JOIN DisenoCif cd ON d.idCif = cd.disenoCifPK.idCif "
			+ "WHERE cd.disenoCifPK.idDiseno = :idDiseno and d.activo=1 and cd.activo=1 " )
	public List<CifDTO> cifsDiseno (@Param ("idDiseno") Long idDiseno);
	
}
