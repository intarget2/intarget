package com.intarget.fw;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by landiz on 16.09.15.
 */
public class TargetDataGenerator {

    static Random rnd = new Random();

    @DataProvider(name ="randomTargets")
    public static Iterator<Object[]> generateRandomTargets() {
        List<Object[]> list = new ArrayList<Object[]>();
        for (int i=0; i <1; i++){
            TargetObject target = new TargetObject().setName("name" + rnd.nextInt()).setUrl("testtarget.ru"+ rnd.nextInt()).setCondition("равен");
            list.add(new Object[] {target});
        }

        return list.iterator();
    }

    @DataProvider(name ="targetsFromFile")
    public static Iterator<Object[]> loadTargetsFromFile() {
        List<Object[]> list = new ArrayList<Object[]>();

        return list.iterator();
    }

//    public static void main (String[] args){
//        if (args.length < 2){
//            System.out.println("Необходмы 2 параметра: файл и количество");
//            return;
//        }
//
//        String file = args [0];
//        int count = Integer.parseInt(args [1]);
//
//        new TargetDataGenerator().generateDataToFile(file, count);
//
//    }

    private void generateDataToFile(String file, int count) {
    }
}
