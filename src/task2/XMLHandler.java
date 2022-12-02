package task2;

public class XMLHandler extends AbstractHandler {
   public String type;

    public XMLHandler(String type) {
        this.type = type;
    }

    @Override
    void open() {
        System.out.println("Open XML-document");

    }
    @Override
    void create() {
        System.out.println("Create XML-document");

    }

    @Override
    void change() {
        System.out.println("Change XML-document");

    }

    @Override
    void save() {
        System.out.println("Save XML-document");

    }
}
