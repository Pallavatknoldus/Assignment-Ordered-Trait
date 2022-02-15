package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class EmptySetTest extends AnyFlatSpec {

  val empty = new EmptySet[SetHelper]

  "A condition" should "give true if insert a value in an empty set" in {
    val updatedSet = empty.incl(SetHelper(1))
    assert(updatedSet.contains(SetHelper(1)))
  }
}