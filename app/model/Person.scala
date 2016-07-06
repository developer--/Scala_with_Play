package model

import play.api.libs.json.Json

/**
  * Created by Master on 7/5/16.
  * */
case class Person(name:String, age:String)

object Person {
  implicit val personFormat = Json.format[Person]
}
