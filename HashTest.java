package hashFunctionMaker;

import edu.princeton.cs.algs4.StdIn;

public class HashTest {

    public static void main(String[] args) {
        hashFunctionMaker.HashMapPlayAround hashy = new hashFunctionMaker.HashMapPlayAround();
        int[] xaxis = new int[hashy.ourTable.length];
        for (int item : xaxis) {
            item = 0;
        }

        int count = 0;
        while (count < 200) {
            String[] line = StdIn.readString().split(" ");
            for (String s : line) {
                xaxis[hashy.altHash(s)] += 1;
            }
            count++;
        }

        for (int i = 0; i < xaxis.length; i++) {
            System.out.println(i + ": " + xaxis[i]);
        }
    }
}
