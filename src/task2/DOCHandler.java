package task2;

public class DOCHandler extends AbstractHandler {
    public String type;

    public DOCHandler(String type) {
        this.type = type;
    }

    @Override
    void open() {
        System.out.println("Open DOC-document ");

    }

    @Override
    void create() {
        System.out.println("Create DOC-document");

    }

    @Override
    void change() {
        System.out.println("Change DOC-document");

    }

    @Override
    void save() {
        System.out.print("Save DOC-document");

    }
}
