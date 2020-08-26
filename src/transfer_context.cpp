#include "transfer_context.h"
#include "google/protobuf/util/delimited_message_util.h"

TransferContext::TransferContext(jni::JObject p_wrapped, jni::JObject p_class_loader)
    : JavaInstanceWrapper("godot.core.TransferContext", p_wrapped, p_class_loader) {

}

TransferContext::SharedBuffer TransferContext::get_buffer(jni::Env& p_env) {
    jni::MethodId method = get_method_id(p_env, "getBuffer", "()Ljava/nio/ByteBuffer;");
    jni::JObject buffer = wrapped.call_object_method(p_env, method);
    assert(!buffer.isNull());
    return SharedBuffer {
            p_env.get_direct_buffer_address(buffer),
            p_env.get_direct_buffer_capacity(buffer)
    };
}

bool TransferContext::ensure_capacity(jni::Env& p_env, int p_capacity) {
    jni::MethodId method = get_method_id(p_env, "ensureCapacity", "(I)Z");
    return wrapped.call_boolean_method(p_env, method, {p_capacity});
}

void TransferContext::write_return_value(jni::Env& p_env, const TransferContext::SharedBuffer& p_buffer, const KtVariant& p_value) {
    wire::ReturnValue ret_val;
    ret_val.mutable_data()->CopyFrom(p_value.get_value());
    google::protobuf::io::ArrayOutputStream os(p_buffer.ptr, p_buffer.capacity);
    google::protobuf::io::CodedOutputStream cos(&os);
    google::protobuf::util::SerializeDelimitedToCodedStream(ret_val, &cos);
}

KtVariant TransferContext::read_return_value(jni::Env& p_env, const TransferContext::SharedBuffer& p_buffer) {
    wire::ReturnValue ret_val;
    google::protobuf::io::ArrayInputStream is(p_buffer.ptr, p_buffer.capacity);
    google::protobuf::io::CodedInputStream cis(&is);
    bool cleanEof;
    google::protobuf::util::ParseDelimitedFromCodedStream(&ret_val, &cis, &cleanEof);
    return KtVariant(ret_val.data());
}

void TransferContext::write_args(jni::Env& p_env, const TransferContext::SharedBuffer& p_buffer, const Vector<KtVariant>& p_args) {
    wire::FuncArgs func_args;
    for (auto i = 0; i < p_args.size(); i++) {
        func_args.add_args()->CopyFrom(p_args.get(i).get_value());
    }
    google::protobuf::io::ArrayOutputStream os(p_buffer.ptr, p_buffer.capacity);
    google::protobuf::io::CodedOutputStream cos(&os);
    google::protobuf::util::SerializeDelimitedToCodedStream(func_args, &cos);
}

Vector<KtVariant> TransferContext::read_args(jni::Env& p_env, const TransferContext::SharedBuffer& p_buffer) {
    wire::FuncArgs k_args;
    google::protobuf::io::ArrayInputStream is(p_buffer.ptr, p_buffer.capacity);
    google::protobuf::io::CodedInputStream cis(&is);
    bool cleanEof;
    google::protobuf::util::ParseDelimitedFromCodedStream(&k_args, &cis, &cleanEof);
    Vector<KtVariant> args;
    for (const auto& k_arg : k_args.args()) {
        args.push_back(KtVariant(k_arg));
    }
    return args;
}
