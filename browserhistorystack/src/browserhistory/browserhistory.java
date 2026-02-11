package browserhistory;

import java.util.Scanner;
import java.util.Stack;

public class BrowserHistory {

    static Stack<String> backStack = new Stack<>();
    static Stack<String> forwardStack = new Stack<>();
    static String currentPage = "Home";

    static void visitPage(String url) {
        backStack.push(currentPage);
        currentPage = url;
        forwardStack.clear();
        System.out.println("Visited: " + currentPage);
    }

    static void goBack() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Current Page: " + currentPage);
        } else {
            System.out.println("No previous page available!");
        }
    }

    static void goForward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Current Page: " + currentPage);
        } else {
            System.out.println("No next page available!");
        }
    }

    static void showCurrentPage() {
        System.out.println("Current Page: " + currentPage);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n---- Browser Menu ----");
            System.out.println("1. Visit New Page");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Show Current Page");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter URL: ");
                    String url = sc.nextLine();
                    visitPage(url);
                    break;

                case 2:
                    goBack();
                    break;

                case 3:
                    goForward();
                    break;

                case 4:
                    showCurrentPage();
                    break;

                case 5:
                    System.out.println("Browser Closed.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
