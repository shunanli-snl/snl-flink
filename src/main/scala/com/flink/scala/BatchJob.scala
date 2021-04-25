package com.flink.scala

import org.apache.flink.api.scala._
import org.apache.flink.api.scala.{DataSet, ExecutionEnvironment}

object BatchJob {
  def main(args: Array[String]): Unit = {
    val env: ExecutionEnvironment = ExecutionEnvironment.getExecutionEnvironment

    val ds: DataSet[String] = env.readTextFile("D:\\aa.txt")

    val result: AggregateDataSet[(String, Int)] = ds.flatMap(_.split(" "))
      .map((_, 1))
      .groupBy(0)
      .sum(1)

    result.print()
  }
}
