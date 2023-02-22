package Interface;

import java.util.Date;

import listas.set;

public class CitasNuse implements Interface{
    private int id;
    private Nuse nuse;
    private Paciente paciente;
    private Date date;
    private String time;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNuse(Nuse nuse) {
        this.nuse = nuse;
    }

    public Nuse getNuse() {
        return nuse;
    }

    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
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
    public void schedule(Date date, String time) {
      
    }
}
