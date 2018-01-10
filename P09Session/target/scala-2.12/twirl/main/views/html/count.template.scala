
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object count extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(counter:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<h1>Counter!</h1>
  <p>
      """),_display_(/*6.8*/counter),format.raw/*6.15*/("""
  """),format.raw/*7.3*/("""</p>
  
""")))}),format.raw/*9.2*/("""
"""))
      }
    }
  }

  def render(counter:String): play.twirl.api.HtmlFormat.Appendable = apply(counter)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (counter) => apply(counter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Jan 10 01:20:01 PET 2018
                  SOURCE: /home/christian/projects/play/playframeworkvideotutorial/P09Session/app/views/count.scala.html
                  HASH: 0bc0d05fce2c9124f7ef6bc2388768248330147a
                  MATRIX: 948->1|1059->17|1087->20|1118->43|1157->45|1186->48|1242->79|1269->86|1298->89|1336->98
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|38->6|38->6|39->7|41->9
                  -- GENERATED --
              */
          