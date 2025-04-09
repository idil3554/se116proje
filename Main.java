import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        FSM.printStartupInfo();
        Scanner scanner = new Scanner(System.in);
        FSM fsm = new FSM();
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine().trim();
            fsm.processCommand(command);
        }
    }
}
