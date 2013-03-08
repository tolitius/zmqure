# zmqure

clojure zmq server

## Installing "zmq jar" into a local maven repo

```bash
mvn install:install-file -DgroupId=zmq \
-DartifactId=zmq \
-Dversion=2.1.9 \
-Dfile=<PATH_TO>/zmq-2.1.9.jar \
-Dpackaging=jar \
-DgeneratePom=true
```

## Exporting LD_LIBRARY_PATH

```bash
export LD_LIBRARY_PATH=/usr/local/lib
```

## Usage

```
lein run -m zmqure
```

## License

Distributed under the Eclipse Public License, the same as Clojure.
