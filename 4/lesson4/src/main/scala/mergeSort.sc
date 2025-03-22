def mergeIt(l1: Array[Int], l2: Array[Int], lista: Array[Int]) =
  var i = 0
  var j = 0
  var k = 0
  while i < l1.length && j < l2.length do
    if (l1(i) <= l2(j)) then
      lista(k) = l1(i);
      i += 1
    else
      lista(k) = l2(j);
      j += 1
      k += 1
  while i < l1.length do
    lista(k) = l1(i);
    i += 1;
    k += 1
  while j < l2.length do
    lista(k) = l2(j);
    j += 1;
    k += 1


val l1 = Array(1, 4, 7)
val l2 = Array(2, 5, 6)
val lista = new Array[Int](l1.length + l2.length)
mergeIt(l1, l2, lista)
println(lista.mkString(", "))
