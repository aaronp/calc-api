#!/usr/bin/env scala-cli

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

all.lines.collect {
    case s".*- ($name)" => name
}.foreach(println)
