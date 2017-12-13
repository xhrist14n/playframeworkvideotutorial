
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vagrant/projects/play/playframeworkvideotutorial/P08Router/conf/routes
// @DATE:Wed Dec 13 00:47:07 UTC 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers.javascript {

  // @LINE:39
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseDefault(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def notFound: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Default.notFound",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "data"})
        }
      """
    )
  
    // @LINE:27
    def todo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Default.todo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "info"})
        }
      """
    )
  
    // @LINE:26
    def error: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Default.error",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "error"})
        }
      """
    )
  
    // @LINE:24
    def redirect: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Default.redirect",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "google"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseClientController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "client/all"})
        }
      """
    )
  
    // @LINE:16
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

  
    // @LINE:11
    def start: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.start",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "start"})
        }
      """
    )
  
    // @LINE:8
    def main: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.main",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:12
    def other: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.other",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "other"})
        }
      """
    )
  
    // @LINE:18
    def viewpage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.viewpage",
      """
        function(page0) {
        
          if (page0 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("other") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewpage"})
          }
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewpage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("page", page0))})
          }
        
        }
      """
    )
  
    // @LINE:10
    def test: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.test",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
        }
      """
    )
  
    // @LINE:9
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseFileController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def download: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FileController.download",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "file/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0)})
        }
      """
    )
  
  }


}
