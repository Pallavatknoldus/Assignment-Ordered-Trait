package com.knoldus

case class SetHelper(value: Int) extends Ordered[SetHelper] {
  def compare(that: SetHelper): Int =
    if (this.value < that.value) -1
    else if (this.value > that.value) 1
    else 0
}