package com.knoldus

class NonEmptySet[A <: Ordered[A]](element: A, left: Set[A], right: Set[A]) extends Set[A] {
  def contains(value: A): Boolean = value match {
    case a if a < element => left.contains(a)
    case b if b > element => right.contains(b)
    case _ => true
  }

  def incl(value: A): Set[A] = value match {
    case a if a < element => new NonEmptySet(element, left.incl(a), right)
    case b if b > element => new NonEmptySet(element, left, right.incl(b))
    case _ => this
  }
}