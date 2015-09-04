package controllers

import play.api.mvc._

/**
 * Created by darioalessandro on 9/3/15.
 */
class ResumeController extends Controller {

  def index = Action {
    Ok(views.html.resume())
  }

}
