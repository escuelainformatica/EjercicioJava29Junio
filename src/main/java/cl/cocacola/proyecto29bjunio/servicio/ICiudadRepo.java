package cl.cocacola.proyecto29bjunio.servicio;

import cl.cocacola.proyecto29bjunio.entidad.Ciudad;
import org.springframework.data.repository.CrudRepository;


// JPA java persistence api.

public interface ICiudadRepo extends CrudRepository<Ciudad,Integer> {

}
