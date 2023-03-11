public class Operation {
    Logirable logger;
    MainLogger ml = new MainLogger();
    public Operation(Logirable logger){
        this.logger = logger;
    }

    public Operation(int kindOfOperation, Number operand1, Number operand2)  {
        switch (kindOfOperation) {
            case (1):
                sum(operand1, operand2);
                break;
            case (2):
                minus(operand1, operand2);
                break;
            case (3):
                mult(operand1, operand2);
                break;
            case (4):
                div(operand1, operand2);
                break;
        }

    }
    public void sum(Number operand1, Number operand2){
        if (operand1 instanceof Rational && operand2 instanceof Rational){
            Double newR = ((Rational) operand1).getNumber() + ((Rational) operand2).getNumber();
            System.out.println((char) 27 + "[31mРезультат: " + operand1.toString()+" + "+operand2.toString() + " = " + String.format("%.4f",newR) + (char)27 + "[0m");
            ml.doLog(new Logger(String.format("%s + %s = %s", operand1.toString(), operand2.toString(), newR.toString())));
        }
        if(operand1 instanceof Complex && operand2 instanceof Complex){
            Complex newC = new Complex();
            newC.setRealPart(((Complex) operand1).getRealPart() + ((Complex) operand2).getRealPart());
            newC.setImaginaryPart(((Complex) operand1).getImaginaryPart() + ((Complex) operand2).getImaginaryPart());
            System.out.println((char) 27 + "[31mРезультат: (" + operand1.toString() + ") + (" + operand2.toString() + ") = " + newC.toString() + (char)27 + "[0m");
            ml.doLog(new Logger(String.format("%s + %s = %s", operand1.toString(), operand2.toString(), newC.toString())));
        }
    }
    public void minus(Number operand1, Number operand2){
        if (operand1 instanceof Rational && operand2 instanceof Rational){
            Double newR = ((Rational) operand1).getNumber() - ((Rational) operand2).getNumber();
            System.out.println((char) 27 + "[31mРезультат: " + operand1.toString() + " - " + operand2.toString() + " = " + String.format("%.4f",newR) + (char)27 + "[0m");
            ml.doLog(new Logger(String.format("%s - %s = %s", operand1.toString(), operand2.toString(), newR.toString())));

        }
        if(operand1 instanceof Complex && operand2 instanceof Complex){
            Complex newC = new Complex();
            newC.setRealPart(((Complex) operand1).getRealPart() - ((Complex) operand2).getRealPart());
            newC.setImaginaryPart(((Complex) operand1).getImaginaryPart() - ((Complex) operand2).getImaginaryPart());
            System.out.println((char) 27 + "[31mРезультат: (" + operand1.toString() + ") - (" + operand2.toString() + ") = " + newC.toString() + (char)27 + "[0m");
            ml.doLog(new Logger(String.format("%s - %s = %s", operand1.toString(), operand2.toString(), newC.toString())));
        }

    }
    public void mult(Number operand1, Number operand2){
        if (operand1 instanceof Rational && operand2 instanceof Rational){
            Double newR = ((Rational) operand1).getNumber() * ((Rational) operand2).getNumber();
            System.out.println((char) 27 + "[31mРезультат: " + operand1.toString() + " * "+operand2.toString() + " = " + String.format("%.4f",newR) + (char)27 + "[0m");
            ml.doLog(new Logger(String.format("%s * %s = %s", operand1.toString(), operand2.toString(), newR.toString())));
        }
        if(operand1 instanceof Complex && operand2 instanceof Complex){
            Complex newC = new Complex();
            newC.setRealPart(((Complex) operand1).getRealPart() * ((Complex) operand2).getRealPart() -
                             ((Complex) operand1).getImaginaryPart() * ((Complex) operand2).getImaginaryPart());
            newC.setImaginaryPart(((Complex) operand1).getRealPart() * ((Complex) operand2).getImaginaryPart() +
                                  ((Complex) operand1).getImaginaryPart() * ((Complex) operand2).getRealPart());
            System.out.println((char) 27 + "[31mРезультат: (" + operand1.toString() + ") * (" + operand2.toString() + ") = " + newC.toString() + (char)27 + "[0m");
            ml.doLog(new Logger(String.format("%s * %s = %s", operand1.toString(), operand2.toString(), newC.toString())));
        }

    }
    public void div(Number operand1, Number operand2){
        if (operand1 instanceof Rational && operand2 instanceof Rational){
            Double newR = ((Rational) operand1).getNumber() / ((Rational) operand2).getNumber();
            System.out.println((char) 27 + "[31mРезультат: " + operand1.toString() + " / "+operand2.toString() + " = " + String.format("%.4f",newR) + (char)27 + "[0m");
            ml.doLog(new Logger(String.format("%s / %s = %s", operand1.toString(), operand2.toString(), newR.toString())));
        }
        if(operand1 instanceof Complex && operand2 instanceof Complex){
            Complex newC = new Complex();
            newC.setRealPart((((Complex) operand1).getRealPart() * ((Complex) operand2).getRealPart() +
                              ((Complex) operand1).getImaginaryPart() * ((Complex) operand2).getImaginaryPart()) /
                    (Math.pow(((Complex) operand2).getRealPart(), 2) + Math.pow(((Complex) operand2).getImaginaryPart(),2)));
            newC.setImaginaryPart((((Complex) operand1).getImaginaryPart() * ((Complex) operand2).getRealPart() -
                              ((Complex) operand1).getRealPart() * ((Complex) operand2).getImaginaryPart()) / 
                    (Math.pow(((Complex) operand2).getRealPart(), 2) + Math.pow(((Complex) operand2).getImaginaryPart(),2)));
            System.out.println((char) 27 + "[31mРезультат: (" + operand1.toString() + ") / (" + operand2.toString() + ") = " + newC.toString() + (char)27 + "[0m");
            ml.doLog(new Logger(String.format("%s / %s = %s", operand1.toString(), operand2.toString(), newC.toString())));
        }

    }
}