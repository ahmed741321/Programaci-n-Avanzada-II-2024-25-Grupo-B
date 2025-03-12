def unzip[A, B](list: List[(A, B)]): (List[A], List[B]) = {

  def unzipPrime(list: List[(A, B)], list1: List[A], list2: List[B], acc: (List[A], List[B])): (List[A], List[B]) = {
    list match {
      case Nil => acc
      case (x,y) :: tail  => unzipPrime(tail, list1 :+ x, list2 :+ y, (list1 :+ x, list2 :+ y))
    }
  }

  unzipPrime(list, List[A](), List[B](), (List[A](), List[B]()));
}

println(unzip(List((10, 'a'), (20, 'b'), (10, 'c'))))