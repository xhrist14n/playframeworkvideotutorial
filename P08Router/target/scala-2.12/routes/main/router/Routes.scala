
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/christian/projects/play/playframeworkvideotutorial/P08Router/conf/routes
// @DATE:Fri Dec 29 20:43:09 PET 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  HomeController_0: controllers.HomeController,
  // @LINE:14
  ClientController_2: controllers.ClientController,
  // @LINE:21
  FileController_4: controllers.FileController,
  // @LINE:24
  Default_1: controllers.Default,
  // @LINE:39
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    HomeController_0: controllers.HomeController,
    // @LINE:14
    ClientController_2: controllers.ClientController,
    // @LINE:21
    FileController_4: controllers.FileController,
    // @LINE:24
    Default_1: controllers.Default,
    // @LINE:39
    Assets_3: controllers.Assets
  ) = this(errorHandler, HomeController_0, ClientController_2, FileController_4, Default_1, Assets_3, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, ClientController_2, FileController_4, Default_1, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.main()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.HomeController.home()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test""", """controllers.HomeController.test()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """start""", """controllers.HomeController.start()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """other""", """controllers.HomeController.other()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client/all""", """controllers.ClientController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client/""" + "$" + """id<[^/]+>""", """controllers.ClientController.show(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewpage""", """controllers.HomeController.viewpage(page:String = "other")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewpage/""" + "$" + """page<[^/]+>""", """controllers.HomeController.viewpage(page:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """file/""" + "$" + """name<.+>""", """controllers.FileController.download(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """google""", """controllers.Default.redirect(to:String = "https://www.google.com/")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """data""", """controllers.Default.notFound"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """error""", """controllers.Default.error"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """info""", """controllers.Default.todo"""),
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
    HomeController_0.main(),
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

  // @LINE:9
  private[this] lazy val controllers_HomeController_home1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_HomeController_home1_invoker = createInvoker(
    HomeController_0.home(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "home",
      Nil,
      "GET",
      this.prefix + """home""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_test2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test")))
  )
  private[this] lazy val controllers_HomeController_test2_invoker = createInvoker(
    HomeController_0.test(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "test",
      Nil,
      "GET",
      this.prefix + """test""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_start3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("start")))
  )
  private[this] lazy val controllers_HomeController_start3_invoker = createInvoker(
    HomeController_0.start(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "start",
      Nil,
      "GET",
      this.prefix + """start""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_other4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("other")))
  )
  private[this] lazy val controllers_HomeController_other4_invoker = createInvoker(
    HomeController_0.other(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "other",
      Nil,
      "GET",
      this.prefix + """other""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ClientController_list5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client/all")))
  )
  private[this] lazy val controllers_ClientController_list5_invoker = createInvoker(
    ClientController_2.list(),
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

  // @LINE:16
  private[this] lazy val controllers_ClientController_show6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClientController_show6_invoker = createInvoker(
    ClientController_2.show(fakeValue[Integer]),
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

  // @LINE:18
  private[this] lazy val controllers_HomeController_viewpage7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewpage")))
  )
  private[this] lazy val controllers_HomeController_viewpage7_invoker = createInvoker(
    HomeController_0.viewpage(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "viewpage",
      Seq(classOf[String]),
      "GET",
      this.prefix + """viewpage""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_viewpage8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewpage/"), DynamicPart("page", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_viewpage8_invoker = createInvoker(
    HomeController_0.viewpage(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "viewpage",
      Seq(classOf[String]),
      "GET",
      this.prefix + """viewpage/""" + "$" + """page<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_FileController_download9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("file/"), DynamicPart("name", """.+""",false)))
  )
  private[this] lazy val controllers_FileController_download9_invoker = createInvoker(
    FileController_4.download(fakeValue[String]),
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

  // @LINE:24
  private[this] lazy val controllers_Default_redirect10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("google")))
  )
  private[this] lazy val controllers_Default_redirect10_invoker = createInvoker(
    Default_1.redirect(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Default",
      "redirect",
      Seq(classOf[String]),
      "GET",
      this.prefix + """google""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Default_notFound11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("data")))
  )
  private[this] lazy val controllers_Default_notFound11_invoker = createInvoker(
    Default_1.notFound,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Default",
      "notFound",
      Nil,
      "GET",
      this.prefix + """data""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Default_error12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("error")))
  )
  private[this] lazy val controllers_Default_error12_invoker = createInvoker(
    Default_1.error,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Default",
      "error",
      Nil,
      "GET",
      this.prefix + """error""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Default_todo13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("info")))
  )
  private[this] lazy val controllers_Default_todo13_invoker = createInvoker(
    Default_1.todo,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Default",
      "todo",
      Nil,
      "GET",
      this.prefix + """info""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_Assets_versioned14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned14_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_HomeController_main0_invoker.call(HomeController_0.main())
      }
  
    // @LINE:9
    case controllers_HomeController_home1_route(params@_) =>
      call { 
        controllers_HomeController_home1_invoker.call(HomeController_0.home())
      }
  
    // @LINE:10
    case controllers_HomeController_test2_route(params@_) =>
      call { 
        controllers_HomeController_test2_invoker.call(HomeController_0.test())
      }
  
    // @LINE:11
    case controllers_HomeController_start3_route(params@_) =>
      call { 
        controllers_HomeController_start3_invoker.call(HomeController_0.start())
      }
  
    // @LINE:12
    case controllers_HomeController_other4_route(params@_) =>
      call { 
        controllers_HomeController_other4_invoker.call(HomeController_0.other())
      }
  
    // @LINE:14
    case controllers_ClientController_list5_route(params@_) =>
      call { 
        controllers_ClientController_list5_invoker.call(ClientController_2.list())
      }
  
    // @LINE:16
    case controllers_ClientController_show6_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ClientController_show6_invoker.call(ClientController_2.show(id))
      }
  
    // @LINE:18
    case controllers_HomeController_viewpage7_route(params@_) =>
      call(Param[String]("page", Right("other"))) { (page) =>
        controllers_HomeController_viewpage7_invoker.call(HomeController_0.viewpage(page))
      }
  
    // @LINE:19
    case controllers_HomeController_viewpage8_route(params@_) =>
      call(params.fromPath[String]("page", None)) { (page) =>
        controllers_HomeController_viewpage8_invoker.call(HomeController_0.viewpage(page))
      }
  
    // @LINE:21
    case controllers_FileController_download9_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_FileController_download9_invoker.call(FileController_4.download(name))
      }
  
    // @LINE:24
    case controllers_Default_redirect10_route(params@_) =>
      call(Param[String]("to", Right("https://www.google.com/"))) { (to) =>
        controllers_Default_redirect10_invoker.call(Default_1.redirect(to))
      }
  
    // @LINE:25
    case controllers_Default_notFound11_route(params@_) =>
      call { 
        controllers_Default_notFound11_invoker.call(Default_1.notFound)
      }
  
    // @LINE:26
    case controllers_Default_error12_route(params@_) =>
      call { 
        controllers_Default_error12_invoker.call(Default_1.error)
      }
  
    // @LINE:27
    case controllers_Default_todo13_route(params@_) =>
      call { 
        controllers_Default_todo13_invoker.call(Default_1.todo)
      }
  
    // @LINE:39
    case controllers_Assets_versioned14_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned14_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
