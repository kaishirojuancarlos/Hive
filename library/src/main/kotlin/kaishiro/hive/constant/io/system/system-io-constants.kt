package kaishiro.hive.constant.io.system

object Stream
{
	val output
		get() = System.out
	val errorOutput
		get() = System.err
	val input
		get() = System.`in`
}
