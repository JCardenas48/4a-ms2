package com.Citas_MS.CitasMS.models;
import org.springframework.data.annotation.Id;
import java.util.Date;

public class Citas {
    @Id
    private String Id;
    private String pacienteId;
    private String profesionalId;
    private Date fecha;
    private String especialidad;

    public Citas(String Id, String pacienteId, String profesionalId, Date fecha, String procedimientoFormulado) {
        this.Id = Id;
        this.pacienteId = pacienteId;
        this.profesionalId = profesionalId;
        this.fecha = fecha;
        this.especialidad = procedimientoFormulado;
    }

    public String getId() {
        return Id;
    }

    public String getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(String pacienteId) {
        this.pacienteId = pacienteId;
    }

    public String getProfesionalId() {
        return profesionalId;
    }

    public void setProfesionalId(String profesionalId) {
        this.profesionalId = profesionalId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
