#!/usr/bin/env scala-cli

import scala.sys.process.{given, *}

val all = """- java-camel
    - java-helidon-server (beta)
    - java-inflector
    - java-micronaut-server (beta)
    - java-msf4j
    - java-pkmst
    - java-play-framework
    - java-undertow-server
    - java-vertx-web (beta)
    - java-wiremock (beta)
    - jaxrs-cxf
    - jaxrs-cxf-cdi
    - jaxrs-cxf-extended
    - jaxrs-jersey
    - jaxrs-resteasy
    - jaxrs-resteasy-eap
    - jaxrs-spec
    - julia-server (beta)
    - scala-akka-http-server (beta)
    - scala-finch
    - scala-http4s-server
    - scala-lagom-server
    - scala-play-server
    - scalatra
    - spring"""


val Name = ".*- (.*)".r
def asCmd(name : String) = {
    val safeName = name.takeWhile {
        case c => c.isLetterOrDigit || c.toString == "-"
    }

    val pwd = new java.io.File(".").toPath().toAbsolutePath().toString()

    s"""docker run --rm 
    -v $pwd:/local openapitools/openapi-generator-cli generate 
    -i https://raw.githubusercontent.com/aaronp/calc-api/main/v1/service.yaml 
    -g $safeName 
    -o /local/$safeName""".linesIterator.mkString(" ")
}

def exec(cmd: String) = {
    println("= " * 80)
    println(cmd)
    cmd.lazyLines.foreach(println)
    
}

all.linesIterator.map(_.trim).collect {
    case s"- $name" => name
}.map(asCmd).foreach(exec)

