//> using scala "3.3.1"
//> using lib "demo.rest::calc:0.0.1-SNAPSHOT"


/**
* This single file can contain the business logic for a REST service.
* ====================================
* == zero-install build with docker ==
* ====================================
*
*
* ```
* docker build . -t calc:latest
* ```
* ======================
* == Building Locally ==
* ======================
* This project can be built using [[scala-clit][https://scala-cli.virtuslab.org]]
*
* To simply run the project
* ```
* scala-cli Server.scala
* ```
*
* To create a runnable jar, run:
* ```
* scala-cli --power package Server.scala -o app-assembly --assembly
* ```
*
* To produce a docker image (no need for the Dockerfile), run:
* ```
* scala-cli --power package --docker Server.scala --docker-image-repository app-docker
* ```
*
* To generate an IDE project:
* ```
* scala-cli setup-ide . --scala 3.3
* ```
*/
package app

import demo.calc.BaseApp
import demo.calc.api.*
import demo.calc.model.*

import java.io.File

// TODO - write your business logic for your services here (the defaults all return 'not implemented'):
val myDefaultService : DefaultService = DefaultService() // <-- replace this with your implementation

/** This is your main entry point for your REST service
 *  It extends BaseApp which defines the business logic for your services
 */
object Server extends BaseApp(appDefaultService = myDefaultService):
  start()

