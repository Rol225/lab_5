package lab;

import java.util.Scanner;

public class House {
    private Flat flat;// Квартира
    private Location location;//Расположение дома
    private Street street; //Описание улицы
    private static int countData = 0; // Кол-во домов в базе

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

    public House() {
        this.location = new Location();
        this.flat = new Flat();
        this.street = new Street();
    }

    public House(Street street_new)
    {
        this.flat = new Flat();
        this.location = new Location();
        try{
            this.street = street_new;
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка!");
            System.out.println(ex);
        }
        CountData();
    }

    public House(Street street_new, Flat flat_new, Location location_new)
    {
        try{
            this.location = location_new;
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка!");
            System.out.println(ex);
        }
        try{
            this.flat = flat_new;
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка!");
            System.out.println(ex);
        }
        try{
            this.street = street_new;
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка!");
            System.out.println(ex);
        }
        CountData();
    }

    void Set(Street street_new, Flat flat_new, Location location_new)
    {
        this.location = location_new;
        this.flat = flat_new;
        this.street = street_new;
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

    public Flat GetFlat()
    {
        return this.flat;
    }
    public Location GetLocation()
    {
        return this.location;
    }
    public Street GetStreet()
    {
        return this.street;
    }

    public void PrintDepth()
    {
        System.out.print("\n  Глубина не определена для базового класса \n");
    }// Виртуальная функция

    static int CountData()
    {
        countData++;
        System.out.printf("\n  Кол-во домов использованных в базе: %d\n", countData);
        return countData;
    }// Функия счётчик
}
