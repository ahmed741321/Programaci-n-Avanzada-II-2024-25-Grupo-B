package main
trait ImmutableQueue[T] {
  def enqueue(elem: T): ImmutableQueue[T]

  def dequeue(): (Option[T], ImmutableQueue[T])

  def isEmpty: Boolean
}

class SimpleQueue[T] private(private val elems: List[T]) extends ImmutableQueue[T] {
  def this(elems: T*) = {
    this(elems.toList)
  }

  def enqueue(elem: T): ImmutableQueue[T] = {
    new SimpleQueue(elems ++ List(elem))
    //new SimpleQueue(elem :: elems) //very quick operation
  }

  def isEmpty: Boolean = {
    elems.isEmpty
  }

  def dequeue(): (Option[T], ImmutableQueue[T]) = {
    elems match
      case Nil => (None, this)
      case x :: xs => (Some(x), new SimpleQueue(xs))
  }

  // ...
  override def toString: String = elems.toString().replace("List", "SimpleQueue")

  override def equals(obj: Any): Boolean = {
    obj match
      case that: SimpleQueue[T] => elems.equals(that.elems)
      case _ => false
  }

  override def hashCode(): Int = elems.hashCode()
}

@main
def testSimpleQueue(): Unit = {
  val squeue = new SimpleQueue[Int]()
  val q = squeue.enqueue(1).enqueue(2).enqueue(3).enqueue(4)
  assert(q.dequeue() == (Some(1), SimpleQueue(2, 3, 4)), s"${q.dequeue()} should be equal to (1, SimpleQueue(List(2, 3, 4)))")
  println(q)
  assert(squeue.isEmpty, s"{q} should be empty")
  assert(!q.isEmpty, s"{q should not be empty")
  val q2 = SimpleQueue(1, 2, 3, 4)
  assert(q == q2, s"${q} and ${q2} should be equal")
  assert(q.hashCode() == q2.hashCode(), s"The hash codes of ${q} and ${q2} should be equal")
}
