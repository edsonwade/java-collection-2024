package code.with.vanilson.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * SetMain
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-15
 */
public class SetMain {

    public static void main(String[] args) {
        Set<Integer> primeNumbers = new HashSet<Integer>();
        Set<Integer> primeNumbers2 = new TreeSet<>(); // order values

        primeNumbers.add(71);
        primeNumbers.add(61);
        primeNumbers.add(41);
        primeNumbers.add(4);
        primeNumbers.add(1);

        primeNumbers2.add(71);
        primeNumbers2.add(61);
        primeNumbers2.add(41);
        primeNumbers2.add(4);
        primeNumbers2.add(1);

        System.out.println("Prime numbers from HashSet: " + primeNumbers);
        System.out.println(" ");
        System.out.println("Prime numbers from TreeSet: " + primeNumbers2);

        primeNumbers2.remove(4);
        System.out.println("After removing 4 from TreeSet: " + primeNumbers2);
        System.out.println(" is empty : " + primeNumbers2.isEmpty());
        System.out.println(" is size : " + primeNumbers.size());


        String prime  ="prime";
        String primes ="prime";
        System.out.println(prime.hashCode() == primes.hashCode()); // true because both are string objects with same value

        System.out.println(prime.hashCode()); //same hashcode
        System.out.println(primes.hashCode());



    }
}