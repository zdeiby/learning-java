public class Datos {
  private String direccion;
  private int telefono; 
  private int cedula;

  public String getDireccion() {
      return direccion;
  }
  public int getTelefono() {
      return telefono;
  }

  public int getCedula() {
      return cedula;
  }

  public void setDireccion(String direccion) {
      this.direccion = direccion;
  }

  public void setTelefono(int telefono) {
      this.telefono = telefono;
  }

  public void setCedula(int cedula) {
      this.cedula = cedula;
  }
}

