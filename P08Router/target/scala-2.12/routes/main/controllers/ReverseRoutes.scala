
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vagrant/projects/play/playframeworkvideotutorial/P08Router/conf/routes
// @DATE:Sun Dec 10 04:23:54 UTC 2017

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

  
    // @LINE:10
    def redirigir(url:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "redirigir/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("url", url)))
    }
  
    // @LINE:8
    def alguien(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "alguien/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:7
    def action(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "action")
    }
  
    // @LINE:11
    def temporal(url:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "temporal/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("url", url)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:9
    def resultado(codigo:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "resultado/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("codigo", codigo)))
    }
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
