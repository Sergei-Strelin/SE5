
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        boolean flag = true;
        boolean flag1 = true;
        boolean flag2 = true;
        int numberType = 0;
        System.out.println((char) 27 + "[34m Калькулятор выполняет 4 арифметических действия с \n"+
                                            "       рациональными и комплексными числами \n" + 
                                            "(с округлением результата до 4 знака после запятой)" + (char)27 + "[0m");


        while (flag2) {

                   
            while (flag){
                System.out.println(menu());
                int whatDo = input.nextInt();
                switch(whatDo) {
                    case 1: 
                        numberType = 1;
                        flag = false;
                        flag1 = true;
                        break;
                    case 2:
                        numberType = 2;
                        flag = false;
                        flag1 = true;
                        break;
                    case 3:         
                        flag = false;
                        flag1 = false;
                        flag2 = false; 
                        break;
                    default:
                        System.out.println((char) 27 + "[31mНет такого пункта меню!"+ (char)27 + "[0m");
                }
            }        

            
            while (flag1){
                System.out.println(menuOperation());
                int whatDoOperation = input.nextInt();
                switch(whatDoOperation) {
                    case 1,2,3,4: 
                        
                        if (numberType == 1) new Operation( whatDoOperation, new Rational(), new Rational());
                        if (numberType == 2) new Operation( whatDoOperation, new Complex(1), new Complex(1));
                        flag = true;    
                        flag1 = false;
                        break;
                    case 5: 
                        flag = true;   
                        flag1 = false;
                        break;
                    default:
                        System.out.println((char) 27 + "[31mНет такого пункта меню!"+ (char)27 + "[0m");
                }
            }
        }   
    }                  

            
    private static String menu() {
        String menuStr = new StringBuilder()
        .append((char) 27 + "[34m\nВведите с какими числами работаем: \n"+ (char)27 + "[0m")
        .append("1 - рациональные \n")
        .append("2 - комплексные \n")
        .append("3 - Выход ")
        .toString();

        return menuStr;
    }

    
    private static String menuOperation() {
        String menuStr = new StringBuilder()
        .append((char) 27 + "[34m\nВыберите действие: \n"+ (char)27 + "[0m")
        .append("1 - сложение \n")
        .append("2 - вычитание \n")
        .append("3 - умножение \n")
        .append("4 - деление \n")
        .append("5 - Выход ")
        .toString();

        return menuStr;
    }
}