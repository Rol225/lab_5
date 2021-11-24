package lab;

import java.util.Scanner;

public class Street {
    private String streetName;
    private String streetDescription;

    void Set(String streetName_2, String streetDescription_2)
    {
        if (streetName_2 != null) {
            this.streetName = streetName_2;
        }
        else {
            this.streetName = "Error";
        }
        if (streetName_2 != null) {
            this.streetDescription = streetDescription_2;
        }
        else {
            this.streetDescription = "Error";
        }
    }

    void Set_console()
    {
        Scanner in = new Scanner(System.in);
        System.out.printf("\nУлица: ");
        streetName = in.nextLine();
        System.out.printf("Описание улици: ");
        streetDescription = in.nextLine();
    }

    void Print()
    {
        System.out.printf("\n  Улица: %s\n", streetName);
        System.out.printf("  Описание улицы: %s\n", streetDescription);
    }

    String Get_street_name()
    {
        return streetName;
    }

    String Get_street_description()
    {
        return streetDescription;
    }
}
