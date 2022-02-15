package com.knoldus

class EmptySet[A <: Ordered[A]] extends Set[A] {
  def contains(value: A): Boolean = false
  def incl(value: A): Set[A] = new NonEmptySet(value, new EmptySet[A], new EmptySet[A])
}