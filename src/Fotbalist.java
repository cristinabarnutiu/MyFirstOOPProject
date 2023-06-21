public class Fotbalist extends Sportiv implements InterfataA{
    Abilitate abilitate;
    public Fotbalist(String name, String tara) {
        super(name, tara);
        //super.name= "x";
    }

    @Override
    void seAntreneaza() {

    }

    public void seOdihneste(){
        super.seOdihneste();
        System.out.println("dupa un meci dificil");
    }

    @Override
    public void metodaInterfataA() {

    }
}
