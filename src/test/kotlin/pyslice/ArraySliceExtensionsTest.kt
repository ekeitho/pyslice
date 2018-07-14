package pyslice

import org.junit.Test

class ArraySliceExtensionsTest {

  @Test
  fun `GIVEN empty string WHEN invoke index access operator THEN it should the return same array`() {
    val a = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    assert(a.contentEquals(a[""]))
  }

  @Test
  fun `GIVEN a single colon string WHEN invoke index access operator THEN it should return the same array`() {
    val a = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    assert(a.contentEquals(a[":"]))
  }

  @Test
  fun `GIVEN a double colon string WHEN invoke index access operator THEN it should return the same array`() {
    val a = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    assert(a.contentEquals(a["::"]))
  }

  @Test
  fun `GIVEN only 0 as start index WHEN invoke index access operator THEN it should return the same array`() {
    val a = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    assert(a.contentEquals(a["0:"]))
  }

  @Test
  fun `GIVEN only 0 as stop index WHEN invoke index access operator THEN it should return an empty array`() {
    val a = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    assert(emptyArray<Int>().contentEquals(a[":0"]))
  }
}