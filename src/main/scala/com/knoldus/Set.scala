package com.knoldus

trait Set[A <: Ordered[A]] {
  def incl(value: A): Set[A]
  def contains(value: A): Boolean
}