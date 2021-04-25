package com.flink.demo.function;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.util.Collector;

public class FlatMap implements FlatMapFunction<String, Tuple2<String,Integer>> {

    @Override
    public void flatMap(String s, Collector<Tuple2<String, Integer>> collector) throws Exception {
        for (String str : s.split(" ")){
            collector.collect(new Tuple2<String, Integer>(str, 1));
        }
    }
}
