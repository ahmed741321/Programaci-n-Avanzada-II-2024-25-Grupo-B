//there ar an error en functions
def compose[A](lf: List[A => A], v: A): A = {
  lf.foldRight(v)((f, acc) => f(acc))
}
compose(List[Int => Int](Math.pow(_, 2).toInt, _ + 2), 5)