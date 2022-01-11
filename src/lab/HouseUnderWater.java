package lab;

public class HouseUnderWater extends House implements Square {
    private int depth;      // Глубина
    private double value;      // Площадь

    public HouseUnderWater()
    {
        this.depth = 0;
        SetValue(0);
    } // Конструктор без параметров

    public HouseUnderWater(int newDepth, Street street, Flat flat, Location location, double newValue)
    {
        super(street, flat, location);
        this.depth = newDepth;
        SetValue(newValue);
    } // Конструктор с параметрами

    public void Set_HouseUnderWater(int newDepth, Street street, Flat flat, Location location, double newValue)
    {
        this.depth = newDepth;
        this.Set(street, flat, location);
        SetValue(newValue);
    } // Set houseUnderWater

    public void Print_HouseUnderWater()
    {
        this.Print();
    } // Print houseUnderWater

    public void Print(String text)
    {
        System.out.print(text);
        System.out.print("\n  Площадь: " + GetValue() + " квадратных метров");
        this.Print();
    } // Перегрузка метода базового класса

    public void PrintDepth()
    {
        System.out.print("  Глубина: " + this.depth + " метра\n\n");
    } // Использование виртуальной функциии базового класса house

    public void SetValue(double newValue)
    {
        this.value = newValue;

    } // реализация интерфейса

    public double GetValue()
    {
        return value;
    } // реализация интерфейса

    @Override
    public Object Clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public Object DeepClone()
    {
        HouseUnderWater copy = new HouseUnderWater(this.depth, this.GetStreet(), this.GetFlat(), this.GetLocation(), this.value);
        return copy;
    }
}
