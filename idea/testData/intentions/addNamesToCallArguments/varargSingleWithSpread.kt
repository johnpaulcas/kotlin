fun foo(n: Int, vararg s: String){}

fun bar(array: Array<String>) {
    <caret>foo(1, *array)
}