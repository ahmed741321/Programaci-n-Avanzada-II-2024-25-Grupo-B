def fRecursive(l: List[Int]): List[Int] = {
  def fRecursivePrime(l: List[Int], acc: List[Int]): List[Int] = {
    l match
      case ::(head, next) =>
        if (head > 0)
          fRecursivePrime(next, acc.appended(head))
        else
          fRecursivePrime(next, acc)

      case Nil => acc
  }

  fRecursivePrime(l, List())
}

def f(l: List[Int]): List[Int] = {
  l.filter((x) => x > 0)
}

fRecursive(List(1, -2, 3, -4, -5, 6))
f(List(1, -2, 3, -4, -5, 6))