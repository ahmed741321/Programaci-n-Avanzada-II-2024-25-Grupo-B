package main
@main
def main(): Unit =
  val queue = new ArrayQueue(1, 2, 3)
  println(queue)
  queue.enqueue(4)
  println(queue)
  assert(queue.dequeue().contains(1), "The first element of the queue should be 1")
  //assert(queue.dequeue()==Some(1), "The first element of the queue should be 1") same

  assert(!queue.isEmpty, "The queue should not be empty")
  assert(queue == new ArrayQueue(2, 3, 4), "The two queues should be equal")
  assert(queue.hashCode() == new ArrayQueue(2, 3, 4).hashCode(), "The hash codes of the two queues should be equal")
  assert(queue.toString == "Queue(2, 3, 4)", s"The string representation of ${queue} should be 'Queue(2, 3, 4)'")
  assert(new ArrayQueue[String]().dequeue().isEmpty, "Dequeuing from an empty queue should return None")


