public class Animal implements Vietate{
    private String nume;
    protected String culoare;
    protected boolean isVegetarian;

    protected int nrPicioare;
    private String []undeTraieste = {"apa","aer","uscat"};

    public Animal(){
        nume = "unknown";
        culoare = "unknown";
        isVegetarian = false;
    }

    public Animal(String nume, String culoare, boolean isVegetarian) {
        this.nume = nume;
        this.culoare = culoare;
        this.isVegetarian = isVegetarian;
    }

    public Animal(String nume, String culoare, boolean isVegetarian, int nrPicioare) {
        this.nume = nume;
        this.culoare = culoare;
        this.isVegetarian = isVegetarian;
        this.nrPicioare = nrPicioare;
        //this.undeTraieste = {"apa","aer","uscat"};
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public void doarme(){
        System.out.println(getNume()+" doarme");
        System.out.println(nume+" doarme");
    }

    public String afiseaza(){
        return nume+" are culoarea "+culoare;
    }

    public int getNrPicioare() {
        return nrPicioare;
    }

    public void setNrPicioare(int nrPicioare) {
        this.nrPicioare = nrPicioare;
    }

    public String[] getUndeTraieste() {
        return undeTraieste;
    }

    public void setUndeTraieste(String[] undeTraieste) {
        this.undeTraieste = undeTraieste;
    }

    public void afiseazaNrPicioare(){
        String str1 = getNume();
        String str2;
        if(getNrPicioare()==0){
            str2=" nu are picioare";
        }
        else if(getNrPicioare()==2){
            str2 = " are 2 picioare";
        }
        else if(getNrPicioare()==4){
            str2 = " are 4 picioare";
        }
        else str2 = " nu are picioare";
        System.out.println(str1+str2);
    }

    @Override
    public void metodaInterfata() {

    }
}
