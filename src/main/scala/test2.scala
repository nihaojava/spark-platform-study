object test2 {
	def main(args:Array[String]): Unit = {
		val oneTwo = List(1,2,3)

		val threeFour = List(3,4,5)

		val oneTwoThreeFour=oneTwo ::: threeFour

		println (oneTwo + " and " + threeFour + " were not mutated.")

		println ("Thus, " + oneTwoThreeFour + " is a new list")

	}
}