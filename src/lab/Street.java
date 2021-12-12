package lab;

import java.util.Scanner;

public class Street {
    private String streetName;
    private String streetDescription;

    public Street()
    {
        this.streetName = "";
        this.streetDescription = "";
    }
    public Street(String streetName_2)
    {
        this.streetDescription = "";
        try{
            if (streetName_2 != null)
            {
                this.streetName = streetName_2;
            }
            else
            {
                this.streetName = "Error";
                throw new Exception("Ошибка присваивания значения переменной обьекта!");
            }
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка!");
            System.out.println(ex);
        }
    }
    public Street(String streetName_new, String streetDescription_new)
    {
        try{
            if (streetName_new != null)
            {
                this.streetName = streetName_new;
            }
            else
            {
                this.streetName = "Error";
                throw new Exception("Ошибка присваивания значения переменной обьекта!");
            }
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка!");
            System.out.println(ex);
        }
        try{
            if (streetName_new != null)
            {
                this.streetDescription = streetDescription_new;
            }
            else
            {
                this.streetDescription = "Error";
                throw new Exception("Ошибка присваивания значения переменной обьекта!");
            }
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка!");
            System.out.println(ex);
        }
    }

    void Set(String streetName_new, String streetDescription_new)
    {
        try{
            if (streetName_new != null)
            {
                this.streetName = streetName_new;
            }
            else
            {
                this.streetName = "Error";
                throw new Exception("Ошибка присваивания значения переменной обьекта!");
            }
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка!");
            System.out.println(ex);
        }
        try{
            if (streetName_new != null)
            {
                this.streetDescription = streetDescription_new;
            }
            else
            {
                this.streetDescription = "Error";
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
