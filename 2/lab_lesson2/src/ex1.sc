def primeFactors(n: Int): List[Int] = {

  def Factors(number: Int, dividor: Int, factores: List[Int]): List[Int] = {
    if (number < 2) factores
    else if (number % dividor == 0) Factors(number / dividor, dividor, dividor :: factores)
    else Factors(number, dividor + 1, factores)
  }

  Factors(n, 2, List());
}
println(primeFactors(60))
