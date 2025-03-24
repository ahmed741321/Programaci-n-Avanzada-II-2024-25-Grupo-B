def remdups[A](lista: List[A]): List[A] = {
  lista.foldRight(List[A]()) { (elem, acc) =>
    acc match {
      case head :: next if head == elem => acc  // Skip the duplicate
      case _ => elem :: acc  // Keep the element
    }
  }
}

println(remdups(List(1, 1, 3, 3, 3, 2, 1, 2, 2, 1, 2)))
