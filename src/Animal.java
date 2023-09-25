// Clase para registro de animales
public class Animal {
    //Atributos de los animales
    String name;
    int age;
    String species;
    String race;
    String estadoSalud;
    String descripcion;

    //Creacion de un constructor vacio y constructor con parametros definidos.

    public Animal() {
    }

    public Animal(String name, int age, String species, String race, String estadoSalud, String descripcion) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.race = race;
        this.estadoSalud = estadoSalud;
        this.descripcion = descripcion;
    }

    // Creacion de los metodos  Getters y setters de esta clase


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
