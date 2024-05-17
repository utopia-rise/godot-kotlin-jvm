# Benchmark project for Godot Kotlin/JVM

This is a benchmark project which tracks and compares the performance of Godot Kotlin/JVM over time.  
It is also used to compare the performance of the binding compared to typed and untyped GDScript.

## Public benchmark data
All benchmark data is publicly available in this [spreadsheet](https://docs.google.com/spreadsheets/d/1aIclio2oYs_ua_4tENVjfn-OrwKkgVSCRfo50NTMve0/edit?usp=sharing).

> **Note:** Although the benchmarks are always executed on the same physical machine, there are (sometimes considerably) different benchmark results for the same changeset (both for GDScript and for Kotlin). So these numbers are not always representative but can be taken to get an overall picture.

## Public profiling data
For the very curious, together with the benchmarking data, we also provide some profiling data in this [grafana dashboard](TBD).

## Continuous data gathering
The benchmarks are executed on each push to `master` as well as once per week. Then both the [spreadsheet](https://docs.google.com/spreadsheets/d/1aIclio2oYs_ua_4tENVjfn-OrwKkgVSCRfo50NTMve0/edit?usp=sharing) and the [grafana dashboard](TBD) are updated.

The benchmarks are always executed on the same physical self-hosted github runner. The specs are:
- CPU: i7-6700T
- RAM: 8GB DDR4 @ 2133Mhz 
- Graphics: Intel HD Graphics 530
- SSD: 512GB Sata
