package lab;

import java.util.Scanner;

public class Location {
    private int distanceSchool; //Расстояние до школы
    private int distanceHospital;//Расстояние до больници
    private int distanceKindergarten;//Расстояние до детского сада
    private String houseStreet; //адрес дома
    private int numHouse;

    public Location() {
        this.distanceHospital = 0;
        this.distanceKindergarten = 0;
        this.distanceSchool = 0;
        this.houseStreet = "";
        this.numHouse = 0;
    }
    public Location(int numHouse_new) {
        this.distanceHospital = 0;
        this.distanceKindergarten = 0;
        this.distanceSchool = 0;
        this.houseStreet = "";
        try{
            if (numHouse_new <= 0)
            {
                this.numHouse = 0;
                throw new Exception("Ошибка присваивания значения переменной обьекта!");
            }
            else
            {
                this.numHouse = numHouse_new;
            }
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка!");
            System.out.println(ex);
        }
    }
    public Location(int distanceSchool_new, int distanceHospital_new, int distanceKindergarten_new, String houseStreet_new, int numHouse_new){
        try{
            if (distanceSchool_new <= 0)
            {
                this.distanceSchool = 0;
                throw new Exception("Ошибка присваивания значения переменной обьекта!");
            }
            else
            {
                this.distanceSchool = distanceSchool_new;
            }
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка!");
            System.out.println(ex);
        }
        try{
            if (distanceHospital_new <= 0)
            {
                this.distanceHospital = 0;
                throw new Exception("Ошибка присваивания значения переменной обьекта!");
            }
            else
            {
                this.distanceHospital = distanceHospital_new;
            }
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка!");
            System.out.println(ex);
        }
        try{
            if (distanceKindergarten_new <= 0)
            {
                this.distanceKindergarten = 0;
                throw new Exception("Ошибка присваивания значения переменной обьекта!");
            }
            else
            {
                this.distanceKindergarten = distanceKindergarten_new;
            }
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка!");
            System.out.println(ex);
        }
        try{
            if (numHouse_new <= 0)
            {
                this.numHouse = 0;
                throw new Exception("Ошибка присваивания значения переменной обьекта!");
            }
            else
            {
                this.numHouse = numHouse_new;
            }
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка!");
            System.out.println(ex);
        }
        try{
            if (houseStreet_new != null)
            {
                this.houseStreet = houseStreet_new;
            }
            else
            {
                this.houseStreet = "Error";
                throw new Exception("Ошибка присваивания значения переменной обьекта!");
            }
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка!");
            System.out.println(ex);
        }
    }

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

    void Set(int distanceSchool_new, int distanceHospital_new, int distanceKindergarten_new, String houseStreet_new, int numHouse_new)
    {
        try{
            if (distanceSchool_new <= 0)
            {
                this.distanceSchool = 0;
                throw new Exception("Ошибка присваивания значения переменной обьекта!");
            }
            else
            {
                this.distanceSchool = distanceSchool_new;
            }
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка!");
            System.out.println(ex);
        }
        try{
            if (distanceHospital_new <= 0)
            {
                this.distanceHospital = 0;
                throw new Exception("Ошибка присваивания значения переменной обьекта!");
            }
            else
            {
                this.distanceHospital = distanceHospital_new;
            }
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка!");
            System.out.println(ex);
        }
        try{
            if (distanceKindergarten_new <= 0)
            {
                this.distanceKindergarten = 0;
                throw new Exception("Ошибка присваивания значения переменной обьекта!");
            }
            else
            {
                this.distanceKindergarten = distanceKindergarten_new;
            }
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка!");
            System.out.println(ex);
        }
        try{
            if (numHouse_new <= 0)
            {
                this.numHouse = 0;
                throw new Exception("Ошибка присваивания значения переменной обьекта!");
            }
            else
            {
                this.numHouse = numHouse_new;
            }
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка!");
            System.out.println(ex);
        }
        try{
            if (houseStreet_new != null)
            {
                this.houseStreet = houseStreet_new;
            }
            else
            {
                this.houseStreet = "Error";
                throw new Exception("Ошибка присваивания значения переменной обьекта!");
            }
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка!");
            System.out.println(ex);
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
