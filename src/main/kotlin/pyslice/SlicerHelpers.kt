package pyslice

/**
 *
 */
fun isValid(slicer: String): Boolean {
  return when (slicer) {
    "", ":", "::", "0:", ":0" -> true
    else -> false
  }
}