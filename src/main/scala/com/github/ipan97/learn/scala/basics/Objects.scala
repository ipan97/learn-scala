package com.github.ipan97.learn.scala.basics

/**
  * @author Ipan Taufik Rahman
  */
object Objects extends App {

  object IdFactory {
    private var counter = 0

    def create(): Int = {
      counter += 1
      counter
    }
  }

  val newId: Int = IdFactory.create()
  println(newId)
  val newerId = IdFactory.create()
  println(newerId)

}
