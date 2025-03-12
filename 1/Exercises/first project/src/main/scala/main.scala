object Main2 {
    def main(args: Array[String]): Unit = {
        val capital = Map(
            "Spain" -> "Madrid",
            "Russia" -> "Moskow",
            "Germany" -> "Berlin"
        );
        val country = "Spain";
        println(capital(country));
    }
}