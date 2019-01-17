package com.github.ipan97.learn.scala.scalaforjavadeveloper

import java.util.{Date, Locale}
import java.text.DateFormat._

/**
  * @author Ipan Taufik Rahman
  */
object FrenchDate {
  def main(args: Array[String]): Unit = {
    val now = new Date()
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now)
  }
}
