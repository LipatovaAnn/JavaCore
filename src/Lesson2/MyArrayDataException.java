package Lesson2;

public class MyArrayDataException extends Exception{
    int i;
    int j;
    public MyArrayDataException (String message, int i, int j) {
        super(message);
        this.i=i;
        this.j=j;
    }
}
