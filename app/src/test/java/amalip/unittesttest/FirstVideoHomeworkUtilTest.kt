package amalip.unittesttest

import com.google.common.truth.Truth.assertThat
import org.junit.Test

/**
 * Created by Amalip on 6/10/2021.
 */
class FirstVideoHomeworkUtilTest {

    @Test
    fun `validate if is a positive number returns true`() {
        assertThat(FirstVideoHomeworkUtil.fib(1)).isGreaterThan(0)
    }

    @Test
    fun `validate if has correct braces returns true`() {
        assertThat(FirstVideoHomeworkUtil.checkBraces(")(")).isTrue()
    }

}