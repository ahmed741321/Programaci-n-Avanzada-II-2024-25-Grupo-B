def reverse[A](l: List[A]): List[A] = {
  l.foldLeft(List[A]())((acc, x) => x :: acc)
}

def append[A](l1: List[A], l2: List[A]): List[A] = {
  l2.foldLeft(l1)((acc, x) => acc.appended(x))
}


reverse(List(1,2,3))
append(List(1,2,3),List(1,2))