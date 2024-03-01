package calc.model

import demo.calc.model.*

@main def test = {
  val jason = """{
  "lhs": "10",
  "operator": "add",
  "rhs": 20
}"""

  println(CalculateRequest.fromJsonString(jason))
}
