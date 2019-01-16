package com.github.ipan97.learn.scala.unifiedtypes

/**
  * @author Ipan Taufik Rahman
  */
object ScalaTypeHierarchy extends App {
  val list: List[Any] = List(
    "a string",
    723,
    'c',
    true,
    () => "an anonymous function returning a string"
  )

  list.foreach(element => println(element))
}
