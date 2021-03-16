package com.able;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Returns {@code true} if the iteration has more elements.
 * (In other words, returns {@code true} if {@link #next} would
 * return an element rather than throwing an exception.)
 *
 * @return {@code true} if the iteration has more elements
 */
/**
 *如果迭代有更多元素，则返回{@code true}。
 *（换句话说，如果{@link\next}将返回{@code true}
 *返回元素，而不是抛出异常。）
 *
 *@return{@code true}如果迭代有更多元素
 */

//boolean hasNext();

/**
 //boolean hasNext();
 /**
 * Returns the next element in the iteration.
 *
 * @return the next element in the iteration
 * @throws NoSuchElementException if the iteration has no more elements
 */

/**
 *返回迭代中的下一个元素。
 *@返回迭代中的下一个元素
 *@如果迭代没有更多元素，则抛出nosuchementException
 */
//E next()
public class Interator {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Iterator<String> it=list.iterator();
        //out:it====>java.util.ArrayList$Itr@4554617c
        System.out.println("it====>"+it);

        while (it.hasNext()){
            String str = it.next();
        //out:a b c d
            System.out.println(str);
        }
    }
}
