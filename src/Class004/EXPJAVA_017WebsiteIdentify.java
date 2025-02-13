package Class004;

import java.util.Scanner;

public class EXPJAVA_017WebsiteIdentify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter website Name:");
        String website = sc.nextLine().trim().toLowerCase(); // Trim spaces & convert to lowercase
        sc.close();

        System.out.println("Website name is: " + website);

        // Check if the website contains a dot (.) to ensure it's a valid domain
        if (!website.contains(".")) {
            System.out.println("Invalid website: No domain extension found.");
            return; // Exit the program
        }

        // Prioritize special cases like ".gov.in" before checking ".gov"
        if (website.endsWith(".gov.in")) {
            System.out.println("Website is an Indian Government website.");
        } else if (website.endsWith(".gov")) {
            System.out.println("Website is a Government website.");
        } else if (website.endsWith(".com")) {
            System.out.println("Website is a Commercial website.");
        } else if (website.endsWith(".in")) {
            System.out.println("Website is an Indian website.");
        } else if (website.endsWith(".edu")) {
            System.out.println("Website is an Educational website.");
        } else if (website.endsWith(".org")) {
            System.out.println("Website is an Organizational website.");
        } else if (website.endsWith(".net")) {
            System.out.println("Website is a Network-related website.");
        } else {
            System.out.println("Invalid website: Unknown domain extension.");
        }
    }
}












