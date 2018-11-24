object RecursiveSumWithAccumulator extends App {
  val intList:List[Int] = args.toList.map(_.toInt)
  def sum(ints: List[Int]): Int = {
    def sumAccumulator(ints: List[Int], accum: Int): Int = {
      ints match {
        case Nil => accum
        case x :: tail => sumAccumulator(tail, accum + x)
      }
    }
    sumAccumulator(ints, 0)
  }
  println(sum(intList))
}
