sealed class HList {
    companion object {
        operator fun invoke() = HNil
        operator fun <A> invoke(a: A) = HNode(a, invoke())
        operator fun <A, B> invoke(a: A, b: B) = HNode(a, invoke(b))
        operator fun <A, B, C> invoke(a: A, b: B, c: C) = HNode(a, invoke(b, c))
        operator fun <A, B, C, D> invoke(a: A, b: B, c: C, d: D) = HNode(a, invoke(b, c, d))
        operator fun <A, B, C, D, E> invoke(a: A, b: B, c: C, d: D, e: E) = HNode(a, invoke(b, c, d, e))
        operator fun <A, B, C, D, E, F> invoke(a: A, b: B, c: C, d: D, e: E, f: F) = HNode(a, invoke(b, c, d, e, f))
    }
}
object HNil : HList()
class HNode<out H, out T : HList>(val head: H, val tail: T) : HList()

operator fun <T> HNode<T, *>.component1() = head
operator fun <T> HNode<*, HNode<T, *>>.component2() = tail.head
operator fun <T> HNode<*, HNode<*, HNode<T, *>>>.component3() = tail.tail.head
operator fun <T> HNode<*, HNode<*, HNode<*, HNode<T, *>>>>.component4() = tail.tail.tail.head
operator fun <T> HNode<*, HNode<*, HNode<*, HNode<*, HNode<T, *>>>>>.component5() = tail.tail.tail.tail.head
operator fun <T> HNode<*, HNode<*, HNode<*, HNode<*, HNode<T, HNode<T, *>>>>>>.component6() = tail.tail.tail.tail.tail.head


infix fun <H, T: HList> T.push(elem: H): HNode<H, T> = HNode(elem, this)