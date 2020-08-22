#ifndef GODOT_JVM_GD_KOTLIN_H
#define GODOT_JVM_GD_KOTLIN_H


class GDKotlin {
private:
    GDKotlin();
    ~GDKotlin() = default;
    void initialize();

public:
    GDKotlin(const GDKotlin&) = delete;

    static GDKotlin& getInstance();

    GDKotlin& operator=(const GDKotlin&) = delete;
};


#endif //GODOT_JVM_GD_KOTLIN_H
