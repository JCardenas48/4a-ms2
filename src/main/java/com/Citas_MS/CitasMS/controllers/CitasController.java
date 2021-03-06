package com.Citas_MS.CitasMS.controllers;

import com.Citas_MS.CitasMS.models.Citas;
import com.Citas_MS.CitasMS.repositories.CitasRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CitasController {

    private final CitasRepository repository;

    public CitasController(CitasRepository repository) {
        this.repository = repository;

    }
    /*
    OBTENER una Cita por Usuario
    Tipo: GET
    url: "/cita/{id}"
    Path Variable: le mando Cita al PacianteId
    Que me debe devolver: Cita
     */

    @GetMapping("/cita/{Id}")
    public Optional <Citas> getCitas(@PathVariable String Id) {
        return this.repository.findById(Id);
    }

    /*
    CREAR una Cita por Usuario

    Tipo: POST
    url: "/citas"
    Body: le mando una cita
    Que me debe devolver: Cita
     */

    @PostMapping("/cita/")
    public Citas newCitas(@RequestBody Citas citas){
        return this.repository.save(citas);

    }
        /*
    BORRAR una Cita

    Tipo: DELETE
    url: "/citas"
    Recibe: un pacienteId
    Que me debe devolver: Una Cancelacion
     */

    @DeleteMapping("/cita/{pacientId}")
        public void deleteCitas(@PathVariable String patienteId){
            repository.deleteById(patienteId);
    }

    /*
    ACTUALIZAR una Cita por PacienteId

    Tipo: UPDATE
    url: "/citas"
    Body: Actualizar una Cita
    Que me debe devolver: Cita
     */

    @PutMapping("/cita/{id}")
    public Citas updateCitas(@PathVariable String id, @RequestBody Citas new_citas){
        Citas old_citas = repository.findById(id).orElse(null);

        //        esto actualiza el procedimiento del Paciente
        old_citas.setEspecialidad(new_citas.getEspecialidad());
        return repository.save(old_citas);
    }

}
