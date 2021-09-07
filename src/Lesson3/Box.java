package Lesson3;

import java.lang.reflect.Array;

public class Box <T extends Fruit> {
    T[] fruits;

    public Box(T[] fruits) {
        this.fruits = fruits;
    }

    public float getWeight() {
        if (this.fruits.length==0) {return 0f;}
        Fruit fruit=this.fruits[0];
        float fruitWeight = fruit.getWeight();
        return (this.fruits.length * fruitWeight);
    }

    public boolean isCompare(Box<?> box) {
        float weight = this.getWeight();
        return weight == box.getWeight();
    }

    public void swap(Box<T> newBox){
        T[] fruits = newBox.fruits;
        newBox.fruits=this.fruits;
        this.fruits = fruits;
    }
}
