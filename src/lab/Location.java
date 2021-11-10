package lab;

import java.util.Scanner;

public class Location {
    private int distanceSchool; //Расстояние до школы
    private int distanceHospital;//Расстояние до больници
    private int distanceKindergarten;//Расстояние до детского сада
    private String houseStreet; //адрес дома
    private int numHouse;

    private static int readInt() {
        while (true) {
            Scanner in = new Scanner(System.in);
            String line = in.nextLine();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.err.println("Введите число");
            }
        }
    } // Проверка на ввод числа

    void Set(int distanceSchool_2, int distanceHospital_2, int distanceKindergarten_2, String houseStreet_2, int numHouse_2)
    {
        if (distanceSchool_2 <= 0) {
            distanceSchool = 0;
        }
        else {
            distanceSchool = distanceSchool_2;
        }
        if (distanceHospital_2 <= 0) {
            distanceHospital = 0;
        }
        else {
            distanceHospital = distanceHospital_2;
        }
        if (distanceKindergarten_2 <= 0) {
            distanceKindergarten = 0;
        }
        else {
            distanceKindergarten = distanceKindergarten_2;
        }
        if (numHouse_2 <= 0) {
            numHouse = 0;
        }
        else {
            numHouse = numHouse_2;
        }
        if (houseStreet_2 != null) {
            houseStreet = houseStreet_2;
        }
        else {
            houseStreet = "Error";
        }

    }

    void Set_console()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("\nВыберите расстояние до школы: ");
        do {
            distanceSchool = readInt();
        } while (distanceSchool <= 0);

        System.out.print("Выберите расстояние до больницы: ");
        do {
            distanceHospital = readInt();
        }while(distanceHospital <= 0);


        System.out.print("Выберите расстояние до детского сада: ");
        do {
            distanceKindergarten = readInt();
        } while (distanceKindergarten <= 0);

        System.out.print("Номер дома: ");
        do {
            numHouse = readInt();
        } while (numHouse <= 0);

        System.out.print("\nУлица: ");
        houseStreet = in.nextLine();
    }

    void Print()
    {
        System.out.printf("\n  Расстояние до школы: %d\n", distanceSchool);
        System.out.printf("  Расстояние до больницы: %d\n", distanceHospital);
        System.out.printf("  Расстояние до детскогосада: %d\n", distanceKindergarten);
        System.out.printf("  Название улицы: %s\n", houseStreet);
        System.out.printf("  Номер дома: %d\n", numHouse);
    }

    int Get_distance_school()
    {
        return distanceSchool;
    }

    int Get_distance_hospital()
    {
        return distanceHospital;
    }

    int Get_distance_kindergarten()
    {
        return distanceKindergarten;
    }

    int Get_num_house()
    {
        return numHouse;
    }

    String Get_house_street()
    {
        return houseStreet;
    }
}
