package task5;

public class Calvin extends ConverterTemperature  {
    public  double   s;
    public double  result;

    public Calvin (double  s) {
        this.s = s;
    }
    void convert(){
        result = s +  273.15 ;
        System.out.println("При конвертації числа з градусів за шкалою Цельсія в градуси за шкалою Кельвіна отримали " + result + " K ");

    }
}
