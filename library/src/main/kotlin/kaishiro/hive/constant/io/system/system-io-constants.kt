package kaishiro.hive.constant.io.system

/**
 * Provides convenient access to the standard system streams.
 * 
 * This object encapsulates the three standard Java system streams:
 * - [output]: Standard output stream (stdout)
 * - [errorOutput]: Standard error stream (stderr)
 * - [input]: Standard input stream (stdin)
 * 
 * Using this object provides a cleaner, more idiomatic Kotlin interface
 * to system streams compared to direct System.out/System.err/System.in access.
 */
object Stream {
	/**
	 * The standard output stream.
	 * Equivalent to System.out.
	 */
	val output: java.io.PrintStream
		get() = System.out

	/**
	 * The standard error stream.
	 * Equivalent to System.err.
	 */
	val errorOutput: java.io.PrintStream
		get() = System.err

	/**
	 * The standard input stream.
	 * Equivalent to System.in.
	 */
	val input: java.io.InputStream
		get() = System.`in`
}
