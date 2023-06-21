public class Maratonist extends Sportiv{

    public Maratonist(String name, String tara) {
        super(name, tara);
    }

    @Override
    void seAntreneaza() {
    }
    public void seOdihneste(){
        System.out.println("Maratonistul se odihneste");
    }

}
