
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/seeddddd/conf/routes
// @DATE:Thu Nov 23 17:16:26 GMT 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def about: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.about",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
        }
      """
    )
  
    // @LINE:7
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
