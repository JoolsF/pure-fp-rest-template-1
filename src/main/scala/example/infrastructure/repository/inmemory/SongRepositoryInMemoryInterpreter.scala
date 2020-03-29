package example.infrastructure.repository.inmemory

import cats.Applicative
import cats.implicits._
import example.domain.songs.{Song, SongRepositoryAlg, SongId, CreateSong, UpdateSong}

import scala.collection.concurrent.TrieMap
import scala.util.Random

//All
class SongRepositoryInMemoryInterpreter[F[_] : Applicative] extends SongRepositoryAlg[F] {
  private val cache = new TrieMap[Long, Song]

  private val random = new Random

  def findAll: F[List[Song]] =
    cache.values.toList.pure[F]

  def findById(songId: SongId): F[Option[Song]] =
    cache.get(songId.value).pure[F]

  def create(item: CreateSong): F[Unit] = {
    val toSave = Song(
      SongId(random.nextLong()),
      item.artist,
      item.title,
      List(item.genre)
    )

    cache.put(toSave.id.value, toSave)
    ().pure[F]
  }

  def update(item: UpdateSong): F[Unit] = ???
}
