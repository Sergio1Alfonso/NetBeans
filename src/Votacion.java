public class Votacion {
    private String nombre;
    private String apellidos;
    private Integer votos;

    public Votacion(String nombre, String apellidos, Integer votos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.votos = votos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Votacion{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", votos=" + votos +
                '}';
    }
}
