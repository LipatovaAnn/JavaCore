package Lesson3;

public class Lesson3 {

    public static void main(String[] args) {
        Integer[] intArray = new Integer[4];
        intArray[0]=1;
        intArray[1]=12;
        intArray[2]=32;
        intArray[3]=49;
        Float[] floatArray = new Float[4];
        floatArray[0]=0.14f;
        floatArray[1]=1.19f;
        floatArray[2]=34.84f;
        floatArray[3]=56.56f;


        ArrayElement<Integer> el1 = new ArrayElement<Integer>();
        System.out.println("before");
        el1.print(intArray);
        el1.swap(intArray, 1, 3);
        System.out.println();
        System.out.println("after");
        el1.print(intArray);
        System.out.println();

        ArrayElement<Float> el2 = new ArrayElement<Float>();
        System.out.println("before");
        el2.print(floatArray);
        el2.swap(floatArray, 1, 3);
        System.out.println();
        System.out.println("after");
        el2.print(floatArray);

        Orange[] oranges=new Orange[4];
        oranges[0]=new Orange();
        oranges[1]=new Orange();
        oranges[2]=new Orange();
        oranges[3]=new Orange();
        Box<Orange> orangeBox= new Box<Orange>(oranges);

        float orangesWeight=orangeBox.getWeight();
        System.out.println("Weight of this box oranges: " + orangesWeight);

        Apple[] apples=new Apple[4];
        apples[0]=new Apple();
        apples[1]=new Apple();
        apples[2]=new Apple();
        apples[3]=new Apple();
        Box<Apple>appleBox=new Box<Apple>(apples);

        float applesWeight=appleBox.getWeight();
        System.out.println("Weight of this box apples: " + applesWeight);

        System.out.println("Are weight of appleBox and weight of orangeBox similar? ");
      System.out.println(orangeBox.isCompare(appleBox));

        Box<Orange>emptyBox=new Box<Orange>(new Orange[0]);
        System.out.println(orangeBox.getWeight());
        System.out.println(emptyBox.getWeight());
        orangeBox.swap(emptyBox);
        System.out.println(orangeBox.getWeight());
        System.out.println(emptyBox.getWeight());


    }

}
