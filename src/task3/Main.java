package task3;

public class Main {
    public static void main(String[] args) {
        Playable p = new Player() ;
        Recodable  r = new Player() ;
        p.play() ; p.pause() ; p.stop() ;
        System.out.print("\n");
        r.record() ; r.pause() ; r.stop() ;
    }
}
