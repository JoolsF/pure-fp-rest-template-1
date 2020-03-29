package example.domain.songs


//value classes
case class SongId(value: Long) extends AnyVal

case class SongTitle(value: String) extends AnyVal

case class SongArtist(value: String) extends AnyVal

case class Genre(value: String) extends AnyVal

case class Song(id: SongId,
                artist: SongArtist,
                title: SongTitle,
                genres: List[Genre]
               )

// ----- Create song -----
//TODO example has a more complex pattern here.  Update later

case class CreateSong(artist: SongArtist,
                      title: SongTitle,
                      genre: Genre)

// ----- Update song -----

case class UpdateSong(id: SongId,
                      genre: Genre)

