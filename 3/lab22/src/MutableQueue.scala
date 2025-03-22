
import scala.collection.mutable.ArrayBuffer

trait MutableQueue[T] {
  def enqueue(elem: T): Unit

  def dequeue(): Option[T]

  def isEmpty: Boolean
}

class ArrayQueue[T](elems: T*) extends MutableQueue[T]{
  private val buffer = ArrayBuffer[T](elems: _*)

  def enq
}

// def enqueue(elem: T): Unit = ...
// def dequeue(): Option[T] = ...
// def isEmpty: Boolean = ...
// override def toString: String = ...
// override def equals(obj: Any): Boolean = ...
// override def hashCode(): Int = ...


@main
def testMutableQueue(): Unit = {
  val queue = new ArrayQueue(1, 2, 3)
  queue.enqueue(4)
  assert(queue.dequeue().contains(1), "The first element of the queue should be 1")
  assert(!queue.isEmpty, "The queue should not be empty")
  assert(queue == new ArrayQueue(2, 3, 4), "The two queues should be equal")
  assert(queue.hashCode() == new ArrayQueue(2, 3, 4).hashCode(), "The hash codes of the two queues should be equal")
  assert(queue.toString == "Queue(2, 3, 4)", s"The string representation of ${queue} should be 'Queue(2, 3, 4)'")
  assert(new ArrayQueue[String]().dequeue() == None, "Dequeuing from an empty queue should return None")
}
