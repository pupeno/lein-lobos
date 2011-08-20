;;;; Copyright © 2011 José Pablo Fernández Silva
(ns leiningen.lobos
  (:use [leiningen.help :only (help-for)]
        [leiningen.compile :only [eval-in-project]]))

(defn migrate [project]
  (eval-in-project project
    `(do
       (require 'lobos.config 'lobos.core)
       (lobos.core/run))
    nil nil '(require 'lobos.config 'lobos.core)))

(defn rollback [project]
  (eval-in-project project
    `(do
       (require 'lobos.config 'lobos.core)
       (lobos.core/rollback))
    nil nil '(require 'lobos.config 'lobos.core)))

(defn lobos
  "Run Lobos migrations."
  {:help-arglists '([migrate rollback])
   :subtasks [#'migrate #'rollback]}
  ([] (println (help-for "lobos")))
  ([project] (println (help-for "lobos")))
  ([project subtask]
    (case subtask
      "migrate" (leiningen.lobos/migrate project)
      "rollback" (leiningen.lobos/rollback project)
      (println (help-for "lobos")))))