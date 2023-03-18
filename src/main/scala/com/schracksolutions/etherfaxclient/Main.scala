package com.schracksolutions.etherfaxclient

import cats.effect.{IO, IOApp}

object Main extends IOApp.Simple {
  val run = EtherfaxclientServer.run[IO]
}
