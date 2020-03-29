package example.infrastructure.http.routes

import cats.effect.Sync
import example.domain.songs.SongsService
import org.http4s._
import org.http4s.dsl.Http4sDsl
import org.http4s.server.Router


final class SongRoutes[F[_] : Sync](songService: SongsService[F]
                                   ) extends Http4sDsl[F] {


  private[routes] val prefixPath = "/brands"

  private val httpRoutes: HttpRoutes[F] = HttpRoutes.of[F] {
    case GET -> Root => NoContent() //TODO add this   Ok(songService.findAll)

  }

  val routes: HttpRoutes[F] = Router(
    prefixPath -> httpRoutes
  )

}