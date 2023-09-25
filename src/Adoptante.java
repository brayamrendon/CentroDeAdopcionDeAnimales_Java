    // Clase para registro de adoptantes
public class Adoptante {
    //Atributos de los adoptantes
    String name;
    String address;
    String contactNumber;
    String adoptionPreferences;

    //Creacion de un constructor vacio y constructor con parametros definidos.

    public Adoptante() {
    }

    public Adoptante(String name, String direccion, String numeContacto, String preferenciaAdopcion) {
        this.name = name;
        this.address = direccion;
        this.contactNumber = numeContacto;
        this.adoptionPreferences = preferenciaAdopcion;
    }
    // Creacion de los metodos  Getters y setters de esta clase

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDireccion() {
        return address;
    }

    public void setDireccion(String direccion) {
        this.address = direccion;
    }

    public String getNumeContacto() {
        return contactNumber;
    }

    public void setNumeContacto(String numeContacto) {
        this.contactNumber = numeContacto;
    }

    public String getPreferenciaAdopcion() {
        return adoptionPreferences;
    }

    public void setPreferenciaAdopcion(String preferenciaAdopcion) {
        this.adoptionPreferences = preferenciaAdopcion;
    }
}
