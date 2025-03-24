def inits[A](l: List[A]): List[List[A]] = {
  l.foldRight(List[List[A]](List())) { (elem, acc) =>
    acc match {
      case Nil => List(List(elem))  // If the accumulator is empty, just add the element
      case head :: tail => (elem :: head) :: acc  // Add the element to the head and keep the rest of the accumulator
    }
  }
}

inits(List(1,2,3))
inits(List(3))
inits(List())






















































