package lab;

import java.util.Scanner;

public class House {
    private Flat flat;// Квартира
    private Location location;//Расположение дома
    private Street street; //Описание улицы

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

    void Set(Street street_new, Flat flat_new, Location location_new)
    {
        location = location_new;
        flat = flat_new;
        street = street_new;
    }

    void Set_console()
    {
        int distanceSchool, distanceHospital, distanceKindergarten, numHouse, coin, countRoom, numFlat;
        String streetDescription;
        String houseStreet;

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


        System.out.printf("Выберите стоимость квартиры: ");
        do {
            coin = readInt();
        } while (coin <= 0);

        System.out.printf("Выберите кол-во комнат: ");
        do {
            countRoom = readInt();
        } while (countRoom <= 0);

        System.out.print("Номер дома: ");
        do {
            numHouse = readInt();
        } while (numHouse <= 0);


        System.out.printf("Номер квартиры: ");
        do {
            numFlat = readInt();
        } while (numFlat <= 0);

        System.out.printf("\nУлица: ");
        houseStreet = in.nextLine();
        System.out.printf("Описание улици: ");
        streetDescription = in.nextLine();

        location.Set(distanceSchool, distanceHospital, distanceKindergarten, houseStreet, numHouse);
        flat.Set(coin, countRoom, numFlat);
        street.Set(houseStreet, streetDescription);


    }

    void Print()
    {
        int test = 0;
        System.out.printf("\n  Адрес: %s, дом %d\n", location.Get_house_street(), location.Get_num_house());
        System.out.printf("  Номер квартиры: %d\n",flat.Get_num_flat());
        System.out.printf("  Расстояние до школы: %d км\n", location.Get_distance_school());
        System.out.printf("  Расстояние до больницы: %d км\n", location.Get_distance_hospital());
        System.out.printf("  Расстояние до детского сада: %d км\n", location.Get_distance_kindergarten());
        System.out.printf("  Кол-во комнат: %d\n",flat.Get_count_room());
        System.out.printf("  Цена: %d рублей\n", flat.Get_coin());
        System.out.printf("  Информация о улице: %s\n", street.Get_street_description());
    }
}
