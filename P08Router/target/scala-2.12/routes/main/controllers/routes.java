
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vagrant/projects/play/playframeworkvideotutorial/P08Router/conf/routes
// @DATE:Tue Dec 12 23:49:57 UTC 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseFileController FileController = new controllers.ReverseFileController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseClientController ClientController = new controllers.ReverseClientController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseFileController FileController = new controllers.javascript.ReverseFileController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseClientController ClientController = new controllers.javascript.ReverseClientController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
