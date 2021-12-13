package lab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int option;
        do {
            System.out.print("  1) Класс location\n  2) Класс flat\n  3) Класс street\n  4) Класс house\n  5) Массив обьектов класса house\n  6) 2-x мерный массив объектов flat\n  7) Выход\n");
            System.out.print("Выберите действие: ");
            do {
                option = readInt();
                if (option > 5) {
                    System.out.print("\nОшибка. выбирете из допустимых значений: ");
                }
            } while (option > 7 || option <= 0);

            if (option == 1) {
                FunckForLocation();
            }
            else if (option == 2) {
                FunckForFlat();
            }
            else if (option == 3) {
               FunckForStreet();
            }
            else if (option == 4) {
                FunckForHouse();
            }
            else if (option == 5) {
                FunckForHouses();
            }
            else if (option == 6) {
                TwodimensionalArrayFlats();
            }
        } while (option != 7);
    }

    static void FunckForStreet(){
        String streetName;
        String streetDescription;

        Street street_new = new Street();

        int option = 0;
        do {
            System.out.print("\n  1) Заполнить через встроенную функцию\n  2) Заполнить через внешнюю функцию\n  3) Вывести информацию из обьекта\n  4) Выход в главное меню\n");
            System.out.print("Выберите действие: ");
            do {
                option = readInt();
                if (option > 4) {
                    System.out.print("\nОшибка. выбирете из допустимых значений: ");
                }
            } while (option > 4 || option <= 0);

            if (option == 1) {
                street_new.Set_console();
            }
            else if (option == 2) {
                Scanner in = new Scanner(System.in);
                System.out.printf("\nУлица: ");
                streetName = in.nextLine();
                System.out.printf("Описание улици: ");
                streetDescription = in.nextLine();

                street_new.Set(streetName, streetDescription);
            }
            else if (option == 3) {
                street_new.Print();
            }

        } while (option != 4);
    }

    static void FunckForFlat(){
        int coin, countRoom, numFlat;
        int option = 0;

        Flat flat_new = new Flat();

        do {
            System.out.print("\n  1) Заполнить через встроенную функцию\n  2) Заполнить через внешнюю функцию\n  3) Вывести информацию из обьекта\n  4) Выход в главное меню\n");
            System.out.print("Выберите действие: ");
            do {
                option = readInt();
                if (option > 4) {
                    System.out.print("\nОшибка. выбирете из допустимых значений: ");
                }
            } while (option > 4 || option <= 0);

            if (option == 1) {
                flat_new.Set_console();
            }
            else if (option == 2) {
                System.out.print("\nВыберите стоимость квартиры: ");
                coin = readInt();
                System.out.print("Выберите кол-во комнат: ");
                countRoom = readInt();
                System.out.print("Номер квартиры: ");
                numFlat = readInt();
                flat_new.Set(coin, countRoom, numFlat);
            }
            else if (option == 3) {
                flat_new.Print();
            }

        } while (option != 4);

    }

    static void FunckForLocation(){
        int distanceSchool, distanceHospital, distanceKindergarten, numHouse;
        String houseStreet;
        int option;

        Location location_new = new Location();

        do {
            System.out.print("\n  1) Заполнить через встроенную функцию\n  2) Заполнить через внешнюю функцию\n  3) Вывести информацию из обьекта\n  4) Выход в главное меню\n");
            System.out.print("Выберите действие: ");
            do {
                option = readInt();
                if (option > 4) {
                    System.out.print("\nОшибка. выбирете из допустимых значений: ");
                }
            } while (option > 4 || option <= 0);

            if (option == 1) {
                location_new.Set_console();
            }
            else if (option == 2) {
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

                location_new.Set(distanceSchool, distanceHospital, distanceKindergarten, houseStreet, numHouse);
            }
            else if (option == 3) {
                System.out.println();
                location_new.Print();
            }
        } while (option != 4);
    }

    static void FunckForHouse(){
        int distanceSchool, distanceHospital, distanceKindergarten, numHouse, coin, countRoom, numFlat;
        String streetDescription;
        String houseStreet;
        Scanner in = new Scanner(System.in);

        House house_new = new House();
        Street street_new = new Street();
        Flat flat_new = new Flat();
        Location location_new = new Location();
        int option = 0;

        do {
            System.out.print("\n  1) Заполнить через встроенную функцию\n  2) Заполнить через внешнюю функцию\n  3) Вывести информацию из обьекта\n  4) Выход в главное меню\n");
            System.out.print("Выберите действие: ");
            do {
                option = readInt();
                if (option > 4) {
                    System.out.print("\nОшибка. выбирете из допустимых значений: ");
                }
            } while (option > 4 || option <= 0);

            if (option == 1) {
                house_new.Set_console();
            }
            else if (option == 2) {
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

                location_new.Set(distanceSchool, distanceHospital, distanceKindergarten, houseStreet, numHouse);
                flat_new.Set(coin, countRoom, numFlat);
                street_new.Set(houseStreet, streetDescription);
                house_new.Set(street_new, flat_new, location_new);
            }
            else if (option == 3) {
                house_new.Print();
            }

        } while (option != 4);
    }

    static void FunckForHouses(){
        int size;
        int index;
        System.out.print("\n  Сколько домов создать?: ");
        size = readInt();
        House[] list = new House[size];

        for(int i=0;i<size;i++){
            list[i] = new House();
            list[i].Set_console();
        }
        System.out.print("\n\n  Печать:");
        for(int i=0;i<size;i++){
            list[i].Print();
        }
        System.out.print("\n  Какой дом редактировать?: ");
        index = readInt();
        list[index] = new House();
        list[index].Set_console();
        System.out.print("\n\n  Печать:");
        for(int i=0;i<size;i++){
            list[i].Print();
        }
        System.out.print("\n");
    }

    static void TwodimensionalArrayFlats()
    {
        int size, size_2;

        System.out.print("\n\n  Введите размерность основного массива: ");
        size = readInt();
        System.out.print("\n  Введите размерность дочерних массивов: ");
        size_2 = readInt();

        Flat[][] Flats = new Flat[size][];
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size_2; j++)
            {
                Flats[i] = new Flat[size_2];
            }
        }
        System.out.print("\n\n  Введите значения: ");
        for (int i = 0; i < size; i++)
        {
            System.out.print("\n");
            for (int j = 0; j < size_2; j++)
            {
                Flats[i][j] = new Flat();
                Flats[i][j].Set_console();
            }
        }

        System.out.print("\n\n  Ваши данные: ");
        for (int i = 0; i < size; i++)
        {
            System.out.print("\n");
            for (int j = 0; j < size_2; j++)
            {
                Flats[i][j].Print();
            }
        }
        System.out.print("\n");
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
}