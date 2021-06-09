package godot.docgen

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler
import com.fasterxml.jackson.databind.deser.ValueInstantiator
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import java.io.File


object DocGen {
    fun deserializeDoc(docsDir: File): Map<String, ClassDoc> {
        val xmlMapper: ObjectMapper = XmlMapper().apply {
            addHandler(object : DeserializationProblemHandler() {
                /**
                 * Needed for empty tags with tabs and new lines as they are not considered empty by jackson
                 * and throw an error when trying to parse them
                 *
                 * Example:
                 * ```xml
                 * <signals>
                 * </signals>
                 * ```
                 */
                override fun handleMissingInstantiator(
                    ctxt: DeserializationContext?,
                    instClass: Class<*>?,
                    valueInsta: ValueInstantiator?,
                    p: JsonParser?,
                    msg: String?
                ): Any? {
                    val value = p?.valueAsString?.trim()
                    // ignore "empty" elements
                    if (value?.isEmpty() == true) {
                        return null
                    }
                    return super.handleMissingInstantiator(ctxt, instClass, valueInsta, p, msg)
                }
            })
        }

        return docsDir
            .walkTopDown()
            .filter { it.isFile && it.extension == "xml" }
            .map {
                //better have no doc for one class that to have a crash an no classes at all
                try {
                    xmlMapper.readValue(it.readText(), RawClassDoc::class.java)
                } catch (e: Throwable) {
                    System.err.println("Could not parse doc: ${it.absolutePath}! Please submit a bugreport with this error and the following stacktrace to: https://github.com/utopia-rise/godot-kotlin-jvm/issues")
                    e.printStackTrace()
                    null
                }
            }
            .toList()
            .filterNotNull()
            .map(::mapClass)
            .map { it.name to it }
            .toMap()
    }

    private fun mapClass(rawClassDoc: RawClassDoc): ClassDoc {
        return ClassDoc(
            rawClassDoc.name,
            rawClassDoc.briefDescription,
            rawClassDoc.description,
            rawClassDoc.tutorials?.links ?: listOf(),
            rawClassDoc
                .methods
                ?.methods
                ?.map(::mapMethod)
                ?.map { it.name to it }
                ?.toMap() ?: mapOf(),
            rawClassDoc
                .members
                ?.members
                ?.map(::mapMember)
                ?.map { it.name to it }
                ?.toMap() ?: mapOf(),
            rawClassDoc
                .signals
                ?.signals
                ?.map(::mapSignal)
                ?.map { it.name to it }
                ?.toMap() ?: mapOf(),
            rawClassDoc
                .constants
                ?.constants
                ?.map(::mapConstant)
                ?.map { it.name to it }
                ?.toMap() ?: mapOf()
        )
    }

    private fun mapMethod(rawMethodDoc: RawMethodDoc): FunctionDoc {
        return FunctionDoc(
            rawMethodDoc.name,
            rawMethodDoc.description
        )
    }

    private fun mapMember(rawMemberDoc: RawMemberDoc): PropertyDoc {
        return PropertyDoc(
            rawMemberDoc.name,
            rawMemberDoc.description
        )
    }

    private fun mapSignal(rawSignalDoc: RawSignalDoc): SignalDoc {
        return SignalDoc(
            rawSignalDoc.name,
            rawSignalDoc.description
        )
    }

    private fun mapConstant(rawConstantDoc: RawConstantDoc): ConstantDoc {
        return ConstantDoc(
            rawConstantDoc.name,
            rawConstantDoc.enum,
            rawConstantDoc.description
        )
    }
}
