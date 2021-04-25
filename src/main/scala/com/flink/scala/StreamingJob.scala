package com.flink.scala

import org.apache.flink.streaming.api.scala._
import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment

object StreamingJob {
  def main(args: Array[String]): Unit = {
    val stream : StreamExecutionEnvironment = StreamExecutionEnvironment.getExecutionEnvironment

    stream.setParallelism(1)

    val ds: DataStream[String] = stream.socketTextStream("h101",9001)

    val result: DataStream[(String,Int)] = ds.flatMap(_.split(" "))
        .map((_, 1))
        .setParallelism(1)
        .keyBy(0)
        .sum(1)

    result.print()

    stream.execute("Streaming Demo")
  }
}
