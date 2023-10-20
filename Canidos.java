public class Canidos extends Animal {

    public Canidos(String sonido, String alimentos, String habitat, String nombreCientífico) {
        super(sonido, alimentos, habitat, nombreCientífico);
    }

    @Override
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    @Override
    public String getSonido() {
        return sonido;
    }

    @Override
    public String getAlimentos() {
        return alimentos;
    }

    @Override
    public String getHabitat() {
        return habitat;
    }
}
