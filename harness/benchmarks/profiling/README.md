# Continuous profiling data using pyroscope and grafana

With the gradle task `profileAndUpload` the CI/CD can run periodic profiling on the benchmarks project. The profiling data is automatically uploaded to our profiling grafana dashboard.

The data collection is done using the  `pyroscope.jar` from [Pyroscope](https://grafana.com/docs/pyroscope/latest/configure-client/language-sdks/java/). One can find and update the jar from the [Pyroscope repository](https://github.com/grafana/pyroscope-java/releases).

The documentation for Pyroscope and grafana can be found [here](https://grafana.com/docs/pyroscope/latest/).

## Dashboards
- The public profiling dashboard can be found [here](https://monitoring.hippmann.ch/public-dashboards/22a47dbec7e04eed8fdad1135e22ef09?orgId=2) (no auth needed, but only view rights).
- The maintainer dashboard together with the maintainer login is given to the maintainers directly by [@chippmann](https://github.com/chippmann)
