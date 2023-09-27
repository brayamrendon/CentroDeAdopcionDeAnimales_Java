// Clase para registro Proceso de adopcion
public class ProcesoAdopcion {
    private Adoptante adoptante;
    private Animal animal;
    private String fecha;

    public ProcesoAdopcion(Adoptante adoptante, Animal animal, String fecha) {
        this.adoptante = adoptante;
        this.animal = animal;
        this.fecha = fecha;
    }
}
