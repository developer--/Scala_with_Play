package model

import sorm._
/**
  * Created by Jemo on 7/6/16.
  */
object DB extends Instance(entities = Seq(Entity[Person]()), url = "jdbc:h2:mem:test")
