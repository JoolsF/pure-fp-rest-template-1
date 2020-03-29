package example.domain.songs

//algebra - naming convention ....Alg
trait SongRepositoryAlg[F[_]] {
  def findAll: F[List[Song]]

  def findById(songId: SongId): F[Option[Song]]

  def create(item: CreateSong): F[Unit]

  def update(item: UpdateSong): F[Unit]

}