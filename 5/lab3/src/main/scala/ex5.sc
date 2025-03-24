def unzip[A, B](l: List[(A, B)]): (List[A], List[B]) = {
  l.foldRight((List[A](), List[B]()))((x, acc) => ((x._1 :: acc._1, x._2 :: acc._2)))
}

unzip(List((1, "a"), (2, "b"), (3, "c")))