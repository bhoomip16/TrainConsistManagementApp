public class UseCase14TrainConsistigunt {

    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    static class PassengerBogie {
        private String type;
        private int capacity;

        public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }

        public String toString() {
            return "Created Bogie: " + type + " -> " + capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("UC14 Handle Invalid Bogie Capacity");

        try {
            PassengerBogie sleeper = new PassengerBogie("Sleeper", 72);
            System.out.println(sleeper);

            PassengerBogie invalidBogie = new PassengerBogie("AC Chair", -10);
            System.out.println(invalidBogie);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("UC14 exception handling completed....");
    }
}

