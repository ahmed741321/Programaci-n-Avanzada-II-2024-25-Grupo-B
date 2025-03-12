def zip[A, B](list1: List[A], list2: List[B]): List[(A, B)] = {
  def zipPrime(list1: List[A], list2: List[B], acc: List[(A, B)]): List[(A, B)] = {
    if (list1.isEmpty && list2.isEmpty) acc
    else zipPrime(list1.tail, list2.tail, acc :+ (list1.head, list2.head))
  }

  zipPrime(list1, list2, Nil);
}

zip(List(10, 20, 30), List('a', 'b', 'c'))