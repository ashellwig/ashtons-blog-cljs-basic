(defproject ashtons-blog-cljs-basic "0.1.0-SNAPSHOT"
  :description "Frontend for my personal blog written in pure clojurescript"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :source-paths ["src/clj" "src/cljs"]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.7.145"]
                 [cljsjs/react "15.6.1-1"]
                 [cljsjs/react-dom "15.6.1-1"]
                 [cljs-react-material-ui "0.2.48"]]

  :plugins [[lein-cljsbuild "1.1.0"]]

  :cljsbuild {:builds
              [{:source-paths ["src/cljs"]

                :compiler {:output-to "resources/public/js/ashton.js"
                           :optimizations :whitespace
                           :pretty-print true}}]}

  :clean-targets ^{:protect false} [:target-path "resources/public/js/"])
