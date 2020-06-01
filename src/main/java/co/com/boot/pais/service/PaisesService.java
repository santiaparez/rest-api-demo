package co.com.boot.pais.service;

import java.util.List;

import co.com.boot.pais.model.Pais;

public interface PaisesService {
	
	List<Pais> obtenerPaises();
	List<Pais> buscarPaises(String name);

}
