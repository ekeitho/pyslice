package pyslice

operator fun <T> Array<T>.get(slicer: String): Array<T> {
  require(isValid(slicer)) { "Invalid slicer: $slicer" }
  return when (slicer) {
    "", ":", "::", "0:" -> this
    else -> throw AssertionError("Operation not handled")
  }
}