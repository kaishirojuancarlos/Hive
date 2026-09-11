package kaishiro.hive.constant.text

import java.nio.charset.Charset

/**
 * Null character (ASCII 0).
 * Often used as a sentinel value or string terminator.
 */
const val whitespace: Char = '\u0'

/**
 * Space character (ASCII 32).
 * The standard whitespace character.
 */
const val space: Char = ' '

/**
 * Tab character (ASCII 9).
 * Used for horizontal whitespace and indentation.
 */
const val tab: Char = '\t'

/**
 * Newline character (ASCII 10).
 * Used to separate lines of text.
 */
const val newline: Char = '\n'

/**
 * The default character set of the Java Virtual Machine.
 * 
 * This is typically UTF-8 on most modern systems, but may vary
 * depending on the JVM configuration and locale settings.
 */
val defaultCharacterSet: Charset = Charset.defaultCharset()
