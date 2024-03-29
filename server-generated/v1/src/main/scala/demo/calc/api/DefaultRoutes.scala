//> using scala "3.3.1"
//> using lib "com.lihaoyi::cask:0.8.3"
//> using lib "com.lihaoyi::scalatags:0.12.0"
/** Basic Calculator Service A simple calculator API that performs basic arithmetic operations.
  *
  * OpenAPI spec version: 1.0.0 Contact: contact@kindservices.co.uk
  *
  * NOTE: This class is auto generated by the swagger code generator program.
  * https://github.com/swagger-api/swagger-codegen.git
  */

// this is generated from apiRoutes.mustache
package demo.calc.api

import demo.calc.model.Calculate200Response
import demo.calc.model.Calculate400Response
import demo.calc.model.CalculateRequest

final case class DefaultRoutes(service: DefaultService) extends cask.Routes {

  /** Perform arithmetic operation
    */
  @cask.post("/v1/calc")
  def calculate(request: cask.Request) = {

    val serviceResponse = for {

      /** TODO - this is a bit of a hack - we should do content type negotiation */
      calculateRequest <- Parsed.eval(CalculateRequest.fromJsonString(request.bodyAsString))
      result           <- Parsed.eval(service.calculate(calculateRequest))
    } yield result

    asHttpResponse(serviceResponse)
  }

  initialize()
}
