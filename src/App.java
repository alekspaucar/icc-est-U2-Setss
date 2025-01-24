
import collections.Sets;
import java.util.Set;
import java.util.TreeSet;
import models.Contacto;
import utils.ContactoComparator;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("*****SETS*****");
        //runHashSet();
        //runLinkedHashSet();
        //runTreeSet();
       // runConstruirTreeSetConComparador();
        runEjercicio();
    }
    private static void runEjercicio() {
    Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());
        agenda.add(new Contacto("Juan", "Perez", "09323620"));
        agenda.add(new Contacto("Ana", "Lopez", "0993940762"));
        agenda.add(new Contacto("Carlos", "Gomez", "0990722065"));
        agenda.add(new Contacto("Ana", "Lopez", "0993847545"));

        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
    }
    public static void runHashSet(){
        //ejemplo con hashSet
        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.construirHashSet();
        System.out.println("--------HashSet--------------");
        System.out.println("elementos hashSet (no se garantiza orden)"+"\n");
        for (String elemento : ejemploHashSet) {
            System.out.println(elemento);
        }
    }
    public static void runLinkedHashSet(){
        //ejemplo con linkedHashSet
        Sets sets = new Sets();
        Set<String> ejemploLinkedHashSet = sets.construirLinkedHashSet();
        System.out.println("-----------linkedHashSet---------------");
        System.out.println("elementos hashSet (Respeta el orden de llegada)"+"\n");
        for (String elemento : ejemploLinkedHashSet) {
            System.out.println(elemento);
        }
    }
    public static void runTreeSet(){
        //ejemplo con TreeSet
        Sets sets = new Sets();
        Set<String> ejemploTreSet = sets.construirTreeSet();
        System.out.println("-----------TreeSets---------------");
        System.out.println("elementos hashSet (Orden alfabetico )"+"\n");
        for (String elemento : ejemploTreSet) {
            System.out.println(elemento);
        }
    }
    public static void runConstruirTreeSetConComparador(){
        //ejemplo con comparatorTreeSet
        Sets sets = new Sets();
        Set<String> ejemploComparador = sets.construirTreeSetConComparador();
        System.out.println("-----------ConstruirTreeSetConComparador---------------");
        System.out.println("elementos hashSet (Orden alfabetico )"+"\n");
        for (String elemento : ejemploComparador) {
            System.out.println(elemento);
        }
    }
}