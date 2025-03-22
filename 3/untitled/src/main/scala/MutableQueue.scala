package main
import scala.collection.mutable.ArrayBuffer

trait MutableQueue[T] {
  def enqueue(elem: T): Unit

  def dequeue(): Option[T]

  def isEmpty: Boolean
}

class ArrayQueue[T](elems: T*) extends MutableQueue[T] {
  private val buffer = ArrayBuffer[T](elems: _*)

  def enqueue(elem: T): Unit = {
    buffer.append(elem)
  }

  def dequeue(): Option[T] = {
    if buffer.isEmpty then
      None
    else
      Some(buffer.remove(0))
  }

  def isEmpty: Boolean =
    buffer.isEmpty


  override def toString: String =
    buffer.toString().replace("ArrayBuffer", "Queue")

  override def equals(obj: Any): Boolean = {
    obj match
      case that: ArrayQueue[T] => buffer.equals(that.buffer)
      case _ => false
    return true
  }

  override def hashCode(): Int =
    buffer.hashCode()
}

