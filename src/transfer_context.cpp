#include "transfer_context.h"
#include "google/protobuf/util/delimited_message_util.h"
#include "gd_kotlin.h"

TransferContext::TransferContext(jni::JObject p_wrapped, jni::JObject p_class_loader)
    : shared_buffer(nullptr), JavaInstanceWrapper("godot.core.TransferContext", p_wrapped, p_class_loader) {
}

TransferContext::~TransferContext() {
    delete shared_buffer;
}

TransferContext::SharedBuffer* TransferContext::get_buffer(jni::Env& p_env, bool p_refresh_buffer) {
    if (shared_buffer == nullptr || p_refresh_buffer) {
        delete shared_buffer;

        jni::MethodId method = get_method_id(p_env, "getBuffer", "()Ljava/nio/ByteBuffer;");
        jni::JObject buffer = wrapped.call_object_method(p_env, method);
        assert(!buffer.isNull());
        shared_buffer = new SharedBuffer {
                p_env.get_direct_buffer_address(buffer),
                p_env.get_direct_buffer_capacity(buffer)
        };
    }

    return shared_buffer;
}

bool TransferContext::ensure_capacity(jni::Env& p_env, long p_capacity) {
    jni::MethodId method = get_method_id(p_env, "ensureCapacity", "(I)Z");
    return wrapped.call_boolean_method(p_env, method, {static_cast<jlong>(p_capacity)});
}

void TransferContext::write_return_value(jni::Env& p_env, const KtVariant& p_value) {
    wire::ReturnValue ret_val;
    ret_val.mutable_data()->CopyFrom(p_value.get_value());

    SharedBuffer* buffer { get_buffer(p_env, ensure_capacity(p_env, ret_val.ByteSizeLong())) };
    google::protobuf::io::ArrayOutputStream os(buffer->ptr, buffer->capacity);
    google::protobuf::io::CodedOutputStream cos(&os);
    google::protobuf::util::SerializeDelimitedToCodedStream(ret_val, &cos);
}

KtVariant TransferContext::read_return_value(jni::Env& p_env, bool p_refresh_buffer) {
    wire::ReturnValue ret_val;

    SharedBuffer* buffer { get_buffer(p_env, p_refresh_buffer) };
    google::protobuf::io::ArrayInputStream is(buffer->ptr, buffer->capacity);
    google::protobuf::io::CodedInputStream cis(&is);
    bool cleanEof;
    google::protobuf::util::ParseDelimitedFromCodedStream(&ret_val, &cis, &cleanEof);
    return KtVariant(ret_val.data());
}

void TransferContext::write_args(jni::Env& p_env, const Vector<KtVariant>& p_args) {
    wire::FuncArgs func_args;
    for (auto i = 0; i < p_args.size(); i++) {
        func_args.add_args()->CopyFrom(p_args.get(i).get_value());
    }

    SharedBuffer* buffer { get_buffer(p_env, ensure_capacity(p_env, func_args.ByteSizeLong())) };
    google::protobuf::io::ArrayOutputStream os(buffer->ptr, buffer->capacity);
    google::protobuf::io::CodedOutputStream cos(&os);
    google::protobuf::util::SerializeDelimitedToCodedStream(func_args, &cos);
}

Vector<KtVariant> TransferContext::read_args(jni::Env& p_env, bool p_refresh_buffer) {
    wire::FuncArgs k_args;

    SharedBuffer* buffer { get_buffer(p_env, p_refresh_buffer) };
    google::protobuf::io::ArrayInputStream is(buffer->ptr, buffer->capacity);
    google::protobuf::io::CodedInputStream cis(&is);
    bool cleanEof;
    google::protobuf::util::ParseDelimitedFromCodedStream(&k_args, &cis, &cleanEof);
    Vector<KtVariant> args;
    for (const auto& k_arg : k_args.args()) {
        args.push_back(KtVariant(k_arg));
    }
    return args;
}

JNIEXPORT void JNICALL Java_TransferContext_icall(JNIEnv* rawEnv, jobject instance, jlong jPtr,
                                                                   jstring jClassName,
                                                                   jstring jMethod, jint expectedReturnType,
                                                                   bool p_refresh_buffer) {
    TransferContext* transferContext{GDKotlin::get_instance().transfer_context};
    const jni::JObject& classLoader = GDKotlin::get_instance().get_class_loader();
    jni::Env env(rawEnv);
    Vector<KtVariant> tArgs = transferContext->read_args(env, p_refresh_buffer);
    int argsSize = tArgs.size();

    Vector<const Variant*> variantArgs;
    for (int i = 0; i < argsSize; i++) {
        const Variant& godotVariant = tArgs[i].to_godot_variant();
        variantArgs.push_back(&godotVariant);
    }

    auto* ptr = reinterpret_cast<Object*>(jPtr);
    String className = env.from_jstring(jni::JString(jClassName));
    String method = env.from_jstring(jni::JString(jMethod));

    Variant::CallError r_error{Variant::CallError::CALL_OK};
    MethodBind* methodBind{ClassDB::get_method(className, method)};
    if (methodBind) {
        const KtVariant& retValue{methodBind->call(ptr, variantArgs.ptrw(), argsSize, r_error)};

        //TODO: Manage r_error

        transferContext->write_return_value(env, retValue);
    } else {
        //TODO: manage if methodBind not found
    }
}
