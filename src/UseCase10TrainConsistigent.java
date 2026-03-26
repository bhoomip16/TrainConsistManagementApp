import java.util.ArrayList;
import java.util.List;

public class UseCase10TrainConsistigent {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        System.out.println("==========================================");
        System.out.println("UC10 - Count Total Seats in Train");
        System.out.println("==========================================");

        System.out.println("\nBogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        int totalCapacity = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        System.out.println("\nTotal Seating Capacity of Train: " + totalCapacity);
        System.out.println("\nUC10 aggregation completed...");
    }
}

