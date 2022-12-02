package task5;

public class Fahrenheit extends ConverterTemperature {
    public  double   s;
    public double  result;

    public Fahrenheit(double s) {
        this.s = s;
    }

    @Override
    void convert() {
        result = s * 1.8000 + 32.00 ;
        System.out.println("При конвертації числа з градусів за шкалою Цельсія в градуси за шкалою Фаренгейта отримали " + result +" ℉" );
    }
}
