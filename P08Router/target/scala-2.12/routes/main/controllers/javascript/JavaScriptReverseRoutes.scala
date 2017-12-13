
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vagrant/projects/play/playframeworkvideotutorial/P08Router/conf/routes
// @DATE:Tue Dec 12 23:49:57 UTC 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers.javascript {

  // @LINE:14
  class ReverseFileController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def download: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FileController.download",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "file/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0)})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseClientController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "client/all"})
        }
      """
    )
  
    // @LINE:12
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientController.show",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "client/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def main: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.main",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
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
