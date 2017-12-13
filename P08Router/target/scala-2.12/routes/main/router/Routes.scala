
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vagrant/projects/play/playframeworkvideotutorial/P08Router/conf/routes
// @DATE:Tue Dec 12 23:49:57 UTC 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  HomeController_1: controllers.HomeController,
  // @LINE:10
  ClientController_0: controllers.ClientController,
  // @LINE:14
  FileController_3: controllers.FileController,
  // @LINE:26
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    HomeController_1: controllers.HomeController,
    // @LINE:10
    ClientController_0: controllers.ClientController,
    // @LINE:14
    FileController_3: controllers.FileController,
    // @LINE:26
    Assets_2: controllers.Assets
  ) = this(errorHandler, HomeController_1, ClientController_0, FileController_3, Assets_2, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, ClientController_0, FileController_3, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.main()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client/all""", """controllers.ClientController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client/""" + "$" + """id<[^/]+>""", """controllers.ClientController.show(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """file/""" + "$" + """name<.+>""", """controllers.FileController.download(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_HomeController_main0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_main0_invoker = createInvoker(
    HomeController_1.main(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "main",
      Nil,
      "GET",
      this.prefix + """""",
      """urls for app without comments ...""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ClientController_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client/all")))
  )
  private[this] lazy val controllers_ClientController_list1_invoker = createInvoker(
    ClientController_0.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientController",
      "list",
      Nil,
      "GET",
      this.prefix + """client/all""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ClientController_show2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClientController_show2_invoker = createInvoker(
    ClientController_0.show(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """client/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_FileController_download3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("file/"), DynamicPart("name", """.+""",false)))
  )
  private[this] lazy val controllers_FileController_download3_invoker = createInvoker(
    FileController_3.download(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FileController",
      "download",
      Seq(classOf[String]),
      "GET",
      this.prefix + """file/""" + "$" + """name<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
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
  
    // @LINE:8
    case controllers_HomeController_main0_route(params@_) =>
      call { 
        controllers_HomeController_main0_invoker.call(HomeController_1.main())
      }
  
    // @LINE:10
    case controllers_ClientController_list1_route(params@_) =>
      call { 
        controllers_ClientController_list1_invoker.call(ClientController_0.list())
      }
  
    // @LINE:12
    case controllers_ClientController_show2_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ClientController_show2_invoker.call(ClientController_0.show(id))
      }
  
    // @LINE:14
    case controllers_FileController_download3_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_FileController_download3_invoker.call(FileController_3.download(name))
      }
  
    // @LINE:26
    case controllers_Assets_versioned4_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
