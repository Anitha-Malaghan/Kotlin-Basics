package kotinoperatoroverloading

class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

fun main() {
    val p1 = Point(1, 2)
    val p2 = Point(3, 4)
    val sum = p1 + p2
    println("Sum: (${sum.x}, ${sum.y})") // Output: Sum: (4, 6)
}
