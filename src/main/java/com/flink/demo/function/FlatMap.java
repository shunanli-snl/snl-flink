package com.flink.demo.function;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.util.Collector;

public class FlatMap implements FlatMapFunction {

    @Override
    public void flatMap(Object o, Collector collector) throws Exception {
        String[] tmp = o.toString().split(" ");
        for (String s : tmp){

        }
    }
}
