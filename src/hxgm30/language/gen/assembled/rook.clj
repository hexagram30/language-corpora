(ns hxgm30.language.gen.assembled.rook
  "To use the languages defined here, you can do the following (see the `clj`
  namespace or the `repl` namespace in `dev-system` for how to create a system):
  ```
    (require '[hxgm30.language.gen.core :as gen]
             '[hxgm30.language.gen.assembled.core :as lang]
             '[hxgm30.language.gen.assembled.rook :as rook])
    (lang/paragraph (gen/create-content-generator system) rook/mux)
  ```
  Which will give output along the lines of the following:
  ```
    Whizz ji reira nou pebodana suran yabisebt. Dan
    aravan curassouronan mume potikertarp gun kerr
    aruppitten dep bem. Lu whoom ido ong sluckoo. Lue
    oya nyaazz hesh kedirayo. Pum settewaxth lias.
    Phes gegigupe whistramew losomepe irstendeng
    gesiweck wegetiop boo bur.
  ```")

(def supported-languages
  [:rookish
   :elani
   :jas
   :mux])

(def rookish
  {:english 3
   :hindi 1
   :japanese 2
   :spanish 2})


(def elani
  {:arabic 1
   :french 3
   :german 2
   :korean 1})

(def jas
  {:chinese 4
   :afrikaans 1
   :russian 2})

(def mux
  (merge rookish
         elani
         jas
         {:onomatopoetic 20}))