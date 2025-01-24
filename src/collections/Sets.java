package collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public Set<String> construirHashSet(){
        Set<String> miHashSet = new HashSet<>();
        miHashSet.add("manzana");    
        miHashSet.add("pera");
        miHashSet.add("melocoton");
        miHashSet.add("melon");
        miHashSet.add("pera");//elemento repetido, no se añadiria de nuevo.

        return miHashSet;   
        }
    public Set<String> construirLinkedHashSet(){
        Set<String> miLinkedHashSet = new LinkedHashSet<>();
        miLinkedHashSet.add("manzana");
        miLinkedHashSet.add("pera");
        miLinkedHashSet.add("melocoton");
        miLinkedHashSet.add("melon");
        miLinkedHashSet.add("pera"); 
        return miLinkedHashSet;
        }
    public Set<String> construirTreeSet(){  
        Set<String> miTreeSet = new TreeSet();
        miTreeSet.add("manzana");
        miTreeSet.add("pera");
        miTreeSet.add("melocoton");
        miTreeSet.add("melon");
        miTreeSet.add("pera");
            return miTreeSet;
        }
    public Set<String> construirTreeSetConComparador() {
        Comparator<String> comparatorPorLonguitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int resultado = Integer.compare(s1.length(), s2.length());
                if (resultado == 0) {
                    resultado = s1.compareTo(s2);
                }
                return resultado;
            }
        };
        
    Set<String> miTreeSetComparador = new TreeSet<>(comparatorPorLonguitud);
        miTreeSetComparador.add("melon");
        miTreeSetComparador.add("pera");
        miTreeSetComparador.add("manzana");
        miTreeSetComparador.add("fresa");
        miTreeSetComparador.add("kiwi");
        miTreeSetComparador.add("melocoton");
        miTreeSetComparador.add("pera"); 
        return miTreeSetComparador;
    }
}

