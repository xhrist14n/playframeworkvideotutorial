
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/christian/projects/play/playframeworkvideotutorial/P09Session/conf/routes
// @DATE:Wed Jan 10 01:30:42 PET 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def start(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "start")
    }
  
    // @LINE:8
    def counter(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "counter")
    }
  
    // @LINE:10
    def remove(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "remove")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:9
    def clear(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clear")
    }
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
