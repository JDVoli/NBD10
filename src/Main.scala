object Main extends App{

  def zad1(): Iterator[(Int,Int)] = for {
    it <- Iterator.from(0)
    divider <- 1 until it

    if it%divider == 0


  } yield (it, divider)


  val buffColl = zad1().buffered


  println(buffColl.next())
  println(buffColl.next())
  println(buffColl.next())
  println(buffColl.next())
  println(buffColl.next())
  println(buffColl.next())

  buffColl take 10 foreach println

  println(buffColl.next())
  println(buffColl.next())
  println(buffColl.next())
  println(buffColl.next())


}


