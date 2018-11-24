object RecursiveSum extends App {
  /*
  A couple of options for passing the List of numbers
	1. If the list is known in advance replace the `intList` variable with the following value
  	val intList:List[Int] = args.toList.map(_.toInt)
	2. If the List is a range of values use the program as is. 
  */
  val intList:List[Int] = List.range(args(0).toInt, args(1).toInt)
  //The sum function below can result in StackOverflow if range is too big
  def sum(ints: List[Int]): Int = {
      ints match {
        case Nil => 0
        case x :: tail => x + sum(tail)
      }
    }
  println(sum(intList))
}
