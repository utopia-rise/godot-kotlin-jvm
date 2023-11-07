// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Comma-separated values are a plain text table storage format. The format's simplicity makes it
 * easy to edit in any text editor or spreadsheet software. This makes it a common choice for game
 * localization.
 * **Example CSV file:**
 * [codeblock]
 * keys,en,es,ja
 * GREET,"Hello, friend!","Hola, amigo!",こんにちは
 * ASK,How are you?,Cómo está?,元気ですか
 * BYE,Goodbye,Adiós,さようなら
 * QUOTE,"""Hello"" said the man.","""Hola"" dijo el hombre.",「こんにちは」男は言いました
 * [/codeblock]
 */
@GodotBaseType
public open class ResourceImporterCSVTranslation internal constructor() : ResourceImporter() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RESOURCEIMPORTERCSVTRANSLATION, scriptIndex)
    return true
  }

  public companion object
}
