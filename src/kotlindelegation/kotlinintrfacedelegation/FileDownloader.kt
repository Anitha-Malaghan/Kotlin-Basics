package kotlindelegation.kotlinintrfacedelegation

class FileDownloader(file:String): IDownloader {
    override fun download() {
        println("Download class implemented")
    }
}