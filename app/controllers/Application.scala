package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}
import org.webjars.play.WebJarsUtil

class Application @Inject() (webJarsUtil: WebJarsUtil, c: ControllerComponents) extends AbstractController(c) {

  val index = Action{
    Ok(views.html.index(webJarsUtil))
  }

}
