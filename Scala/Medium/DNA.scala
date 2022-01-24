class DNA(strand: String){
  val nucleotides = List('A', 'C', 'G', 'T')
  val nucleotideCounts: Either[String, Map[Char, Int]] = {
    lazy val ns = (nucleotides.map(_ -> 0).toMap ++ strand.filter(x => nucleotides.contains(x)).groupBy(identity).mapValues(_.length))
    val total = ns.foldLeft(0)(_+_._2)
    if (total == strand.length) Right(ns) else Left("Invalid strand")
  }
}
