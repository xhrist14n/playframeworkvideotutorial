
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vagrant/projects/play/playframeworkvideotutorial/P08Router/conf/routes
// @DATE:Sun Dec 10 04:23:54 UTC 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def redirigir: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.redirigir",
      """
        function(url0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "redirigir/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("url", url0))})
        }
      """
    )
  
    // @LINE:8
    def alguien: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.alguien",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "alguien/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
    // @LINE:7
    def action: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.action",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "action"})
        }
      """
    )
  
    // @LINE:11
    def temporal: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.temporal",
      """
        function(url0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "temporal/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("url", url0))})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:9
    def resultado: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.resultado",
      """
        function(codigo0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resultado/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("codigo", codigo0))})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
