package ru.itis

import java.security.KeyPairGenerator
import java.security.MessageDigest

val SEED = 999

fun main() {
    val generator = KeyPairGenerator.getInstance("RSA")
    val hasher = MessageDigest.getInstance("SHA-256")
    generator.initialize(SEED)

}