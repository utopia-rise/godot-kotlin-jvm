# Annotations rework

Replace existing annotations with:
- `GodotScript` -> classes
- `GodotMember` -> functions, properties (also allow signals but not relevant for them)

Add meta annotation to api signals and overridable api functions: `GodotApiMember`.

# New processing logic
## Properties
1. Collect all properties from hierarchy
2. Filter by existence of `GodotMember` annotation

## Functions
1. Collect all functions from hierarchy
2. Filter by existence of `GodotMember` annotation or override function which has the annotation `GodotApiMember`

## Signals
1. Collect all properties from hierarchy
2. Filter by type signal
3. Filter not has annotation `GodotApiMember`

