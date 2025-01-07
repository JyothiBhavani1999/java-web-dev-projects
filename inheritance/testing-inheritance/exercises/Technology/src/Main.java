public class Main {
    public static void main(String[] args) {
            // Create objects
            Computer computer = new Computer("Dell", 16, 10);
            Laptop laptop = new Laptop("Touchscreen", "HP", 8, 20);
            SmartPhone smartphone = new SmartPhone("108MP", "touchscreen", "Samasung", 15, 40);

            // Display details
            computer.details();
            laptop.details();
            smartphone.details();

        }
    }


