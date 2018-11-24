object RecursiveSumWithAccumulator extends App {
  /*
  A couple of options for passing the List of numbers
        1. If the list is known in advance replace the `intList` variable with the following value
        val intList:List[Int] = args.toList.map(_.toInt)
        2. If the List is a range of values use the program as is.
  */
  val intList:List[Int] = List.range(args(0).toInt, args(1).toInt)
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
