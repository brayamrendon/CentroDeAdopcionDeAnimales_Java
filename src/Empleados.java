// Clase para registro de empleados
public class Empleados {
    // Clase para registro de empleados

    String name;
    String role;
    int dateOfHire;

    //Creacion de un constructor vacio y constructor con parametros definidos.


    public Empleados() {
    }

    public Empleados(String name, String role, int dateOfHire) {
        this.name = name;
        this.role = role;
        this.dateOfHire = dateOfHire;
    }

    // Creacion de los metodos  Getters y setters de esta clase

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(int dateOfHire) {
        this.dateOfHire = dateOfHire;
    }
}
