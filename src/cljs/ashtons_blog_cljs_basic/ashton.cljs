(ns ashtons-blog-cljs-basic.ashton
  (:require [cljsjs.material-ui]
            [cljs-react-material-ui.core :as ui]
            [cljs-react-material-ui.icons :as ic]))

(ui/mui-theme-provider
 {:mui-theme (ui/get-mui-theme)}
 (ui/paper "Hello, world!"))

(ui/mui-theme-provider
 {:mui-theme (ui/get-mui-theme)
  {:palette
   {:primary1-color (ui/color :deep-orange-a100)}
   :raised-button
   {:primary-text-color (ui/color :light-black)
    :font-weight 200}}}
 (ui/raised-buton
  {:label "Click me"
   :primary true}))

(ui/mui-theme-provider
 {mui-theme (ui/get-mui-theme (aget js/MaterialUIStyles "DarkRawTheme"))}
 (ui/paper "Hello dark world"))
