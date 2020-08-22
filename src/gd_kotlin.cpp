#include "gd_kotlin.h"

GDKotlin::GDKotlin() {
    initialize();
}

GDKotlin& GDKotlin::getInstance() {
    static GDKotlin instance;
    return instance;
}

void GDKotlin::initialize() {
    //TODO
}
