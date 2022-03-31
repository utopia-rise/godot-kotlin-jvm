package code_backup

class TypeException(override val message: String) : Exception()
class UnexpectedTypeName(override val message: String) : Exception()
