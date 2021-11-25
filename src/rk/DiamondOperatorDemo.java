package rk;

public class DiamondOperatorDemo {

    public static void main(String[] args) {

        // operasi normal
        MyGeneric<String> p1 = new MyGeneric<String>();
        MyGeneric<Integer> p2 = new MyGeneric<Integer>();
        MyGeneric<Double> p3 = new MyGeneric<Double>();

        // operasi diamond
        MyGeneric<String> p4 = new MyGeneric<>();
        MyGeneric<Integer> p5 = new MyGeneric<>();
        MyGeneric<Double> p6 = new MyGeneric<>();

        //operasi normal
        MyGeneric<MyEntry<Integer, String>> buah = new MyGeneric<>();
        buah.push(new MyEntry<Integer, String>(3, "Mangga"));
        buah.push(new MyEntry<Integer, String>(4, "Rambutan"));
        buah.push(new MyEntry<Integer, String>(5, "Pisang"));
        buah.push(new MyEntry<Integer, String>(6, "Anggur"));
        buah.push(new MyEntry<Integer, String>(7, "Sirsak"));

        // operasi diamond
        MyGeneric<MyEntry<Integer, String>> buah2 = new MyGeneric<>();
        buah2.push(new MyEntry<>(3, "Mangga"));
        buah2.push(new MyEntry<>(4, "Rambutan"));
        buah2.push(new MyEntry<>(5, "Pisang"));
        buah2.push(new MyEntry<>(6, "Anggur"));
        buah2.push(new MyEntry<>(7, "Sirsak"));
    }
}