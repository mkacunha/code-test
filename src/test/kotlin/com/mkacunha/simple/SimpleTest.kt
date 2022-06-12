package com.mkacunha.simple

import com.mkacunha.shouldBe
import org.junit.jupiter.api.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever

internal class SimpleTest {

    @Test
    internal fun `should return value`() {
        Simple(value = "value").value shouldBe "value"
    }

    @Test
    internal fun `should mock value`() {
        val simple = mock<Simple>()
        whenever(simple.value).thenReturn("value")

        simple.value shouldBe "value"
    }
}