package com.github.ipan97.learn.scala.scalaforjavadeveloper

/**
  * @author Ipan Taufik Rahman
  */
object TimerAnonymous {
  def oncePerSecond(callback: () => Unit) {
    while (true) {
      callback()
      Thread sleep 1000
    }
  }

  def main(args: Array[String]): Unit = {
    oncePerSecond(() => {
      println("time files like an arrow...")
    })
  }
}
