import java.util.ArrayList;
import java.util.List;

public class UseCase12TrainConsistMgmnt {

    static class GoodsBogie {
        String cargo;
        String type;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println(" UC12 Safety Compliance Check for Goods Bogies ");
        System.out.println("==================================================");

        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal"));

        System.out.println("Goods Bogies in Train:");
        goodsBogies.forEach(bogie -> System.out.println(bogie.type + " -> " + bogie.cargo));

        boolean isSafetyCompliant = goodsBogies.stream()
                .allMatch(bogie -> {
                    if (bogie.type.equalsIgnoreCase("Cylindrical")) {
                        return bogie.cargo.equalsIgnoreCase("Petroleum");
                    }
                    return true;
                });

        System.out.println("\nSafety Compliance Status: " + isSafetyCompliant);

        if (isSafetyCompliant) {
            System.out.println("Train formation is SAFE.");
        } else {
            System.out.println("Train formation is NOT SAFE.");
        }

        System.out.println("UC12 safety validation completed...");
    }
}
