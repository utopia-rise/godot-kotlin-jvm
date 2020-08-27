#!/usr/bin/env sh

./libprotobuf/bin/protoc --java_out=kt/godot-runtime/src/main/java --cpp_out=src/wire/  protos/wire.proto