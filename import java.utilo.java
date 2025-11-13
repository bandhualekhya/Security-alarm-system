import java.util.Scanner;

public class AntiSleepAlarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== ANTI SLEEP ALARM SYSTEM ===");
        System.out.println("Press ENTER before timer ends to stay awake.");
        System.out.println("Type 'exit' to quit the program.\n");

        while (running) {
            int time = 10; // countdown time in seconds

            try {
                // Countdown loop
                for (int i = time; i > 0; i--) {
                    System.out.print("\rTime left: " + i + " seconds... ");
                    Thread.sleep(1000); // wait for 1 second
                }

                // Alarm triggered
                System.out.println("\n\n🚨 ALARM! You are inactive! Wake up! 🚨");
                System.out.print("Press ENTER to stop alarm or type 'exit' to quit: ");
                String input = sc.nextLine();

                if (input.equalsIgnoreCase("exit")) {
                    running = false;
                } else {
                    System.out.println("✅ Alarm stopped. Restarting timer...\n");
                }
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Anti Sleep Alarm System stopped.");
        sc.close();
    }
}
