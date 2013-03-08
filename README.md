# zmqure

clojure zmq server

## Installing "zmq.jar" into a local maven repo

"zmq.jar" will be created as a part of zmq Java bindings [install](http://www.zeromq.org/bindings:java). 

Using a path to this jar, install it to the local maven repo, so "mr. lein" can see it:

```bash
mvn install:install-file -DgroupId=zmq \
-DartifactId=zmq \
-Dversion=2.1.9 \
-Dfile=<PATH_TO>/zmq-2.1.9.jar \
-Dpackaging=jar \
-DgeneratePom=true
```

## Exporting LD_LIBRARY_PATH

Before running the server, `LD_LIBRARY_PATH` needs to be exported to let the server know where to find zmq C++ libs:
```bash
export LD_LIBRARY_PATH=/usr/local/lib
```

## Usage

```bash
lein run -m zmqure
```
example:

```bash
$ lein run -m zmqure                                                          
zmqure is up and listening on 4242
```

## License

Distributed under the Eclipse Public License, the same as Clojure.
