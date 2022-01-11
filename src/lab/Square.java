package lab;

public interface Square {
    public void SetValue(double newValue);

    public double GetValue();

    public Object Clone() throws CloneNotSupportedException;
    public Object DeepClone();
}
