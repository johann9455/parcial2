public class Perro extends Canidos {

    public Perro() {
        super("ladrido", "carnívoro", "doméstico", "Canis lupus familiaris");
    }

       @Override
    public String getHabitat() {
        return habitat;
    }

}
