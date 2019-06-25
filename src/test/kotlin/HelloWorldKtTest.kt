import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class HelloWorldKtTest {

    @Test
    fun `helloWorld returns 'Hello world!'`() {
        assertThat(helloWorld()).isEqualTo("Hello world!")
    }

}
