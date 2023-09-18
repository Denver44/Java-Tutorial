import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

/**
 * covariance, contravariance and invariance
 *
 * y = f(x) f ->List List<X>
 *          f -> add()
 * A, B; where A extends B
 *
 * covariance
 * f(A) extends f(B)
 *
 * contravariance
 * f(B) extends from f(A)
 *
 */

public class Generics {
    public static void main(String[] args) {

        Truck t = new Truck();
        t.insert(new Cement());
        //java generics-> invariant


        ArrayList<Materials> sandBags = new ArrayList<>(2);
        sandBags.add(new Materials());
        sandBags.add(new Materials());
        t.insertAll(sandBags); // Type Erasure
        
        t.printStatus();

    }
    static class Materials{}
    static class Goods extends Materials{}
    static class Cement extends Goods {}
    static class Sand extends Goods {}
    static class Person {}
    static class Student extends Person {}

    static class Vehicle<T> {
        Stack<T> items = new Stack<>();
        int capacity = 10;
        private int filled = 0;
        void printStatus() {
            for(T item: items){
                System.out.println(item);
            }
        }

        //covariance in java
        void insertAll(List<? super T> items) {
            // add bound
            filled += items.size(); // check if filled <= capacity
            
            this.items.addAll((Collection<? extends T>) items);
        }

        void insertAll_1(List<? super T> items) {
            // add bound
            filled += items.size(); // check if filled <= capacity
            
            this.items.addAll((Collection<? extends T>) items);
        }

        void insert(T item) {
            filled++; // check if filled <= capacity
            items.add(item);
        }
        T unload () {
            T item = items.pop();
            filled--; // check if filled >= 0
            return item;
        }
    }

    static class SchoolBus extends Vehicle<Person> {}
    static class Truck extends Vehicle<Goods> {}
}