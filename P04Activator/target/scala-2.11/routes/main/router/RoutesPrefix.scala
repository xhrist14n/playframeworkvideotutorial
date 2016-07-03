
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/guest/play/classes/P04Activator/conf/routes
// @DATE:Thu May 19 16:28:01 PET 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
