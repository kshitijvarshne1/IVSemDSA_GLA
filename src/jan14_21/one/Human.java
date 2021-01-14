package jan14_21.one;

public interface Human {
    int number = 4;
    // By default all attribute of any interface is static, public and final

    void breathe();
    //By default method is public and abstract
}

//Man is a Human
abstract class Man implements Human {
    @Override
    public void breathe() {
        System.out.println("Man breathe");
    }
}
