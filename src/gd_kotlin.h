#ifndef GODOT_JVM_GD_KOTLIN_H
#define GODOT_JVM_GD_KOTLIN_H


class GDKotlin {
private:
    GDKotlin() = default;
    ~GDKotlin() = default;

public:
    GDKotlin(const GDKotlin&) = delete;

    static GDKotlin& getInstance();

    GDKotlin& operator=(const GDKotlin&) = delete;

    void init();
    void finish();
};


#endif //GODOT_JVM_GD_KOTLIN_H
