#include <utility>

#include "kt_method.h"

KtMethod::KtMethod(StringName p_name) : name(p_name), methodInfoFetched(false) {

}

const MethodInfo& KtMethod::get_method_info() {
    if (!methodInfoFetched) {
        // TODO : Build method info from jvm info
        methodInfoFetched = true;
    }
    return methodInfo;
}
