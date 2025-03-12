class Tiger(dangerous: Boolean,var name: String) {
  var dangerous1: Boolean = dangerous
  var name2: String = name
}

@main
def main3(): Unit =
  val tiger = new Tiger(true, "Tiger")
  println(tiger.dangerous1)
  println(tiger.name)
