package lab;

import java.util.Scanner;

public class Flat {

    private int coin; //цена
    private int countRoom; //кол-во комнат
    private  int numFlat; //Номер квартиры

    public Flat()
    {
        this.coin = 0;
        this.countRoom = 0;
        this.numFlat = 0;
    }
    public Flat(int numFlat_2)
    {
        this.coin = 0;
        this.countRoom = 0;
        try{
            if (numFlat_2 <= 0)
            {
                this.numFlat = 0;
                throw new Exception("Ошибка присваивания значения переменной обьекта!");
            }
            else
            {
                this.numFlat = numFlat_2;
            }
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка!");
            System.out.println(ex);
        }
    }
    public Flat(int coin_2, int countRoom_2, int numFlat_2)
    {
        try{
            if (coin_2 <= 0) {
                this.coin = 0;
                throw new Exception("Ошибка присваивания значения переменной обьекта!");
            }
            else {
                this.coin = coin_2;
            }
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка!");
            System.out.println(ex);
        }
        try{
            if (countRoom_2 <= 0) {
                this.countRoom = 0;
                throw new Exception("Ошибка присваивания значения переменной обьекта!");
            }
            else {
                this.countRoom = countRoom_2;
            }
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка!");
            System.out.println(ex);
        }
        try{
            if (numFlat_2 <= 0) {
                this.numFlat = 0;
                throw new Exception("Ошибка присваивания значения переменной обьекта!");
            }
            else {
                this.numFlat = numFlat_2;
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

    void Set(int coin_2, int countRoom_2, int numFlat_2)
    {
        try{
            if (coin_2 <= 0) {
                this.coin = 0;
                throw new Exception("Ошибка присваивания значения переменной обьекта!");
            }
            else {
                this.coin = coin_2;
            }
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка!");
            System.out.println(ex);
        }
        try{
            if (countRoom_2 <= 0) {
                this.countRoom = 0;
                throw new Exception("Ошибка присваивания значения переменной обьекта!");
            }
            else {
                this.countRoom = countRoom_2;
            }
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка!");
            System.out.println(ex);
        }
        try{
            if (numFlat_2 <= 0) {
                this.numFlat = 0;
                throw new Exception("Ошибка присваивания значения переменной обьекта!");
            }
            else {
                this.numFlat = numFlat_2;
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
        System.out.printf("\nВыберите стоимость квартиры: ");
        do {
            coin = readInt();
        } while (coin <= 0);

        System.out.printf("Выберите кол-во комнат: ");
        do {
            countRoom = readInt();
        } while (countRoom <= 0);


        System.out.printf("Номер квартиры: ");
        do {
            numFlat = readInt();
        } while (numFlat <= 0);

    }

    void Print()
    {
        System.out.printf("\n  Цена: %d\n", coin);
        System.out.printf("  Количество комнат: %d\n", countRoom);
        System.out.printf("  Номер квартиры: %d\n", numFlat);
    }

    int Get_coin()
    {
        return coin;
    }

    int Get_count_room()
    {
        return countRoom;
    }

    int Get_num_flat()
    {
        return numFlat;
    }

}
