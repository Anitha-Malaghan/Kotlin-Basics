package kotlindelegation.kotlinintrfacedelegation

class FilePlayer(file: String ): IPlayer {
    override fun play() {
       println("Player class implemented")
    }
}