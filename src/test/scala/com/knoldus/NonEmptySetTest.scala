package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class NonEmptySetTest extends AnyFlatSpec {

  val nonEmpty: Set[SetHelper] = new EmptySet[SetHelper].incl(SetHelper(2)).incl(SetHelper(5))

  "A condition" should "insert the value in the set" in {
    val updatedIntSet = nonEmpty.incl(SetHelper(3))
    assert(updatedIntSet.contains(SetHelper(3)))
  }
  "A condition" should "return true if element already exits" in {
    assert(nonEmpty.contains(SetHelper(2)))
  }
  "A condition" should "return false if element does not exits" in {
    assert(!nonEmpty.contains(SetHelper(4)))
  }
}