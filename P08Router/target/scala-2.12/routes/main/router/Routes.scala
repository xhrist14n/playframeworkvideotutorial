
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vagrant/projects/play/playframeworkvideotutorial/P08Router/conf/routes
// @DATE:Sun Dec 10 04:23:54 UTC 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:15
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:15
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """action""", """controllers.HomeController.action"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """alguien/""" + "$" + """name<[^/]+>""", """controllers.HomeController.alguien(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """resultado/""" + "$" + """codigo<[^/]+>""", """controllers.HomeController.resultado(codigo:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """redirigir/""" + "$" + """url<[^/]+>""", """controllers.HomeController.redirigir(url:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """temporal/""" + "$" + """url<[^/]+>""", """controllers.HomeController.temporal(url:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_action1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("action")))
  )
  private[this] lazy val controllers_HomeController_action1_invoker = createInvoker(
    HomeController_0.action,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "action",
      Nil,
      "GET",
      this.prefix + """action""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_alguien2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("alguien/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_alguien2_invoker = createInvoker(
    HomeController_0.alguien(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "alguien",
      Seq(classOf[String]),
      "GET",
      this.prefix + """alguien/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_resultado3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("resultado/"), DynamicPart("codigo", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_resultado3_invoker = createInvoker(
    HomeController_0.resultado(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "resultado",
      Seq(classOf[String]),
      "GET",
      this.prefix + """resultado/""" + "$" + """codigo<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_redirigir4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("redirigir/"), DynamicPart("url", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_redirigir4_invoker = createInvoker(
    HomeController_0.redirigir(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "redirigir",
      Seq(classOf[String]),
      "GET",
      this.prefix + """redirigir/""" + "$" + """url<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_temporal5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("temporal/"), DynamicPart("url", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_temporal5_invoker = createInvoker(
    HomeController_0.temporal(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "temporal",
      Seq(classOf[String]),
      "GET",
      this.prefix + """temporal/""" + "$" + """url<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_HomeController_action1_route(params@_) =>
      call { 
        controllers_HomeController_action1_invoker.call(HomeController_0.action)
      }
  
    // @LINE:8
    case controllers_HomeController_alguien2_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_HomeController_alguien2_invoker.call(HomeController_0.alguien(name))
      }
  
    // @LINE:9
    case controllers_HomeController_resultado3_route(params@_) =>
      call(params.fromPath[String]("codigo", None)) { (codigo) =>
        controllers_HomeController_resultado3_invoker.call(HomeController_0.resultado(codigo))
      }
  
    // @LINE:10
    case controllers_HomeController_redirigir4_route(params@_) =>
      call(params.fromPath[String]("url", None)) { (url) =>
        controllers_HomeController_redirigir4_invoker.call(HomeController_0.redirigir(url))
      }
  
    // @LINE:11
    case controllers_HomeController_temporal5_route(params@_) =>
      call(params.fromPath[String]("url", None)) { (url) =>
        controllers_HomeController_temporal5_invoker.call(HomeController_0.temporal(url))
      }
  
    // @LINE:15
    case controllers_Assets_versioned6_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
