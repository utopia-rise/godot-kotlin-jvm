#!/usr/bin/env sh

./libprotobuf/bin/protoc --proto_path=protos/ --java_out=kt/godot-runtime/src/main/java --cpp_out=src/wire/ wire.proto