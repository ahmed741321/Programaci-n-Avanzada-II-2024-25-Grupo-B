def exists[A](l: List[A], f: A => Boolean): Boolean = {
  l.foldRight(false)((x, acc) => (acc || f(x)))
}

exists(List(1,2,3),_>2)
exists(List("Hola","Mundo"),_.length>=5)
exists(List("Hola","Mundo"),_.length<3)