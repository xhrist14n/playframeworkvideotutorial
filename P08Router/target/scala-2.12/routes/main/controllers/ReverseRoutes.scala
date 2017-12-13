
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vagrant/projects/play/playframeworkvideotutorial/P08Router/conf/routes
// @DATE:Wed Dec 13 00:47:07 UTC 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers {

  // @LINE:39
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:24
  class ReverseDefault(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def notFound(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "data")
    }
  
    // @LINE:27
    def todo(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "info")
    }
  
    // @LINE:26
    def error(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "error")
    }
  
    // @LINE:24
    def redirect(): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("to", "https://www.google.com/"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "google")
    }
  
  }

  // @LINE:14
  class ReverseClientController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "client/all")
    }
  
    // @LINE:16
    def show(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "client/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
  }

  // @LINE:8
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def start(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "start")
    }
  
    // @LINE:8
    def main(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:12
    def other(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "other")
    }
  
    // @LINE:18
    def viewpage(page:String): Call = {
    
      (page: @unchecked) match {
      
        // @LINE:18
        case (page) if page == "other" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("page", "other"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "viewpage")
      
        // @LINE:19
        case (page)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "viewpage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("page", page)))
      
      }
    
    }
  
    // @LINE:10
    def test(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "test")
    }
  
    // @LINE:9
    def home(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "home")
    }
  
  }

  // @LINE:21
  class ReverseFileController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def download(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "file/" + implicitly[play.api.mvc.PathBindable[String]].unbind("name", name))
    }
  
  }


}
