object Bob {

  def hasletters(statement: String): Boolean = statement.matches(".*[a-zA-Z].*")

  def shouting(statement: String): Boolean = statement.toUpperCase == statement && hasletters(statement)

  def questioning(statement: String): Boolean = statement.trim.endsWith("?")

  def response(statement: String): String = {
      statement match {
        case _ if statement.trim.isEmpty => "Fine. Be that way!"
        case _ if questioning(statement) && shouting(statement) => "Calm down, I know what I'm doing!"
        case _ if shouting(statement) => "Whoa, chill out!"
        case _ if questioning(statement) => "Sure."
        case _ => "Whatever."
    }
  }
}
