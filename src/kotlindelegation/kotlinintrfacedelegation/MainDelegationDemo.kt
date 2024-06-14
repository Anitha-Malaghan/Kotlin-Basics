package kotlindelegation.kotlinintrfacedelegation

fun main() {

    val file: String = "File.mkv"
    val mediaFile = MediaFile(FileDownloader(file), FilePlayer(file))
    mediaFile.download()
    mediaFile.play()
}

