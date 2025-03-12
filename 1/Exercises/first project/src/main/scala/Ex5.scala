// Defining a class representing a car, allowing us to create multiple cars with different details
class Car(var brand: String, var model: String) {
  def show(): Unit = println(s"🚗 Car: $brand - Model: $model")
}

// Defining an object (Singleton) representing a car factory
object CarFactory {
  def createCar(brand: String, model: String): Car = new Car(brand, model)

  // Factory details
  val factoryName: String = "World Car Factory"

  def factoryInfo(): Unit = println(s"🏭 Factory: $factoryName")
}

@main
def mainEx4(): Unit = {
  // ✅ Using the class (creating multiple objects of type Car)
  val car1 = new Car("Toyota", "Corolla")
  val car2 = new Car("BMW", "X5")

  car1.show() // 🚗 Car: Toyota - Model: Corolla
  car2.show() // 🚗 Car: BMW - Model: X5

  // ✅ Using the object (calling factory methods and creating a car)
  CarFactory.factoryInfo() // 🏭 Factory: World Car Factory
  val car3 = CarFactory.createCar("Mercedes", "C-Class")
  car3.show() // 🚗 Car: Mercedes - Model: C-Class
}