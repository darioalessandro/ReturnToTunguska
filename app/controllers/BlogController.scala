package controllers

import play.api._
import play.api.mvc._

/**
 * Created by darioalessandro on 9/3/15.
 */

class BlogController extends Controller {

  def index = Action {
    Ok(views.html.blog())
  }

}
