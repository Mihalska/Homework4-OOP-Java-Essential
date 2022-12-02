package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть тип документа (DOC, TXT або XML)");
        String a = input.next();
        if (a.equals("DOC")) {
            AbstractHandler d = new DOCHandler("DOC");
            d.open();
            d.create();
            d.change();
            d.save();
        } else if (a.equals("TXT")) {
            AbstractHandler t = new TXTHandler("TXT");
            t.open();
            t.create();
            t.change();
            t.save();
        } else if (a.equals("XML")) {
            AbstractHandler x = new XMLHandler("XML");
            x.open();
            x.create();
            x.change();
            x.save();
        } else {
            System.out.println("Ви ввели невірний тип документа");
        }
    }
}


