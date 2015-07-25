
import play.api.GlobalSettings
import play.api.mvc.Results._
import play.api.mvc.{RequestHeader, Result}

import scala.concurrent.Future

/**
 * Created by ka-son on 7/25/15.
 */
object Global extends GlobalSettings {

  override def onError(request: RequestHeader, ex: Throwable) = {
    Future.successful(InternalServerError("Internal server error"))
  }

  override def onHandlerNotFound(request: RequestHeader): Future[Result] = {
    Future.successful(NotFound("Not found"))
  }

  override def onBadRequest(request: RequestHeader, error: String) = {
    Future.successful(BadRequest("Bad Request: " + error))
  }

}
