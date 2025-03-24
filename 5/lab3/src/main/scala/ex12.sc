val sales = List(
  ("Laptop", 2, 1000.0),
  ("Mouse", 10, 15.0),
  ("Keyboard", 5, 50.0),
  ("Monitor", 3, 200.0),
  ("USB Drive", 20, 4.0)
)

//1
var revenue: Double = 0
sales.map((x) => revenue = revenue + x._3 * x._2)
println(revenue)

//2
sales.filter((x) => x._2 * x._3 >= 100).map((x) => (x._1, x._2 * x._3))
