package com.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleTheListElements {

	public static void main(String[] args) {
		List<Integer> initialArray = new ArrayList<>();
        initialArray.add(1);
        initialArray.add(2);
        initialArray.add(3);
        initialArray.add(4);
        initialArray.add(5);
        initialArray.add(6);
        initialArray.add(7);

        Collections.shuffle(initialArray);
        System.out.println(initialArray);

	}

}
