import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Scrivere una funzione che restituisca un HashSet riempito
//Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//Verificare che l' elemento sia parte del Set e stampare il risultato
public class Main {
    public static void main(String[] args) {
        Number num = new Number(5);

        Set<Integer> numbers = makeHashSet();

        numbers.add(num.number);

        if(numbers.contains(4)){
            System.out.println("The number is contained in the set");
        }
        else{
            System.out.println("The number is not contained in the set");
        }
    }
    public static Set<Integer> makeHashSet(){

        return new HashSet<>(Arrays.asList(1,2,3));
    }
}