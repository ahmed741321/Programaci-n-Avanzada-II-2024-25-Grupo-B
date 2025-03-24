def remdups[A](lista: List[A]): List[A] = {
  lista.foldRight(List[A]())((elem, acc) =>
    if (acc.nonEmpty && acc.head == elem) acc else elem :: acc
  )
}

remdups(List(1, 1, 3, 3, 3, 2, 1, 2, 2, 1, 2))
