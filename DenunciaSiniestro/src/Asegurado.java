public class Asegurado {
    private String nombreAsegurado;
    private String apellidoAsegurado;
    private Integer dni;
    private String marca;
    private String modelo;
    private Integer año;
    private String patente;


public Asegurado(String nombreAsegurado, String apellidoAsegurado, Integer dni, String marca, String modelo,
            Integer año, String patente) {
        this.nombreAsegurado = nombreAsegurado;
        this.apellidoAsegurado = apellidoAsegurado;
        this.dni = dni;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.patente = patente;
    }


public String getNombreAsegurado() {
    return nombreAsegurado;
}


public void setNombreAsegurado(String nombreAsegurado) {
    this.nombreAsegurado = nombreAsegurado;
}


public String getApellidoAsegurado() {
    return apellidoAsegurado;
}


public void setApellidoAsegurado(String apellidoAsegurado) {
    this.apellidoAsegurado = apellidoAsegurado;
}


public Integer getDni() {
    return dni;
}


public void setDni(Integer dni) {
    this.dni = dni;
}


public String getMarca() {
    return marca;
}


public void setMarca(String marca) {
    this.marca = marca;
}


public String getModelo() {
    return modelo;
}


public void setModelo(String modelo) {
    this.modelo = modelo;
}


public Integer getAño() {
    return año;
}


public void setAño(Integer año) {
    this.año = año;
}


public String getPatente() {
    return patente;
}


public void setPatente(String patente) {
    this.patente = patente;
}


@Override
public String toString() {
    return "Datos del asegurado:" + "\n" + nombreAsegurado + " " + apellidoAsegurado + "\nDNI: " + dni + "\nVehículo:"
            + "\n" + marca + " " + modelo + "\nAño: " + año + "\nPatente: " + patente;
}
}