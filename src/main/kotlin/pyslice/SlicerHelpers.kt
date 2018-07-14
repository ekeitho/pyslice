package pyslice

/**
 *
 */
internal fun isValid(slicer: String): Boolean {
  return when (slicer) {
    "", ":", "::", "0:" -> true
    else -> false
  }
}