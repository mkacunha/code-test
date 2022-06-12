package com.mkacunha

import org.junit.jupiter.api.Assertions

infix fun <T> T?.shouldBe(expected: Any) {
    Assertions.assertEquals(expected, this)
}
