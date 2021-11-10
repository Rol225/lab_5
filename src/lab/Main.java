package lab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int option;
        do {
            System.out.print("  1) Класс location\n  2) Класс flat\n  3) Класс street\n  4) Класс house\n  5) Выход\n");
            System.out.print("Выберите действие: ");
            do {
                option = readInt();
                if (option > 5) {
                    System.out.print("\nОшибка. выбирете из допустимых значений: ");
                }
            } while (option > 5 || option <= 0);

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
               // FunckForHouse();
            }
        } while (option != 5);
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
