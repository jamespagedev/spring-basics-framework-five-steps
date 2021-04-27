package com.in28minutes.jp.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service // @Service used for business logic
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers){
        // Logic for Quick Sort
        return numbers;
    }
}
