val logs = List(
  "ERROR: Null pointer exception",
  "INFO: User logged in",
  "ERROR: Out of memory",
  "WARNING: Disk space low",
  "INFO: File uploaded",
  "ERROR: Database connection failed"
)

// Step 1: Count the number of messages of each type
val countMap = logs.groupBy(_.split(":")(0)).map {
  case (key, value) => (key, value.size)
}

// Step 2: Extract the error messages
val errorMessages = logs.filter(_.startsWith("ERROR"))

// Output the results
println(countMap)  // HashMap(WARNING -> 1, ERROR -> 3, INFO -> 2)
println(errorMessages)  // List(ERROR: Null pointer exception, ERROR: Out of memory, ERROR: Database connection failed)