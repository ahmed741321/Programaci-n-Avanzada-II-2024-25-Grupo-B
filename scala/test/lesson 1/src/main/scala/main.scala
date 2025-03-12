// Scala Basics: Variables, Functions, Classes, and Inheritance

@main
def run(): Unit = {
  // Immutable variable (val)
  val immutableVar: Int = 10
  println(s"Immutable Variable: $immutableVar")

  // Mutable variable (var)
  var mutableVar: String = "Hello"
  mutableVar = "Hello, Scala!"
  println(s"Mutable Variable: $mutableVar")

  // Lazy evaluation
  lazy val lazyValue: String = {
    println("Computing lazy value...")
    "Lazy Initialized"
  }
  println(lazyValue) // يتم حسابه عند أول استدعاء فقط

  // Data types
  val num: Int = 42
  val pi: Double = 3.14
  val isScalaFun: Boolean = true
  val letter: Char = 'A'
  println(s"Number: $num, Pi: $pi, Boolean: $isScalaFun, Char: $letter")

  // 2. Functions
  def add(a: Int, b: Int): Int = a + b

  println(s"Addition: ${add(5, 10)}")

  // Function with default parameter
  def greet(name: String = "User"): String = s"Hello, $name!"

  println(greet())
  println(greet("Scala"))

  // 3. Control Structures
  val age = 20
  if (age >= 18) println("You are an adult") else println("You are a minor")

  // Pattern Matching
  def matchExample(x: Any): String = x match {
    case 1 => "One"
    case "Scala" => "Awesome Language"
    case true => "Boolean True"
    case _ => "Unknown"
  }

  println(matchExample("Scala"))

  // Looping
  for (i <- 1 to 5) println(s"Loop iteration: $i")

  var count = 0
  while (count < 3) {
    println(s"While Loop: $count")
    count += 1
  }

  // 4. Collections
  val myList: List[Int] = List(1, 2, 3, 4, 5)
  val mySet: Set[String] = Set("Scala", "Java", "Python")
  val myMap: Map[String, Int] = Map("Alice" -> 25, "Bob" -> 30)
  println(s"List: $myList, Set: $mySet, Map: $myMap")

  // 5. Classes and Objects
  class Person(val name: String, val age: Int) {
    def greet(): String = s"Hello, my name is $name and I am $age years old."
  }

  val person = new Person("Alice", 25)
  println(person.greet())

  // 6. Inheritance
  class Animal {
    def sound(): String = "Some sound"
  }

  class Dog extends Animal {
    override def sound(): String = "Bark"
  }

  val dog = new Dog()
  println(s"Dog sound: ${dog.sound()}")

  // 7. Traits (Interface-like)
  trait Walker {
    def walk(): String = "Walking..."
  }

  class Robot extends Walker
  val robot = new Robot()
  println(robot.walk())

  // 8. Case Class (Immutable Data Model)
  case class Car(brand: String, model: String, year: Int)
  val car = Car("Tesla", "Model S", 2022)
  println(s"Car details: $car")

  // 9. Option Type (Handling Null Values Safely)
  def findUser(name: String): Option[String] =
    if (name == "Alice") Some("User found!") else None

  println(findUser("Alice").getOrElse("User not found"))
  println(findUser("Bob").getOrElse("User not found"))

  // 10. Singleton Object (No need to instantiate)
  object Utils {
    def square(x: Int): Int = x * x
  }
  println(s"Square of 4: ${Utils.square(4)}")
}
