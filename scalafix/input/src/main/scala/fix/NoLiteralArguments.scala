/*
rule = NoLiteralArguments
 */
package fix

class NoLiteralArguments {
  def complete(isSuccess: Boolean): Unit = ()
  complete(true) // assert: NoLiteralArguments
  complete(false) /* assert: NoLiteralArguments
           ^^^^^
  Use named arguments for literals such as 'parameterName = false'
 */

}
