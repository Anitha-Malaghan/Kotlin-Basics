package kotlindelegation.kotlinintrfacedelegation

//class MediaFile(private val downloader: IDownloader, private val player: IPlayer):IDownloader,IPlayer {
//    //With delegation we can reduce this boilerplate code
//    override fun download() {
//      downloader.download()
//    }
//
//    override fun play() {
//        player.play()
//    }
//}

class MediaFile(private val downloader: IDownloader, private val player: IPlayer): IDownloader by downloader, IPlayer by player