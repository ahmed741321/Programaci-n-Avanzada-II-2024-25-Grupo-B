package practica_22

import scala.annotation.tailrec

sealed abstract class Tree[+T]
case object Leaf extends Tree[Nothing]
case class Node[T](elem: T,
                   left: Tree[T] = Leaf,
                   right: Tree[T] = Leaf) extends Tree[T]

def inOrder[T](t: Tree[T]): List[T] =
  t match {
    case Node(e, l, r) => inOrder(l) ::: e :: inOrder(r)
    case Leaf => List()
  }

def levelOrder[T](tree: Tree[T]): List[T] = {
  @tailrec
  def loop(q: ImmutableQueue[Tree[T]], acc: List[T]): List[T] =
    if q.isEmpty then acc
    else
      val (n, tail) = q.dequeue()
      n match
        case Node(v, l, r) => loop(tail.enqueue(l).enqueue(r), acc :+ v)
        case Leaf => loop(tail, acc)

  loop(EfficientQueue[Tree[T]]().enqueue(tree), List())
}

val t = Node(2,
  Node(7,
    Node(2, Leaf, Leaf),
    Node(6,
      Node(5, Leaf, Leaf),
      Node(11, Leaf, Leaf)
    )
  ),
  Node(5,
    Leaf,
    Node(9,
      Node(4, Leaf, Leaf),
      Leaf
    )
  )
)

@main def testEfficientQueue(): Unit = {
  assert(inOrder(t) == List(2, 7, 5, 6, 11, 2, 5, 4, 9))
  assert(levelOrder(t) == List(2, 7, 5, 2, 6, 9, 5, 11, 4))
}
