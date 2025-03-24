val warehouse1 = Map("laptop" -> 5, "mouse" -> 20, "keyboard" -> 10)
val warehouse2 = Map("laptop" -> 3, "mouse" -> 15, "monitor" -> 8)

val combinedInventory = (warehouse1.toSeq ++ warehouse2.toSeq)
  .groupBy(_._1) // Group by the item name
  .map { case (item, counts) => (item, counts.map(_._2).sum) } // Sum the quantities