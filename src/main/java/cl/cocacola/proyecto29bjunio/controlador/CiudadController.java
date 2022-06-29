package cl.cocacola.proyecto29bjunio.controlador;

import cl.cocacola.proyecto29bjunio.entidad.Ciudad;
import cl.cocacola.proyecto29bjunio.servicio.ICiudadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ciudad")
public class CiudadController {

    @Autowired
    ICiudadRepo iCiudadRepo;

    @GetMapping("/listar")
    public List<Ciudad> listar() {
        return (List<Ciudad>) iCiudadRepo.findAll();
    }
}
