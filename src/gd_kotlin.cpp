#include <core/print_string.h>
#include "gd_kotlin.h"
#include "jni/jvm.h"

GDKotlin& GDKotlin::getInstance() {
    static GDKotlin instance;
    return instance;
}

void GDKotlin::init() {
    jni::InitArgs args;
    args.version = JNI_VERSION_1_8;
    args.option("-Xcheck:jni");
    jni::Jvm::init(args);
    print_line("Jvm started!");
}

void GDKotlin::finish() {
    jni::Jvm::destroy();
    print_line("Jvm destroyed!");
}
