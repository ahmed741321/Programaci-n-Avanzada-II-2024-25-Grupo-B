import scala.io.StdIn

object ConsoleColors {
  val Reset = "\u001B[0m" // إعادة تعيين اللون
  val Black = "\u001B[30m" // أسود
  val Red = "\u001B[31m" // أحمر
  val Green = "\u001B[32m" // أخضر
  val Yellow = "\u001B[33m" // أصفر
  val Blue = "\u001B[34m" // أزرق
  val Magenta = "\u001B[35m" // بنفسجي
  val Cyan = "\u001B[36m" // سيتروس
  val White = "\u001B[37m" // أبيض
}

class User(private val username: String, private val Password: String) {
  def getUsername: String = username

  def getPassword: String = Password
}

class ATM(private val user: User, private var withdraw: Double) {
  def getWithdraw: Double = withdraw

  def setWithdraw(withdraw: Double) = {
    this.withdraw += withdraw;
  }
}


def CheckUser(user1: User, user2: User): Boolean =
  (user1.getPassword == user2.getPassword && user1.getUsername == user2.getUsername)

@main
def ex2(): Unit = {

  val user1: User = new User("Ahmet", "123");
  val atm: ATM = new ATM(user1, 500);

  var username, password: String = "";
  println("please enter you username and password");
  username = StdIn.readLine()
  password = StdIn.readLine()

  val newUser: User = new User(username, password);
  if (CheckUser(user1, newUser)) {
    var islam: Int = 0;
    println("Success login in")
    println("----------------")
    println(f"your withdraw is ${atm.getWithdraw}")
    println("do you wont to deposit money: \n (1): yes \n (0): no")
    islam = StdIn.readInt();
    if (islam == 1) {
      var deposit_money: Double = 0;
      println("please enter the deposit money value")
      deposit_money = StdIn.readDouble()
      if (deposit_money > 0) {
        atm.setWithdraw(deposit_money)
        println(f"Success deposit money your Withdraw now is ${atm.getWithdraw}%.2f")
      }
      else {
        println(s"${ConsoleColors.Red} Invalid deposit money ${ConsoleColors.Reset}")
      }
    }

    println("do you wont to Withdraw money: \n (1): yes \n (0): no")
    islam = StdIn.readInt();

    if (islam == 1) {
      var withdraw_money: Double = 0;
      println("please enter the deposit money value")

      withdraw_money = StdIn.readDouble()
      if (withdraw_money > 0) {
        atm.setWithdraw(-withdraw_money)
        println(f"Success deposit money your Withdraw now is ${atm.getWithdraw}%.2f")
      }
      else {
        println(s"${ConsoleColors.Red} Invalid Withdraw money ${ConsoleColors.Reset}")
      }
    }

    println(s"${ConsoleColors.Green} Good bay and have a nice day ${ConsoleColors.Reset}")

  }
  else {
    println("Invalid User Name and Password")
  }
}

