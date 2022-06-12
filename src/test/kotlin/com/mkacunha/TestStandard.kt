package com.mkacunha

import org.junit.jupiter.api.Assertions
import org.mockito.kotlin.whenever

infix fun <T> T?.shouldBe(expected: Any) {
    Assertions.assertEquals(expected, this)
}

infix fun <T> T.returns(t: T) {
    whenever(this).thenReturn(t)
}