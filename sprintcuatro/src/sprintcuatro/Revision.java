package sprintcuatro;

public class Revision {
    private int identificador;
    private String nombre;
    private String detalle;
    private int estado;

    public Revision() {
    }

    public Revision(int identificador, String nombre, String detalle, int estado) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.detalle = detalle;
        this.estado = estado;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        String estadoStr;
        if (estado == 1) {
            estadoStr = "Sin problemas";
        } else if (estado == 2) {
            estadoStr = "Con observaciones";
        } else if (estado == 3) {
            estadoStr = "No aprueba";
        } else {
            estadoStr = "Estado desconocido";
        }

        return "Revision{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", detalle='" + detalle + '\'' +
                ", estado=" + estadoStr +
                '}';
    }
}