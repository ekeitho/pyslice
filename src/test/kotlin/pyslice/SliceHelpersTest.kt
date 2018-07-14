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
    assert(isValid("0:"))
  }

  @Test
  fun `GIVEN only 0 as stop index WHEN invoke index access operator THEN it should return the same array`() {
    assert(isValid(":0"))
  }
}