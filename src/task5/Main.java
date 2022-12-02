package task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Введіть число градусів за шкалою Цельсія для конвертації");
    double  S =  input.nextDouble() ;

    ConverterTemperature c = new Calvin(S );
    ConverterTemperature f = new Fahrenheit(S);
    c.convert() ;
    f.convert() ;
}
}
