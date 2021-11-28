package com.Citas_MS.CitasMS.models;
import org.springframework.data.annotation.Id;
import java.util.Date;

public class Citas {
    @Id
    private String id;
    private String pacienteId;
    private String profesionalId;
    private Date fecha;
    private Date hora;
    private String procedimientoFormulado;
    private String medicamentosFormulados;

    public Citas(String id, String pacienteId, String profesionalId, Date fecha, Date hora, String procedimientoFormulado, String medicamentosFormulados) {
        this.id = id;
        this.pacienteId = pacienteId;
        this.profesionalId = profesionalId;
        this.fecha = fecha;
        this.hora = hora;
        this.procedimientoFormulado = procedimientoFormulado;
        this.medicamentosFormulados = medicamentosFormulados;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getProcedimientoFormulado() {
        return procedimientoFormulado;
    }

    public void setProcedimientoFormulado(String procedimientoFormulado) {
        this.procedimientoFormulado = procedimientoFormulado;
    }

    public String getMedicamentosFormulados() {
        return medicamentosFormulados;
    }

    public void setMedicamentosFormulados(String medicamentosFormulados) {
        this.medicamentosFormulados = medicamentosFormulados;
    }
}
