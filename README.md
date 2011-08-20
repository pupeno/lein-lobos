# lein-lobos

[Leiningen](https://github.com/technomancy/leiningen) plugin for running
[Lobos](http://budu.github.com/lobos/) commands.

To install, run

```shell
lein plugin install lein-lobos 0.8.0-SNAPSHOT
```

replacing 0.8.0-SNAPSHOT for [the version you
want](http://clojars.org/lein-lobos). The intention is to keep it in sync with
Lobos itself so you should use the same version of both.

After that you can simply run the commands like:

```shell
lein lobos migrate
```

and

```shell
lein lobos rollback
```

## License

Copyright © 2011 José Pablo Fernández Silva

Distributed under the Eclipse Public License, the same as Clojure.
