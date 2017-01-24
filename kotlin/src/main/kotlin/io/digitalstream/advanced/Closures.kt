/**
 * Created by sebby on 9/26/16.
 */
package io.digitalstream.advanced

object Closures {

  fun run(): Unit {
    val num = 5
    val plus_num = { x: Int -> x + num }
    println("plus_num is ${plus_num(5)}")
  }
}
