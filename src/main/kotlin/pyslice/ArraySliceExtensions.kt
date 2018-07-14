package pyslice

inline operator fun <reified T> Array<T>.get(slicer: String): Array<T> {
  require(isValid(slicer)) { "Invalid slicer: $slicer" }
  return when (slicer) {
    "", ":", "::", "0:" -> this
    ":0" -> emptyArray()
    else -> throw AssertionError("Operation not handled")
  }
}