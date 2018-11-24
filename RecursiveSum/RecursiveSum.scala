object RecursiveSum extends App {
  val intList:List[Int] = args.toList.map(_.toInt)
  def sum(ints: List[Int]): Int = {
      ints match {
        case Nil => 0
        case x :: tail => x + sum(tail)
      }
    }
  println(sum(intList))
}
