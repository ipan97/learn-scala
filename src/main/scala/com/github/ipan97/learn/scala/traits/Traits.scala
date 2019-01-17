package com.github.ipan97.learn.scala.traits

import scala.collection.mutable.ArrayBuffer

/**
  * @author Ipan Taufik Rahman
  */
object Traits {

  trait HairColor {

  }

  trait Iterator[A] {
    def hasNext: Boolean

    def next(): A
  }

  class IntIterator(to: Int) extends Iterator[Int] {
    private var current = 0

    override def hasNext: Boolean = current < to

    override def next(): Int = {
      if (hasNext) {
        val t = current
        current += 1
        t
      } else 0
    }
  }

  trait Pet {
    val name: String
  }

  class Cat(val name: String) extends Pet

  class Dog(val name: String) extends Pet

  def main(args: Array[String]): Unit = {
    val iterator = new IntIterator(10)
    println(iterator.next())
    if (iterator.hasNext) {
      println(iterator.next())
    }

    val dog = new Dog("Harry")
    val cat = new Dog("Sally")

    val animals = ArrayBuffer.empty[Pet]
    animals.append(dog)
    animals.append(cat)
    animals.foreach(pet => println(pet.name))
  }
}
