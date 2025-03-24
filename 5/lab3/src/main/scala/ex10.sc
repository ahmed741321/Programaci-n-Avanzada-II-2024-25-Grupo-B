//normal
def halfEven(l1: List[Int], l2: List[Int]): List[Int] = {
  List().appended(l1.count((x) => (x % 2 == 0))).appended(l2.count((x) => (x % 2 == 0)))
}

def halfEvenTilRecursive(l1: List[Int], l2: List[Int]): List[Int] = {
  def halfEvenRecursivePrime(l1: List[Int], l2: List[Int], count1: Int, count2: Int): List[Int] = {
    (l1, l2) match {
      case (head1 :: tail1, head2 :: tail2) =>
        if (head1 % 2 == 0) halfEvenRecursivePrime(tail1, l2, count1 + 1, count2)
        else if (head2 % 2 == 0) halfEvenRecursivePrime(l1, tail2, count1, count2 + 1)
        else halfEvenRecursivePrime(tail1, tail2, count1, count2)
      case (head1 :: tail1, Nil) =>
        if (head1 % 2 == 0) halfEvenRecursivePrime(tail1, Nil, count1 + 1, count2)
        else halfEvenRecursivePrime(tail1, Nil, count1, count2)
      case (Nil, head2 :: tail2) =>
        if (head2 % 2 == 0) halfEvenRecursivePrime(Nil, tail2, count1, count2 + 1)
        else halfEvenRecursivePrime(Nil, tail2, count1, count2)
      case (Nil, Nil) => List(count1, count2)
    }
  }

  halfEvenRecursivePrime(l1, l2, 0, 0)
}


halfEven(List(1, 2, 3, 4), List(3, 2, 4))
halfEvenTilRecursive(List(1, 2, 3, 4), List(3, 2, 4))