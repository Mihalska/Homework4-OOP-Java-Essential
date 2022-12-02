package task3;

public class Player implements Playable, Recodable  {
    public void play(){
        System.out.print("Початок програми програвання, ");
    }
    public void pause (){
        System.out.print("пауза, ");

    }
    public void stop(){
        System.out.print("завершення. ");

    }
    public void record(){
        System.out.print("Початок програми запису, ");

    }
}
