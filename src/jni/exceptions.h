#ifndef GODOT_LOADER_EXCEPTIONS_H
#define GODOT_LOADER_EXCEPTIONS_H

#include <stdexcept>
#include <sstream>

namespace jni {
    class JniError : std::exception {
    public:
        JniError(const char* msg) {
            this->msg = std::string(msg);
        }

        const char * what() const noexcept override {
            return msg.c_str();
        }

    private:
        std::string msg;
    };

    class ClassNotFoundError : std::exception {
    public:
        ClassNotFoundError(const char *name) {
            std::stringstream ss;
            ss << "Class not found: " << name << std::endl;
            msg = ss.str();
        }

        const char * what() const noexcept override {
            return msg.c_str();
        }
    private:
        std::string msg;
    };

    class MethodNotFoundError : std::exception {
    public:
        MethodNotFoundError(const char *name, const char* signature) {
            std::stringstream ss;
            ss << "Method not found: " << name << " with signature: " << signature << std::endl;
            msg = ss.str();
        }

        const char * what() const noexcept override {
            return msg.c_str();
        }
    private:
        std::string msg;
    };

    class FieldNotFoundError : std::exception {
    public:
        FieldNotFoundError(const char *name, const char* signature) {
            std::stringstream ss;
            ss << "Field not found: " << name << " with signature: " << signature << std::endl;
            msg = ss.str();
        }

        const char * what() const noexcept override {
            return msg.c_str();
        }
    private:
        std::string msg;
    };
}

#endif //GODOT_LOADER_EXCEPTIONS_H
