import java.util.Scanner;

public class Rational extends Number {
    public static Scanner input = new Scanner(System.in);

    private double number;

    public Rational() {
        setNumber(); //lj,fdbk
    }


    public void setNumber() {
        System.out.println("Введите число (разделитель - запятая!)");
        this.number = input.nextDouble();
    }


    public double getNumber() {
        return number;
    }


    @Override
    public String toString() {
        return String.valueOf(number) ; 
    }
}
