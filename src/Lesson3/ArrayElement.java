package Lesson3;

public class ArrayElement<T> {
   /* T value;

    public ArrayElement(T value) {
        this.value = value;
    }

    void showType() {
        System.out.println("Тип Т - это " + value.getClass().getName());
    }
*/
    public void print(T[] arr){
        for (int i=0; i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    public void swap(T[] arr, int ind1, int ind2) {
        T temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
}