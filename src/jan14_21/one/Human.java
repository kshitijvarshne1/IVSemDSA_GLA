package jan14_21.one;

public interface Human {
    int number = 4;
    // By default all attribute of any interface is static, public and final

    void breathe();
}

//Man is a Human
abstract class Man implements Human {
    @Override
    public void breathe() {

    }
}
