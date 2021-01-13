package godot.annotation.processor

import com.google.auto.service.AutoService
import godot.annotation.*
import kotlinx.metadata.KmClass
import kotlinx.metadata.KmPropertyVisitor
import kotlinx.metadata.KmType
import kotlinx.metadata.jvm.KotlinClassHeader
import kotlinx.metadata.jvm.KotlinClassMetadata
import kotlinx.metadata.jvm.getterSignature
import org.jetbrains.kotlin.metadata.jvm.deserialization.JvmBytecodeBinaryVersion
import org.jetbrains.kotlin.metadata.jvm.deserialization.JvmMetadataVersion
import org.jetbrains.kotlin.psi.KtExpression
import javax.annotation.processing.*
import javax.lang.model.SourceVersion
import javax.lang.model.element.ElementKind
import javax.lang.model.element.TypeElement
import javax.lang.model.type.NoType

@AutoService(Processor::class) // For registering the service
@SupportedSourceVersion(SourceVersion.RELEASE_8) // to support Java 8
@SupportedOptions(TestAnnotationProcessor.KAPT_KOTLIN_GENERATED_OPTION_NAME)
class TestAnnotationProcessor : AbstractProcessor() {

    override fun getSupportedAnnotationTypes(): MutableSet<String> {
        return mutableSetOf(
            RegisterClass::class.java.canonicalName,
            RegisterFunction::class.java.canonicalName,
            RegisterProperty::class.java.canonicalName,
            RegisterSignal::class.java.canonicalName
        )
    }

    data class RegisteredClass(
        val fqName: String,
        val supertypeFqNames: List<String>,
        val constructors: List<List<Pair<String, String>>>,
        val isTool: Boolean
    )

    abstract class RegisteredMember {
        abstract val name: String
    }

    data class RegisteredProperty(
        override val name: String,
        val type: String,
        val visibleInEditor: Boolean,
        val rpcMode: RPCMode,
        val assignmentPsi: KtExpression
    ): RegisteredMember()

    data class RegisteredFunction(
        override val name: String,
        val parameters: List<Pair<String, String>>,
        val returnType: String,
        val rpcMode: RPCMode
    ): RegisteredMember()

    data class RegisteredSignal(
        override val name: String,
        val parameters: List<Pair<String, String>>,
    ): RegisteredMember()

    data class ClassWithMembers(
        val clazz: RegisteredClass,
        val members: List<RegisteredMember>
    )

    private val classWithMembers: MutableList<ClassWithMembers> = mutableListOf()

    override fun process(annotations: MutableSet<out TypeElement>, roundEnvironment: RoundEnvironment): Boolean {
//        val classes = roundEnvironment
//            .getElementsAnnotatedWith(RegisterClass::class.java)
//            .map { element ->
//                require(element.kind == ElementKind.CLASS) { TODO() }
//                require(element is TypeElement) { TODO() }
//                val registerClassAnnotation = element.getAnnotation(RegisterClass::class.java)
//                val kmClass = element.toKmClass()
//
//                RegisteredClass(
//                    element.qualifiedName.toString(),
//                    element.getSupertypes().map { it.qualifiedName.toString() },
//                    kmClass.constructors.map { it.valueParameters.map { valueParameter -> valueParameter.name to requireNotNull(valueParameter.type?.classifier?.toString()) } },
//                    registerClassAnnotation.isTool
//                )
//            }
//
//        val properties = roundEnvironment
//            .getElementsAnnotatedWith(RegisterProperty::class.java)
//            .map { element ->
//                val classElement = element.enclosingElement
//                require(classElement.kind == ElementKind.CLASS) { TODO() }
//                require(classElement is TypeElement) { TODO() }
//                val registerPropertyAnnotation = element.getAnnotation(RegisterProperty::class.java)
//                val kmClass = classElement.toKmClass()
//                val kmProperty = kmClass.properties.first { kmProperty ->
//                    kmProperty.getterSignature?.name == element.simpleName.toString().substringBefore("$")
//                }
//
//                object: KmPropertyVisitor() {
//
//                }
//
//                RegisteredProperty(
//                    kmProperty.name,
//                    kmProperty.returnType.classifier.toString().replace("/", "."),
//                    registerPropertyAnnotation.visibleInEditor,
//                    registerPropertyAnnotation.rpcMode
//                )
//            }

//        roundEnvironment.getElementsAnnotatedWith(RegisterClass::class.java).forEach { typeElement ->
//            if (typeElement.kind == ElementKind.CLASS) {
//                classWithMembers[typeElement as TypeElement] = mutableListOf()
//            }
//            val metadataAnnotation = typeElement.getAnnotation(Metadata::class.java)
//            val header = KotlinClassHeader(
//                kind = metadataAnnotation.kind,
//                metadataVersion = metadataAnnotation.metadataVersion,
//                bytecodeVersion = metadataAnnotation.bytecodeVersion,
//                data1 = metadataAnnotation.data1,
//                data2 = metadataAnnotation.data2,
//                extraString = metadataAnnotation.extraString,
//                extraInt = metadataAnnotation.extraInt,
//                packageName = metadataAnnotation.packageName
//            )
//            val metadata = KotlinClassMetadata.read(header)
//
//            require(metadata is KotlinClassMetadata.Class)
//
//            val kmClass = metadata.toKmClass()
//
////            val metadata = (typeElement as Symbol.ClassSymbol).metadata
//
////            typeElement.annotationMirrors[1].values
//
//            val blubb = ""
//        }
//
//        roundEnvironment.getElementsAnnotatedWith(RegisterProperty::class.java).forEach { element ->
//            if (element.kind == ElementKind.METHOD) {
//
//            }
//        }

//        roundEnvironment.getElementsAnnotatedWith(RegisterProperty::class.java).forEach { typeElement ->
//            if (typeElement.kind == ElementKind.METHOD) {
//                val blubb = ""
//            }
//        }
        return true
    }

    private fun TypeElement.toKmClass(): KmClass {
        val metadataAnnotation = getAnnotation(Metadata::class.java)
        val metadataHeader = KotlinClassHeader(
            kind = metadataAnnotation.kind,
            metadataVersion = metadataAnnotation.metadataVersion,
            bytecodeVersion = metadataAnnotation.bytecodeVersion,
            data1 = metadataAnnotation.data1,
            data2 = metadataAnnotation.data2,
            extraString = metadataAnnotation.extraString,
            extraInt = metadataAnnotation.extraInt,
            packageName = metadataAnnotation.packageName
        )
        val metadata = KotlinClassMetadata.read(metadataHeader) as KotlinClassMetadata.Class
        return metadata.toKmClass()
    }

    private tailrec fun TypeElement.getSupertypes(supertypes: MutableList<TypeElement> = mutableListOf()): List<TypeElement> {
        return if (superclass is NoType) {
            supertypes
        } else {
            val superElement = processingEnv.typeUtils.asElement(superclass)
            require(superElement is TypeElement)
            supertypes.add(superElement)

            superElement.getSupertypes(supertypes)
        }
    }

    companion object {
        const val KAPT_KOTLIN_GENERATED_OPTION_NAME = "kapt.kotlin.generated"
    }
}
