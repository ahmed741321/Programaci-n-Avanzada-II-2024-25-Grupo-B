@main
def main(): Unit =
  val capital = Map(
    "Spain" -> "Madrid",
    "Russia" -> "Moscow", 
    "Germany" -> "Berlin"
  )
  val country = "Spain"
  println(capital(country)) 
