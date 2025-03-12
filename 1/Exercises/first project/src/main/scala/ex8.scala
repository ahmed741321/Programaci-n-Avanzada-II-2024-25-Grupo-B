import java.io.{File, PrintWriter}
//unPure Functions
def writeFile(content: String): Unit = {
  val writer = new PrintWriter(new File("output.txt"))
  writer.write(content)
  writer.close()
}
//Pure Functions
def generateFileContent(data: String): String = s"Content: $data"

@main
def ex8(): Unit = {
  writeFile("asdadsas")
}