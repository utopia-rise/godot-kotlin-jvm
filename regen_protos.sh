#!/usr/bin/env sh

protoc --java_out=kt/godot-runtime/src/main/java --cpp_out=src/wire/  protos/wire.proto