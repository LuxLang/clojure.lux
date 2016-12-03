(defproject com.github.luxlang/clojure.lux "0.1.0-SNAPSHOT"
  :description "Clojure interop layer for Lux."
  :url "https://github.com/LuxLang/clojure.lux"
  :license {:name "Mozilla Public License (Version 2.0)"
            :url "https://www.mozilla.org/en-US/MPL/2.0/"}
  :plugins [[com.github.luxlang/lein-luxc "0.5.0-SNAPSHOT"]]
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :source-paths ["source"]
  :test-paths ["test"]
  :lux {:tests "tests"}
  :repositories [["snapshots" "https://oss.sonatype.org/content/repositories/snapshots/"]
                 ["releases" "https://oss.sonatype.org/service/local/staging/deploy/maven2/"]]
  :deploy-repositories [["releases" {:url "https://oss.sonatype.org/service/local/staging/deploy/maven2/"
                                     :creds :gpg}]
                        ["snapshots" {:url "https://oss.sonatype.org/content/repositories/snapshots/"
                                      :creds :gpg}]]
  :pom-addition [:developers [:developer {:id "eduardoejp"}
                              [:name "Eduardo Julian"]
                              [:url "https://github.com/eduardoejp"]]]
  )
