# godot-cpp divergence log

This project vendors `godot-cpp` as a submodule pointed at the
[`utopia-rise/godot-cpp`](https://github.com/utopia-rise/godot-cpp) fork,
branch `godot-jvm`, instead of upstream `godotengine/godot-cpp` directly.

The branch is rebased/rebuilt from the same upstream tag the submodule would
otherwise track (currently `godot-4.5-stable`). Every commit added on top of
that tag on `godot-jvm` must be logged here, in commit order, with its hash
and a short explanation of what it changes and why.

## Commits on `godot-jvm`

(none yet)

The branch currently sits at the same commit as upstream `godot-4.5-stable`
(`60b5a4196de8442b43b32ba68ebe1e79cfcb762f`) with no divergence. It was
created ahead of an investigation into a packed-array truncation bug on
Linux/GCC that initially looked like it lived inside godot-cpp's
`Variant`/`Array` conversion code; instrumenting `Array::Array(const
Variant*)` directly showed that conversion always produced the correct
size, so no godot-cpp fix was needed. The actual bug was in this repo's own
code — see the commit that fixes
`src/jvm/wrapper/bridge/packed_array_bridge.h`. See CLAUDE.md's "godot-cpp
fork" section for the process to follow the next time a real godot-cpp-side
fix is needed.
