import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCase13TrainConsistMgmt {

    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("=====================================================");
        System.out.println(" UC13 Performance Comparison (Loops vs Streams) ");
        System.out.println("=====================================================");

        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            bogies.add(new Bogie("Sleeper", i % 100));
        }

        long loopStart = System.nanoTime();
        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopFiltered.add(b);
            }
        }
        long loopEnd = System.nanoTime();
        long loopDuration = loopEnd - loopStart;

        long streamStart = System.nanoTime();
        List<Bogie> streamFiltered = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
        long streamEnd = System.nanoTime();
        long streamDuration = streamEnd - streamStart;

        System.out.println("Loop Execution Time (ns): " + loopDuration);
        System.out.println("Stream Execution Time (ns): " + streamDuration);
        System.out.println("\nUC13 performance benchmarking completed...");
    }
}
