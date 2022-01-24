class School {
  type DB = Map[Int, Seq[String]]

  private var _db: DB = Map[Int, Seq[String]] ()

  def add(name: String, g: Int): Unit = _db = _db + (g -> (grade(g) :+ name))

  def db: DB = _db

  def grade(g: Int): Seq[String] = _db.getOrElse(g, Seq())

  def sorted: DB = Map(_db.toSeq.sortBy(_._1):_*).mapValues(_.sorted)
}