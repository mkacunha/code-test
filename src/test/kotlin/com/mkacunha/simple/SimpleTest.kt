package com.mkacunha.simple

import com.mkacunha.shouldBe
import com.mkacunha.returns
import org.junit.jupiter.api.Test
import org.mockito.kotlin.mock

internal class SimpleTest {

    @Test
    internal fun `should return value`() {
        Simple(value = "value").value shouldBe "value"
    }

    @Test
    internal fun `should mock value`() {
        val simple = mock<Simple>()
        simple.value returns "value"
        simple.value shouldBe "value"
    }
}