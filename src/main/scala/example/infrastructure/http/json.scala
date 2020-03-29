package example.infrastructure.http

import cats.effect.Sync
import example.domain.songs.Song
import io.circe.generic.semiauto.{deriveDecoder, deriveEncoder}
import io.circe.{Decoder, Encoder}
import org.http4s.circe.{jsonEncoderOf, jsonOf}
import org.http4s.{EntityDecoder, EntityEncoder}


object json {
  //TODO to fix
//  implicit def jsonDecoder[F[_] : Sync, A: Decoder]: EntityDecoder[F, A] = jsonOf[F, A]
//
//  implicit def jsonEncoder[F[_] : Sync, A: Encoder]: EntityEncoder[F, A] = jsonEncoderOf[F, A]
//
//  // ----- Domain codecs -----
//  implicit val songDecoder: Decoder[Song] = deriveDecoder[Song]
//  implicit val songEncoder: Encoder[Song] = deriveEncoder[Song]


}
