package pyslice

import org.junit.Test

internal class SliceHelpersTest {

  @Test
  fun `GIVEN an empty string WHEN isValid THEN it should return true`() {
    assert(isValid(""))
  }

  @Test
  fun `GIVEN a single colon string WHEN isValid THEN it should return true`() {
    assert(isValid(":"))
  }

  @Test
  fun `GIVEN a double colon string WHEN isValid THEN it should return true`() {
    assert(isValid("::"))
  }

  @Test
  fun `GIVEN only 0 as start index WHEN invoke index access operator THEN it should return the same array`() {
    val a = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    assert(a.contentEquals(a["0:"]))
  }
}