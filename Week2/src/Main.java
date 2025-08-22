// File: CallCenterSimulation.java

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Caller {
    String name;
    String phoneNumber;

    public Caller(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return name + " (" + phoneNumber + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Caller> callQueue = new LinkedList<>();

        while (true) {
            System.out.println("\n--- ANZ Call Center ---");
            System.out.println("1. Add Caller");
            System.out.println("2. Serve Caller");
            System.out.println("3. Show Queue");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Caller Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();
                    callQueue.add(new Caller(name, phone));
                    break;

                case 2:
                    if (!callQueue.isEmpty()) {
                        Caller next = callQueue.poll();
                        System.out.println("Now serving: " + next);
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;

                case 3:
                    System.out.println("Callers in queue: " + callQueue.size());
                    for (Caller c : callQueue) {
                        System.out.println("- " + c);
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
