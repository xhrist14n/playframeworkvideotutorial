
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/christian/projects/play/playframeworkvideotutorial/P08Router/conf/routes
// @DATE:Fri Dec 29 20:43:09 PET 2017


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
