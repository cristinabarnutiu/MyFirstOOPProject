import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;

public class DataStructures {
    public static void main(String[] args) {
        ArrayList<String> listaCumparaturi = new ArrayList<>();
        listaCumparaturi.add("oua");
        listaCumparaturi.add("lapte");
        listaCumparaturi.add("paine");
        listaCumparaturi.add("detergent");
        listaCumparaturi.set(1,"lapte vegetal");
        listaCumparaturi.remove("lapte vegetal");
        System.out.println(listaCumparaturi.get(1));
        for (String element:listaCumparaturi){
            System.out.println(element);
        }
        System.out.println(listaCumparaturi.size());
        System.out.println(listaCumparaturi.contains("oua"));

        HashMap <Integer, String> hashMapList = new HashMap<>();
        hashMapList.put(1,"Luni");
        hashMapList.put(2,"Marti");
        hashMapList.put(3,"Miercuri");
        hashMapList.put(5,"Vineri");
        hashMapList.remove(5);
        System.out.println(hashMapList.get(3));
        System.out.println(hashMapList.keySet());
        hashMapList.replace(1,"Luni-modificat");
        System.out.println(hashMapList.values());
        System.out.println(hashMapList.entrySet());

        //exercitii2
        HashMap<String, Boolean> listaExamen = new HashMap<>();
        listaExamen.put("Sam",true);
        listaExamen.put("Jon",false);
        listaExamen.put("Ana",true);
        listaExamen.put("Ema",false);
        listaExamen.put("Paul",true);

        System.out.println();
        System.out.println(listaExamen.entrySet());


        for (String student: listaExamen.keySet()){
            if(listaExamen.get(student)){
                System.out.println(student);
            }
        }






    }
}
