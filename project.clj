(defproject booking-server "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [
                 [org.clojure/clojure "1.9.0"]
                 [javax.servlet/servlet-api "2.5"]
                 [ring/ring-core "1.6.3"]
                 [ring-server "0.5.0"]
                 [org.clojure/data.json "0.2.6"]
                 [org.postgresql/postgresql "42.1.4"]
                 [com.layerware/hugsql "0.4.8"]
                 ]
  :plugins [[lein-ring "0.12.1"]]
  :ring {
         :handler booking-server.handler/app
         :init    booking-server.handler/init
         :destroy booking-server.handler/destroy
         }
  :profiles
  {
   :uberjar    {:aot :all}
   :production {
                :ring {
                       :open-browser? false, :stacktraces? false, :auto-reload? false}}
   :dev        {
                :dependencies [
                               [ring-mock "0.1.5"]
                               [ring/ring-devel "1.6.3"]
                               ]}}
  )