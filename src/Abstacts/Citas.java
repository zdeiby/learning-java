package Abstacts;

import java.sql.Date;

public class Citas implements Interface {
    private int id;
    private Doctor doctor;
    private Paciente paciente;
    private Date date;
    private String time;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Date getDate() {
        return date;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getTime() {
        return time;
    }
    @Override
    public void schedule(java.util.Date date, String time) {
      
    }

}
